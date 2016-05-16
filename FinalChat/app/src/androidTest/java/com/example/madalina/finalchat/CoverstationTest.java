package com.example.madalina.finalchat;


import android.test.ActivityInstrumentationTestCase2;;
import android.test.UiThreadTest;
import android.widget.EditText;


/**
 * Created by madalina on 01.05.2016.
 */
public class CoverstationTest  extends ActivityInstrumentationTestCase2<ConversationActivity> {
    public CoverstationTest(Class<ConversationActivity> activityClass) {
        super(activityClass);
    }

    @UiThreadTest
    public void testInputText() throws Exception {
        ConversationActivity activity = getActivity();
        final EditText text = (EditText) activity.findViewById(R.id.textToSend);

        activity.runOnUiThread(new Runnable() {
            public void run() {
                text.setText("Mesaj test");
            }
        });

        // Check if the EditText is properly set:
        assertEquals("Incorect", "Mesaj test 1", text.getText().toString());
    }
}

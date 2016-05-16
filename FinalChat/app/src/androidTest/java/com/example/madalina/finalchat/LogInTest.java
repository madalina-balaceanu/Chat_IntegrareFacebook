package com.example.madalina.finalchat;

import android.test.ActivityInstrumentationTestCase2;
import android.test.UiThreadTest;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by madalina on 01.05.2016.
 */
public class LogInTest extends ActivityInstrumentationTestCase2<LoginActivity> {
    public LogInTest(Class<LoginActivity> activityClass) {
        super(activityClass);
    }

    @UiThreadTest
    public void testButton() throws Exception {
        LoginActivity activity = getActivity();

        final Button logIn = (Button) activity.findViewById(R.id.login_button);

        activity.runOnUiThread(new Runnable() {
            public void run() {

            }
        });

        // Check if the EditText is properly set:
        //assertEquals("Incorect", "Mesaj test 1", text.getText().toString());
    }
}

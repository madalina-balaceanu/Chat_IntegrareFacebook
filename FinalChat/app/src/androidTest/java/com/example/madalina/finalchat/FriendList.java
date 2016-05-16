package com.example.madalina.finalchat;

import android.test.ActivityInstrumentationTestCase2;
import android.test.UiThreadTest;
import android.widget.ListView;

/**
 * Created by madalina on 01.05.2016.
 */
public class FriendList extends ActivityInstrumentationTestCase2<FriendsListActivity> {
    public FriendList(Class<FriendsListActivity> activityClass) {
        super(activityClass);
    }

    @UiThreadTest
    public void testList() throws Exception {
        FriendsListActivity activity = getActivity();
        ListView listView = (ListView) activity.findViewById(R.id.listView);

        assertEquals(listView.getCount() > 0 , true);

    }
}

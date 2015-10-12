package com.example.aaron.talker;

import android.app.Activity;
import android.os.Bundle;
import android.app.ListFragment;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;


import com.example.aaron.talker.dummy.DummyContent;

import java.util.ArrayList;

public class DeviceListFragment extends ListFragment {

    private ArrayList<String> mDeviceNames;

    /**
     * Mandatory empty constructor for the fragment manager to instantiate the
     * fragment (e.g. upon screen orientation changes).
     */
    public DeviceListFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Bundle savedData = this.getArguments();

        mDeviceNames = savedData.getStringArrayList("mDeviceList");

        setListAdapter(new ArrayAdapter<>(getActivity(),
                android.R.layout.simple_list_item_1,  mDeviceNames));

    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);

    }

}

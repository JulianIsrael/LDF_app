package com.ntv.ldf_app;

import android.os.Bundle;

import android.support.v4.view.ViewPager;


import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;

import android.support.annotation.Nullable;
import android.support.v13.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.ListView;

import com.ntv.ldf_app.Adapters.ScheduleAdapter;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/**
 * Created by Jose on 3/14/2015.
 */
public class LDFScheduleContent extends Fragment {

    private static final String ARG_SECTION_NUMBER = "section_number";
    private ListView mListView;
    private ExpandableListView mExpandableListView;
    ScheduleAdapter mWeeklyAdapter;

    public static LDFScheduleContent newInstance(int sectionNumber) {
        LDFScheduleContent fragment = new LDFScheduleContent();
        Bundle args = new Bundle();
        args.putInt(ARG_SECTION_NUMBER, sectionNumber);
        fragment.setArguments(args);
        return fragment;
    }

    public LDFScheduleContent() {

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View rootView = inflater.inflate(R.layout.fragment_schedule_content, container, false);

        mListView = (ListView) rootView.findViewById(R.id.schedule_listview);
        Bundle arg = getArguments();
       int index = arg.getInt(ARG_SECTION_NUMBER);


        mWeeklyAdapter = new ScheduleAdapter(index, getActivity());
        mListView.setAdapter(mWeeklyAdapter);


        return rootView;
    }
}

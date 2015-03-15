package com.ntv.ldf_app;

import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;

import android.support.annotation.Nullable;
import android.support.v13.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/**
 * Created by Jose on 3/14/2015.
 */
public class LDFScheduleFragment extends Fragment {

    private static final String ARG_SECTION_NUMBER = "section_number";

    ViewPager mViewPager;
    SectionsPagerAdapter mSectionsPagerAdapter;

    public LDFScheduleFragment() {
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
      //  super.onCreateView(inflater, container, savedInstanceState);
        View rootView = inflater.inflate(R.layout.fragment_schedule, container, false);



        mSectionsPagerAdapter = new SectionsPagerAdapter(getFragmentManager());
        // mSectionsPagerAdapter.notifyDataSetChanged();

        // Set up the ViewPager with the sections adapter.
        mViewPager = (ViewPager) rootView.findViewById(R.id.pager);
        mViewPager.setAdapter(mSectionsPagerAdapter);
        mViewPager.setOffscreenPageLimit(10);

        // When swiping between different sections, select the corresponding
        // tab. We can also use ActionBar.Tab#select() to do this if we have
        // a reference to the Tab.
        mViewPager.setOnPageChangeListener(new ViewPager.SimpleOnPageChangeListener() {
            @Override
            public void onPageSelected(int position) {
              /*  actionBar.setSelectedNavigationItem(position);*/
            }
        });


        return rootView;
    }

    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        private Map<String, LDFScheduleContent> mPageReferenceMap = new HashMap<String, LDFScheduleContent>();

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        public LDFScheduleContent getFragment(String key) {

            return mPageReferenceMap.get(key);
        }

        private  String makeFragmentName(int viewId, int index) {
            return "android:switcher:" + viewId + ":" + index;
        }

        @Override
        public Fragment getItem(int position) {
            // getItem is called to instantiate the fragment for the given page.
            // Return a PlaceholderFragment (defined as a static inner class below).

            String tag = makeFragmentName(mViewPager.getId(),(int) getItemId(position));
            LDFScheduleContent ldfScheduleFragment =   LDFScheduleContent.newInstance(position + 1);

            mPageReferenceMap.put(tag, ldfScheduleFragment);

            return  ldfScheduleFragment;

        }

        public @Nullable
        Fragment getFragmentForPosition(int position)
        {
            String tag = makeFragmentName(mViewPager.getId(),(int) getItemId(position));
            Fragment fragment = getFragmentManager().findFragmentByTag(tag);
            return fragment;
        }


        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public int getCount() {
            // Show 10 total pages.
            return 10;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            Locale l = Locale.getDefault();
            switch (position) {
                case 0:
                    return getString(R.string.title_section1).toUpperCase(l);
                case 1:
                    return getString(R.string.title_section2).toUpperCase(l);
                case 2:
                    return getString(R.string.title_section3).toUpperCase(l);
                case 3:
                    return getString(R.string.title_section4).toUpperCase(l);
                case 4:
                    return getString(R.string.title_section5).toUpperCase(l);
                case 5:
                    return getString(R.string.title_section6).toUpperCase(l);
                case 6:
                    return getString(R.string.title_section7).toUpperCase(l);
                case 7:
                    return getString(R.string.title_section8).toUpperCase(l);
                case 8:
                    return getString(R.string.title_section9).toUpperCase(l);
                case 9:
                    return getString(R.string.title_section10).toUpperCase(l);
            }
            return null;
        }
    }

}

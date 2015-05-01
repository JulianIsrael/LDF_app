package com.ntv.ldf_app;

import android.app.ActionBar;
import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;
import android.support.v13.app.FragmentPagerAdapter;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;


public class LDFActivity extends ActionBarActivity implements ActionBar.TabListener
{
//   static LDFScheduleFragment scheduleFragment ;
   static LDFListFragment teamListFragment  = LDFListFragment.newInstance() ;
static LayoutInflater inflater;
    private static final String ARG_SECTION_NUMBER = "section_number";

    ViewPager mViewPager;
    SectionsPagerAdapter mSectionsPagerAdapter;
    private com.melnykov.fab.FloatingActionButton newBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ldf);



        mSectionsPagerAdapter = new SectionsPagerAdapter(getFragmentManager());
        // mSectionsPagerAdapter.notifyDataSetChanged();

        // Set up the ViewPager with the sections adapter.
        mViewPager = (ViewPager) findViewById(R.id.pager);
        mViewPager.setAdapter(mSectionsPagerAdapter);
        mViewPager.setOffscreenPageLimit(21);


        newBtn = (com.melnykov.fab.FloatingActionButton) findViewById(R.id.fab);

        // When swiping between different sections, select the corresponding
        // tab. We can also use ActionBar.Tab#select() to do this if we have
        // a reference to the Tab.
        mViewPager.setOnPageChangeListener(new ViewPager.SimpleOnPageChangeListener() {
            @Override
            public void onPageSelected(int position) {
              /*  actionBar.setSelectedNavigationItem(position);*/
            }
        });




        /*
        teamListFragment = new LDFListFragment();
        scheduleFragment = new LDFScheduleFragment();

       FragmentTransaction mFragmentTransaction = getFragmentManager().beginTransaction();
   //     mFragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        mFragmentTransaction.add(android.R.id.content, scheduleFragment, "schedule");
        mFragmentTransaction.addToBackStack(null).commit();
*/

    /*   final ActionBar actionBar = getActionBar();
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);*/


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_ld, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onTabSelected(ActionBar.Tab tab, FragmentTransaction ft) {
        // When the given tab is selected, switch to the corresponding page in
        // the ViewPager.
     //   mViewPager.setCurrentItem(tab.getPosition());

    }

    @Override
    public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction ft) {

    }

    @Override
    public void onTabReselected(ActionBar.Tab tab, FragmentTransaction ft) {

    }

   @Override
    public void onBackPressed(){
        FragmentManager fm = getFragmentManager();
        if (fm.getBackStackEntryCount() > 0) {
            Log.i("MainActivity", "popping backstack");
            fm.popBackStack();
        } else {
            Log.i("MainActivity", "nothing on backstack, calling super");
            super.onBackPressed();
        }
    }

    public void onButtonClicked(View view){



        FragmentTransaction mFragmentTransaction = getFragmentManager().beginTransaction();
        mFragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        mFragmentTransaction.add(android.R.id.content, teamListFragment, "teamList").addToBackStack(null).commit();



    }

 /*   @Override
    protected void onStop() {
        clearBackStack();
        super.onStop();
    }*/

    private void clearBackStack() {
        FragmentManager manager = getFragmentManager();
        if (manager.getBackStackEntryCount() > 0) {
            FragmentManager.BackStackEntry first = manager.getBackStackEntryAt(0);
            manager.popBackStack(first.getId(), FragmentManager.POP_BACK_STACK_INCLUSIVE);
        }
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
        public android.app.Fragment getItem(int position) {
            // getItem is called to instantiate the fragment for the given page.
            // Return a PlaceholderFragment (defined as a static inner class below).

            String tag = makeFragmentName(mViewPager.getId(),(int) getItemId(position));
            LDFScheduleContent ldfScheduleContent =   LDFScheduleContent.newInstance(position + 1);

            mPageReferenceMap.put(tag, ldfScheduleContent);

            return  ldfScheduleContent;

        }

        public @Nullable
        android.app.Fragment getFragmentForPosition(int position)
        {
            String tag = makeFragmentName(mViewPager.getId(),(int) getItemId(position));
            android.app.Fragment fragment = getFragmentManager().findFragmentByTag(tag);
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

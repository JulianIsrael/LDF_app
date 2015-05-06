package com.ntv.ldf_app;


import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ntv.ldf_app.AppConstants.AppConstant;
import com.ntv.ldf_app.ExpandingListView.CustomArrayAdapter;
import com.ntv.ldf_app.ExpandingListView.ExpandableListItem;
import com.ntv.ldf_app.ExpandingListView.ExpandingListView;
import com.ntv.ldf_app.Schedule.Team;

import java.util.ArrayList;
import java.util.List;


/**
 * A placeholder fragment containing a simple view.
 */
public class LDFListFragment extends Fragment {

    public static LDFListFragment newInstance() {
        LDFListFragment fragment = new LDFListFragment();
        Bundle args = new Bundle();
       args.putInt("LIST", 1);
        fragment.setArguments(args);
        return fragment;
    }

    private final int CELL_DEFAULT_HEIGHT = 200;
    private final int NUM_OF_CELLS = 11;

    private static ExpandingListView mListView;

  //  private static ExpandableListItem[] mExpandableListItem = new ExpandableListItem[AppConstant.mTeamArrayList.length];
    public LDFListFragment() {
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_ld, container, false);

       List<ExpandableListItem> mData = new ArrayList<ExpandableListItem>();

        for (int i = 0; i < NUM_OF_CELLS; i++) {
            Team myTeam = new Team(i);
            mData.add(new ExpandableListItem(AppConstant.mTeamArrayList[i][1], AppConstant.mImageList[i],
                    CELL_DEFAULT_HEIGHT, myTeam.onCreateMatchListString()));
        }

         CustomArrayAdapter adapter = new CustomArrayAdapter(getActivity(), R.layout.list_view_item, mData);

        mListView = (ExpandingListView) view.findViewById(R.id.main_list_view);
        mListView.setAdapter(adapter);
        mListView.setDivider(null);
      /*  mListView.setFastScrollStyle();*/

        return view;
    }


}

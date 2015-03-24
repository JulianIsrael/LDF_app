package com.ntv.ldf_app.Schedule;

import com.ntv.ldf_app.AppConstants.AppConstant;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Jose on 3/15/2015.
 */
public class WeeklySchedule {

    private  List<Match> mWeeklyMatch;
    private int mWeeklyScheduleID;

    public WeeklySchedule(int weeklyScheduleID) {
        this.mWeeklyScheduleID = weeklyScheduleID;
        onCreateMatchList();
        onCreateSchedule();
    }

    public int getMweeklyScheduleID() {
        return mWeeklyScheduleID;
    }

    public List<Match> getmWeeklyMatch() {
        return mWeeklyMatch;
    }

    public void setmWeeklyMatch(List<Match> mWeeklyMatch) {
        this.mWeeklyMatch = mWeeklyMatch;
    }

    // obejct functions

    public Match getMatch( int index) {
        return mWeeklyMatch.get(index);
    }

    public void setMatch(Match match) {
        this.mWeeklyMatch.add(match);
    }

    public void onCreateMatchList(){
        List<Match> xMatch = new ArrayList<Match>();
        setmWeeklyMatch(xMatch);
    }

    private void onCreateSchedule(){
        for (int i = 0; i < AppConstant.mMatchArrayList.length; i++) {
            if( AppConstant.mMatchArrayList[i][0][0] == mWeeklyScheduleID){
                 for (int j = 0; j < AppConstant.mMatchArrayList[i][j].length; j++) {
                     Team team1 = new Team(AppConstant.mMatchArrayList[i][j][2]);
                     Team team2 = new Team(AppConstant.mMatchArrayList[i][j][3]);
                     Match myMatch = new Match(mWeeklyScheduleID, team1, team2);
               setMatch(myMatch);
                    }
            }
        }
    }


    @Override
    public String toString() {
        return "WeeklySchedule{" +
                "mWeeklyMatch=" + mWeeklyMatch +
                '}';
    }
}

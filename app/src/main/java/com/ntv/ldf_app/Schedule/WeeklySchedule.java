package com.ntv.ldf_app.Schedule;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Jose on 3/15/2015.
 */
public class WeeklySchedule {

    public  List<Match> mWeeklyMatch;
    public int mweeklyScheduleID;

    public WeeklySchedule(List<Match> mWeeklyMatch) {
        this.mWeeklyMatch = mWeeklyMatch;
    }

    public int getMweeklyScheduleID() {
        return mweeklyScheduleID;
    }

    public void setMweeklyScheduleID(int mweeklyScheduleID) {
        this.mweeklyScheduleID = mweeklyScheduleID;
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




    @Override
    public String toString() {
        return "WeeklySchedule{" +
                "mWeeklyMatch=" + mWeeklyMatch +
                '}';
    }
}

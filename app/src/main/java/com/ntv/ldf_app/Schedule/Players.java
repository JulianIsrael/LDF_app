package com.ntv.ldf_app.Schedule;

/**
 * Created by Jose on 3/15/2015.
 */
public class Players {

    String mPlayerName;
    int mPlayerNum, mTeamID;

    public Players(String mPlayerName, int mPlayerNum, int mTeamID) {
        this.mPlayerName = mPlayerName;
        this.mPlayerNum = mPlayerNum;
        this.mTeamID = mTeamID;
    }

    public int getmTeamID() {
        return mTeamID;
    }

    public void setmTeamID(int mTeamID) {
        this.mTeamID = mTeamID;
    }

    public String getmPlayerName() {
        return mPlayerName;
    }

    public void setmPlayerName(String mPlayerName) {
        this.mPlayerName = mPlayerName;
    }

    public int getmPlayerNum() {
        return mPlayerNum;
    }

    public void setmPlayerNum(int mPlayerNum) {
        this.mPlayerNum = mPlayerNum;
    }

    @Override
    public String toString() {
        return "Players{" +
                "mPlayerName='" + mPlayerName + '\'' +
                ", mPlayerNum=" + mPlayerNum +
                '}';
    }

}

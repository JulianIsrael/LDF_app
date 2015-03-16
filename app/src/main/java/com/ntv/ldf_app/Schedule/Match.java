package com.ntv.ldf_app.Schedule;

import java.util.Arrays;
import java.util.Date;

/**
 * Created by Jose on 3/15/2015.
 */
public class Match {

    String mTeam1, mTeam2, mStadium;
    int[] mTeamImages;
    Date mTime;
    boolean mTv;
    int mMatchID;

    public Match(String mTeam1, String mTeam2, String mStadium) {
        this.mTeam1 = mTeam1;
        this.mTeam2 = mTeam2;
        this.mStadium = mStadium;
        this.mTeamImages = new int[2];
        this.mTv = false;
    }

    public int getmMatchID() {
        return mMatchID;
    }

    public void setmMatchID(int mMatchID) {
        this.mMatchID = mMatchID;
    }

    public Date getmTime() {
        return mTime;
    }

    public void setmTime(Date mTime) {
        this.mTime = mTime;
    }

    public int[] getmTeamImages() {
        return mTeamImages;
    }

    public void setmTeamImages(int[] mTeamImages) {
        this.mTeamImages = mTeamImages;
    }

    public String getmStadium() {
        return mStadium;
    }

    public void setmStadium(String mStadium) {
        this.mStadium = mStadium;
    }

    public String getmTeam2() {
        return mTeam2;
    }

    public void setmTeam2(String mTeam2) {
        this.mTeam2 = mTeam2;
    }

    public String getmTeam1() {
        return mTeam1;
    }

    public void setmTeam1(String mTeam1) {
        this.mTeam1 = mTeam1;
    }



    // Object functions
    public  void onChangeTv(){
        this.mTv = !this.mTv;
    }

    public boolean isTv() {
        return mTv;
    }

    public int getTeamImage(int index){
      return  this.mTeamImages[index];
    }


    //to String
    @Override
    public String toString() {
        return "Match{" +
                "mTeam1='" + mTeam1 + '\'' +
                ", mTeam2='" + mTeam2 + '\'' +
                ", mStadium='" + mStadium + '\'' +
                ", mTeamImages=" + Arrays.toString(mTeamImages) +
                ", mTime=" + mTime +
                ", mTv=" + mTv +
                '}';
    }
}

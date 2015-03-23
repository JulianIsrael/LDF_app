package com.ntv.ldf_app.Schedule;

import com.ntv.ldf_app.AppConstants.AppConstant;

import java.util.Arrays;
import java.util.Date;

/**
 * Created by Jose on 3/15/2015.
 */
public class Match {

    private final int mMatchID;
    private String mStadium, mTime;
    private boolean mTv;
    private Team mTeam1, mTeam2;

    public Match(int mID, Team mTeam1, Team mTeam2) {
        this.mMatchID = mID ;
        this.mTeam1 = mTeam1;
        this.mTeam2 = mTeam2;
        this.mTv = false;
        onCreateMatch();
    }

     /*
     *   setters & getters
     */

    private void setmTime(String mTime) {
        this.mTime = mTime;
    }

    /*
     *Public Object functions
    */

    public  void onChangeTv(){
        this.mTv = !this.mTv;
    }

    public boolean isTv() {
        return mTv;
    }

    public int getTeamImage(int index){
        int image = 0;
        switch (index){
            case 1:
            image = mTeam1.getmTeamImage();
                break;

            case 2:
                image = mTeam2.getmTeamImage();
                break;
        }

        return image;
    }

    /*
     *Private Object functions
    */

    private void onCreateMatch(){

        onCreateTime();
        onCreateStadium();
    }


    /** HARD CODED: AUTOMATE **/
    private void onCreateTime(){
        setmTime("4:00pm");
    }

    private void onCreateStadium(){
       this.mStadium = mTeam1.getmStadium();
    }


    //to String
    @Override
    public String toString() {
        return "Match{" +
                "mTeam1='" + mTeam1 + '\'' +
                ", mTeam2='" + mTeam2 + '\'' +
                ", mStadium='" + mStadium + '\'' +

                ", mTime=" + mTime +
                ", mTv=" + mTv +
                '}';
    }
}

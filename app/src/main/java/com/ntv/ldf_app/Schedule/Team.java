package com.ntv.ldf_app.Schedule;

import java.util.List;

/**
 * Created by Jose on 3/15/2015.
 */
public class Team {

    String mName, mStadium, mProfile;
    int mPJ, mDG, mPoints, mTeamRank;
    List  <Players> mPlayersList;
    List <Match> mMatchList;
    int mTeamID;

    public Team( String mName, String mStadium) {
        this.mName = mName;
        this.mStadium = mStadium;
    }

    public int getmTeamID() {
        return mTeamID;
    }

    public void setmTeamID(int mTeamID) {
        this.mTeamID = mTeamID;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getmStadium() {
        return mStadium;
    }

    public void setmStadium(String mStadium) {
        this.mStadium = mStadium;
    }

    public String getmProfile() {
        return mProfile;
    }

    public void setmProfile(String mProfile) {
        this.mProfile = mProfile;
    }

    public int getmPJ() {
        return mPJ;
    }

    public void setmPJ(int mPJ) {
        this.mPJ = mPJ;
    }

    public int getmDG() {
        return mDG;
    }

    public void setmDG(int mDG) {
        this.mDG = mDG;
    }

    public int getmPoints() {
        return mPoints;
    }

    public void setmPoints(int mPoints) {
        this.mPoints = mPoints;
    }

    public int getmTeamRank() {
        return mTeamRank;
    }

    public void setmTeamRank(int mTeamRank) {
        this.mTeamRank = mTeamRank;
    }

    public List<Players> getmPlayersList() {
        return mPlayersList;
    }

    public void setmPlayersList(List<Players> mPlayersList) {
        this.mPlayersList = mPlayersList;
    }


    public List<Match> getmMatchList() {
        return mMatchList;
    }

    public void setmMatchList(List<Match> mMatchList) {
        this.mMatchList = mMatchList;
    }


    // object functions

    public void setPlayer(Players player){
        mPlayersList.add(player);
    }

    public void getPlayer(int index){
        mPlayersList.get(index);
    }

    public void setMatch(Match match){
        mMatchList.add(match);
    }

    public void getMatch(int index){
        mMatchList.get(index);
    }


    @Override
    public String toString() {
        return "Team{" +
                "mName='" + mName + '\'' +
                ", mStadium='" + mStadium + '\'' +
                ", mProfile='" + mProfile + '\'' +
                ", mPJ=" + mPJ +
                ", mDG=" + mDG +
                ", mPoints=" + mPoints +
                ", mTeamRank=" + mTeamRank +
                ", mPlayersList=" + mPlayersList +
                '}';
    }
}

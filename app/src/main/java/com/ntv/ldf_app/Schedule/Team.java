package com.ntv.ldf_app.Schedule;

import com.ntv.ldf_app.AppConstants.AppConstant;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jose on 3/15/2015.
 */
public class Team {

    private  int mTeamID, mTeamImage;
    private String mName, mStadium, mProfile;
    private int mPJ, mDG, mPoints, mTeamRank;
    private List<Players> mPlayersList;
    private List<Match> mMatchList;

    // public constructor
    public Team( int teamID) {
        this.mTeamID = teamID;
        onSaveTeam();
        onCreatePlayerList();
        onSavePlayerList();
    }

    //   Setters


    private void setmTeamImage(int mTeamImage) {
        this.mTeamImage = mTeamImage;
    }

    private void setmName(String mName) {
        this.mName = mName;
    }

    private void setmStadium(String mStadium) {
        this.mStadium = mStadium;
    }

    private void setmProfile(String mProfile) {
        this.mProfile = mProfile;
    }

    private void setmPJ(int mPJ) {
        this.mPJ = mPJ;
    }

    private void setmDG(int mDG) {
        this.mDG = mDG;
    }

    private void setmPoints(int mPoints) {
        this.mPoints = mPoints;
    }

    private void setmTeamRank(int mTeamRank) {
        this.mTeamRank = mTeamRank;
    }

    private void addPlayersList(List<Players> mPlayersList) {
        this.mPlayersList = mPlayersList;
    }

    // Getters


    public int getmTeamImage() {
        return mTeamImage;
    }

    public int getmTeamID() {
        return mTeamID;
    }

    public String getmName() {
        return mName;
    }

    public String getmStadium() {
        return mStadium;
    }



    public int getmPJ() {
        return mPJ;
    }

    public int getmDG() {
        return mDG;
    }

    public int getmPoints() {
        return mPoints;
    }

    public int getmTeamRank() {
        return mTeamRank;
    }

    public List<Players> getmPlayersList() {
        return mPlayersList;
    }

    public List<Match> getmMatchList() {
        return mMatchList;
    }

    public void addMatchList(List<Match> mMatchList) {
        this.mMatchList = mMatchList;
    }


    // object functions

    private void addPlayer(Players player){
        mPlayersList.add(player);
    }

    private void addMatch(Match match){
        mMatchList.add(match);
    }


    public void getPlayer(int index){
        mPlayersList.get(index);
    }

    public void getMatch(int index){
        mMatchList.get(index);
    }


    private void onCreatePlayerList(){
        List playerList = new ArrayList<Players>();
        addPlayersList(playerList);
    }

    private void onSaveTeam(){
        for (int i = 0; i <AppConstant.mTeamArrayList.length; i++)
        {
            if( Integer.valueOf(AppConstant.mTeamArrayList[i][0]) == this.mTeamID){
                setmName(AppConstant.mTeamArrayList[i][1]);
                setmStadium(AppConstant.mTeamArrayList[i][2]);
                setmTeamImage(AppConstant.mImageList[i]);
            }
        }
    }

    private  void onSavePlayerList(){
        Players playersToAdd;
        for (int i = 0; i <AppConstant.mTeamPlayerArrayList.length; i++) {

           if( Integer.valueOf(AppConstant.mTeamPlayerArrayList[i][0]) == this.mTeamID)
           {
               playersToAdd = new Players(AppConstant.mTeamPlayerArrayList[i][1],
                       Integer.valueOf( AppConstant.mTeamPlayerArrayList[i][2]), this.mTeamID);

               addPlayer(playersToAdd);
           }
        }
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

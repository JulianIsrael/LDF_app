package com.ntv.ldf_app.Schedule;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Jose on 3/15/2015.
 */
public class WeeklySchedule {

    public  List teams1, teams2, stadio;
    public  String dia1,dia2;
    public  Integer[] teamLogo1, teamLogo2;

    public WeeklySchedule(List teams1, List teams2, List stadio, String dia1, String dia2, Integer[] teamLogo1, Integer[] teamLogo2) {
        this.teams1 = teams1;
        this.teams2 = teams2;

        this.stadio = stadio;
        this.dia1 = dia1;
        this.dia2 = dia2;
        this.teamLogo1 = teamLogo1;
        this.teamLogo2 = teamLogo2;
    }

    public List getTeams1() {
        return teams1;
    }

    public void setTeams1(List teams1) {
        this.teams1 = teams1;
    }

    public List getTeams2() {
        return teams2;
    }

    public void setTeams2(List teams2) {
        this.teams2 = teams2;
    }


    public List getStadio() {
        return stadio;
    }

    public void setStadio(List stadio) {
        this.stadio = stadio;
    }

    public String getDia1() {
        return dia1;
    }

    public void setDia1(String dia1) {
        this.dia1 = dia1;
    }

    public String getDia2() {
        return dia2;
    }

    public void setDia2(String dia2) {
        this.dia2 = dia2;
    }

    public Integer[] getTeamLogo1() {
        return teamLogo1;
    }

    public void setTeamLogo1(Integer[] teamLogo1) {
        this.teamLogo1 = teamLogo1;
    }

    public Integer[] getTeamLogo2() {
        return teamLogo2;
    }

    public void setTeamLogo2(Integer[] teamLogo2) {
        this.teamLogo2 = teamLogo2;
    }

    @Override
    public String toString() {
        return "WeeklySchedule{" +
                "teams1=" + teams1 +
                ", teams2=" + teams2 +

                ", stadio=" + stadio +
                ", dia1='" + dia1 + '\'' +
                ", dia2='" + dia2 + '\'' +
                ", teamLogo1=" + Arrays.toString(teamLogo1) +
                ", teamLogo2=" + Arrays.toString(teamLogo2) +
                '}';
    }




}

package com.assignment.GameOfCricket.model;

import java.util.ArrayList;

public class ScoreCard {
    String matchResult;
    int TeamAruns,TeamBruns;

    ArrayList<Player> TeamA,TeamB;

    public ScoreCard(String matchResult, int teamAruns, int teamBruns, ArrayList<Player> teamA, ArrayList<Player> teamB) {
        this.matchResult = matchResult;
        TeamAruns = teamAruns;
        TeamBruns = teamBruns;
        TeamA = teamA;
        TeamB = teamB;
    }

    public String getMatchResult() {
        return matchResult;
    }

    public int getTeamAruns() {
        return TeamAruns;
    }

    public int getTeamBruns() {
        return TeamBruns;
    }

    public ArrayList<Player> getTeamA() {
        return TeamA;
    }

    public ArrayList<Player> getTeamB() {
        return TeamB;
    }
}

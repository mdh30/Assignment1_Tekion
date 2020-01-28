package com.assignment.GameOfCricket.model;

public class ScoreCard {
    String matchResult;
    int TeamAruns,TeamBruns;

    Player[] TeamA,TeamB;

    public ScoreCard(String matchResult, int teamAruns, int teamBruns, Player[] teamA, Player[] teamB) {
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

    public Player[] getTeamA() {
        return TeamA;
    }

    public Player[] getTeamB() {
        return TeamB;
    }
}

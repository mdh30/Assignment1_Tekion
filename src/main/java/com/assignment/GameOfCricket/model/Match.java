package com.assignment.GameOfCricket.model;

public class Match {

    Team teamA;
    Team teamB;
    int runsTeamA;
    int runsTeamB;
    public Match(){
        teamA = new Team();
        teamB = new Team();
    }

    public void startMatch(){
        runsTeamA = teamA.playInning();
        runsTeamB = teamB.playInning();
        System.out.println(runsTeamA+" "+runsTeamB);
    }

    public String finishMatch(){
        runsTeamA = teamA.teamRuns;
        runsTeamB = teamB.teamRuns;
        String result;
        if(runsTeamA!=runsTeamB) {
            if (runsTeamA > runsTeamB) {
                result = "Team A won";
                return result;
            }
            else {
                result = "Team B won";
                return result;
            }
        }
        else{
            return "It's a Draw.";
        }

    }





}

package com.assignment.GameOfCricket.model;

import java.util.HashMap;

public class Match {

    Team teamA,teamB;
    public int runsTeamA,runsTeamB;
    public HashMap<Integer,Player> ATeam = new HashMap<>();
    public HashMap<Integer,Player> BTeam = new HashMap<>();

    public Match(){
        teamA = new Team();
        teamB = new Team();
    }

    public void startMatch(){
        teamA.playInning(true,ATeam,BTeam);
        runsTeamA = CricketGame.teamRuns;
        teamB.playInning(false,BTeam,ATeam);
        runsTeamB = CricketGame.teamRuns;
    }

    public String finishMatch(){
        String result;
        if(runsTeamA!=runsTeamB) {
            if (runsTeamA > runsTeamB) {
                result = "Team A won.";
            }
            else {
                result = "Team B won.";
            }
        }
        else{
            result = "It's a Draw.";
        }
        return result;
    }
}

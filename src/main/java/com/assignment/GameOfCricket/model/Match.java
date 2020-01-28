package com.assignment.GameOfCricket.model;

public class Match {

    public int runsTeamA,runsTeamB;

    Team teams;
    public Match(){
        teams = new Team();
    }

    public void startMatch(){
        teams.initialisePlayers(Team.Ateam);
        teams.initialisePlayers(Team.Bteam);
        teams.setPlayersRole(Team.Ateam);
        teams.playInning(true,Team.Ateam,Team.Bteam);
        runsTeamA = CricketGame.teamRuns;
        teams.setPlayersRole(Team.Bteam);
        teams.playInning(false,Team.Bteam,Team.Ateam);
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

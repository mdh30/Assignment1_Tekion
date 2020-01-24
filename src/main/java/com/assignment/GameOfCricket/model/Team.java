package com.assignment.GameOfCricket.model;

import java.util.HashMap;

public class Team {

    int teamRuns;

    public int playInning(boolean first,HashMap<Integer,Player> ATeam, HashMap<Integer,Player> BTeam){
        CricketGame game = new CricketGame();
        teamRuns = game.generateTeamScore(first,ATeam,BTeam);
        return teamRuns;
    }
}

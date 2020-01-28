package com.assignment.GameOfCricket.model;


public class Team {

    int teamRuns;

    public static Player[] Ateam = new Player[11];
    public static Player[] Bteam = new Player[11];

    public void initialisePlayers(Player[] Team){
        for(int i=0;i<11;i++){
            Team[i] = new Player();
        }
    }
    public void setPlayersRole(Player[] Team){
        for (int i=0;i<11;i++){
            if(i%3==0){
                Team[i].setPlayingRole("All Rounder");
                Team[i].setPlayerRating(60);
            }
            else if(i>6){
                Team[i].setPlayingRole("Bowler");
                Team[i].setPlayerRating(40);
            }
            else{
                Team[i].setPlayingRole("Batsman");
                Team[i].setPlayerRating(80);
            }
        }
    }

    public int playInning(boolean first,Player[] Ateam, Player[] Bteam){
        CricketGame game = new CricketGame();
        teamRuns = game.generateTeamScore(first,Ateam,Bteam);
        return teamRuns;
    }

}

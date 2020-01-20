package com.assignment.GameOfCricket.model;

public class Team {

    int teamRuns;
    int numOfPlayers = 11;
    public Team teamName;
    Team[] players = new Player[numOfPlayers];

    //for making team of 11 players
//    public Team[] generateTeam(){
//        this.teamName = teamName;
//        for(int i=0;i<numOfPlayers;i++){
//            players[i] = new Player();
//        }
//        return players ;
//    }

    public int playInning(){
        CricketGame game = new CricketGame();
        teamRuns = game.teamScore();
        return teamRuns;

    }

}

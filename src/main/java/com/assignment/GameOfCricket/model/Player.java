package com.assignment.GameOfCricket.model;

public class Player{

    private String playingRole;
    private int playerRating;
    private int score;
    private int ballsPlayed;
    private int boundaries;
    private float noOfOvers = 0;
    private int runsGiven = 0;
    private int wicketsTaken = 0;
    private int maidenOvers = 0;



    public void setScore(int scores){
        this.score = scores;
    }

    public int getScore(){ return score; }

    public void setNoOfOvers(float noOfOvers){ this.noOfOvers = noOfOvers;}

    public void setRunsGiven(int runsGiven){ this.runsGiven = runsGiven;}

    public void setWicketsTaken(int wicketsTaken){ this.wicketsTaken = wicketsTaken;}

    public void setMaidenOvers(int maidenOvers){ this.maidenOvers = maidenOvers;}

    public float getNoOfOvers(){ return noOfOvers;}

    public int getRunsGiven(){return runsGiven;}

    public int getWicketsTaken(){ return  wicketsTaken;}

    public int getMaidenOvers(){ return  maidenOvers;}

    public void setBallsPlayed(int ballsPlayed){ this.ballsPlayed = ballsPlayed;}

    public int getBallsPlayed(){ return ballsPlayed;}

    public void setBoundaries(int boundaries){ this.boundaries = boundaries;}

    public int getBoundaries(){return boundaries;}

    public void setPlayingRole(String playingRole){ this.playingRole = playingRole;}

    public String getPlayingRole(){ return playingRole;}

    public int getPlayerRating() {
        return playerRating;
    }

    public void setPlayerRating(int playerRating) {
        this.playerRating = playerRating;
    }
}

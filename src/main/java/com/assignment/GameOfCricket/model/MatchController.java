package com.assignment.GameOfCricket.model;

public class MatchController {
    CricketGame cricketGame = new CricketGame();
    Match matchGame;

    public void playGame(){

        matchGame = cricketGame.setupGame();
        matchGame.startMatch();
    }

    public String displayResult(){
        return matchGame.finishMatch();
    }
}

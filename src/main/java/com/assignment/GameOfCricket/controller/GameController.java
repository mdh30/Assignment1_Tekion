package com.assignment.GameOfCricket.controller;

import com.assignment.GameOfCricket.model.*;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@RestController
public class GameController {

    @RequestMapping("/scoreCards")
    public ScoreCard scoreCards(){

        MatchController matchController = new MatchController();
        matchController.playGame();
        Player[] s1 = Team.Ateam;
        Player[] s2 = Team.Bteam;


        return new ScoreCard(matchController.displayResult(),matchController.matchGame.runsTeamA,matchController.matchGame.runsTeamB,s1,s2);

    }

}

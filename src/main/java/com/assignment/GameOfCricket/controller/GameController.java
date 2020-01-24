package com.assignment.GameOfCricket.controller;

import com.assignment.GameOfCricket.model.*;
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
        HashMap<Integer, Player> s1=matchController.matchGame.ATeam;
        HashMap<Integer,Player> s2=matchController.matchGame.BTeam;
        ArrayList<Player> result1 = new ArrayList<>();
        ArrayList<Player> result2 = new ArrayList<>();
        for(Map.Entry<Integer,Player> entry: s1.entrySet()){
            result1.add(entry.getValue());
        }
        for(Map.Entry<Integer,Player> entry: s2.entrySet()){
            result2.add(entry.getValue());
        }
        return new ScoreCard(matchController.displayResult(),matchController.matchGame.runsTeamA,matchController.matchGame.runsTeamB,result1,result2);

    }

}

package com.assignment.GameOfCricket.controller;

import com.assignment.GameOfCricket.model.MatchController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GameController {

    MatchController matchController = new MatchController();
    @RequestMapping("/gameOfCricket")
    public String play(){
        matchController.playGame();
        String result = matchController.displayResult();
        return result;
    }
}

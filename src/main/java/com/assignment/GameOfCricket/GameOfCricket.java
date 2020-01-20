package com.assignment.GameOfCricket;

import com.assignment.GameOfCricket.controller.GameController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GameOfCricket<str> {

	public static void main(String[] args) {
		SpringApplication.run(GameOfCricket.class, args);

		GameController gameController = new GameController();
		gameController.play();

	}

}

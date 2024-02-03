package com.example.SnakesAndLadders;

import com.example.SnakesAndLadders.Controller.GameController;
import com.example.SnakesAndLadders.Entity.Dice;
import com.example.SnakesAndLadders.Entity.Ladder;
import com.example.SnakesAndLadders.Entity.Player;
import com.example.SnakesAndLadders.Entity.Snake;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Player> players = new ArrayList<>();
        players.add(new Player(1, 1));  // Player 1 starts at cell 1
        players.add(new Player(2, 1));  // Player 2 starts at cell 1

        List<Snake> snakes = new ArrayList<>();
        snakes.add(new Snake(16, 6));
        snakes.add(new Snake(47, 26));
        snakes.add(new Snake(49, 11));
        // Add more snakes as needed

        List<Ladder> ladders = new ArrayList<>();
        ladders.add(new Ladder(4, 14));
        ladders.add(new Ladder(9, 31));
        ladders.add(new Ladder(20, 38));
        // Add more ladders as needed

        Dice dice = new Dice();
        GameController gameController = new GameController(players, dice, snakes, ladders);
        gameController.startGame();

        while (!gameController.isGameFinished()) {
            for (Player player : players) {
                gameController.nextTurn(player);
                gameController.checkSnakeLadder(player);  // Assuming this method is added to GameController
                if (gameController.isGameFinished()) {
                    break;
                }
            }
        }
    }
}

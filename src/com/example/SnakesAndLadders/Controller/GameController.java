package com.example.SnakesAndLadders.Controller;

import com.example.SnakesAndLadders.Entity.Dice;
import com.example.SnakesAndLadders.Entity.Ladder;
import com.example.SnakesAndLadders.Entity.Player;
import com.example.SnakesAndLadders.Entity.Snake;

import java.util.List;

public class GameController {
    private List<Player> playerList;
    private Dice dice;
    private List<Snake>snakes;
    private List<Ladder>ladders;

    public GameController(List<Player> playerList, Dice dice, List<Snake> snakes, List<Ladder> ladders) {
        this.playerList = playerList;
        this.dice = dice;
        this.snakes = snakes;
        this.ladders = ladders;
    }

    public void startGame(){
        System.out.println("Game Started");
    }

    private  void movePlayer(Player player, int steps){
        player.move(steps);
    }

    public void nextTurn(Player player){
        int steps = dice.role();
        System.out.println("Player "+player.getPlayerId()+" rolled " + steps);
        movePlayer(player,steps);
    }

    public void checkSnakeLadder(Player player) {
        for (Snake snake : snakes) {
            if (player.getCurrentPosition() == snake.getStartCell()) {
                System.out.println("Player " + player.getPlayerId() + " encountered a snake!");
                player.move(snake.getEndCell() - snake.getStartCell());
            }
        }

        for (Ladder ladder : ladders) {
            if (player.getCurrentPosition() == ladder.getStartCell()) {
                System.out.println("Player " + player.getPlayerId() + " climbed a ladder!");
                player.move(ladder.getEndCell() - ladder.getStartCell());
            }
        }
    }
    public boolean isGameFinished() {
        for (Player player : playerList) {
            if (player.getCurrentPosition() >= 100) {
                System.out.println("Player " + player.getPlayerId() + " wins!");
                return true;
            }
        }
        return false;
    }

}

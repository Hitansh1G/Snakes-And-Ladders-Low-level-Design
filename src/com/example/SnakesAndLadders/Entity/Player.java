package com.example.SnakesAndLadders.Entity;

public class Player {
    private int playerId;
    private int currentPosition;

    public int getPlayerId() {
        return playerId;
    }

    public int getCurrentPosition() {
        return currentPosition;
    }

    public Player(int playerId, int currentPosition) {
        this.playerId = playerId;
        this.currentPosition = currentPosition;
    }

    public void move(int steps){
        currentPosition += steps;
    }
}

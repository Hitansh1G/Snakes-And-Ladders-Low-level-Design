package com.example.SnakesAndLadders.Entity;

public class Snake {
    private int startCell;
    private int endCell;

    public Snake(int startCell, int endCell) {
        this.startCell = startCell;
        this.endCell = endCell;
    }

    public int getStartCell() {
        return startCell;
    }

    public int getEndCell() {
        return endCell;
    }
}

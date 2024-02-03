package com.example.SnakesAndLadders.Entity;

public class Ladder {
    private int startCell;
    private int endCell;

    public Ladder(int startCell, int endCell) {
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

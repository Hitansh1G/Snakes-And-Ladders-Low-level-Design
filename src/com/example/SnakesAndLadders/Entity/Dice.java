package com.example.SnakesAndLadders.Entity;

import java.util.Random;

public class Dice {
    public int role(){
        Random random= new Random();
        return random.nextInt(6)+1;
    }
}

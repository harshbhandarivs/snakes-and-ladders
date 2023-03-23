package com.snakes_and_ladders.input;

import java.util.Random;

public class DiceImpl implements Dice {

    private final Random random;

    public DiceImpl() {
        random = new Random();
    }

    @Override
    public int roll() {
        return random.nextInt(6) + 1;
    }
}

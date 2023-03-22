package main.java.com.snakes_and_ladders.input;

import java.util.Random;

public class DiceRollImpl implements DiceRoll {

    private final Random random;

    DiceRollImpl() {
        random = new Random();
    }

    @Override
    public int getNumber() {
        return random.nextInt(6) + 1;
    }
}

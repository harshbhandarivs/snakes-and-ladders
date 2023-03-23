package com.snakes_and_ladders.input;

import java.util.List;

public class DiceStub implements Dice {

    private final List<Integer> diceRolls;

    public DiceStub(List<Integer> diceRolls) {
        this.diceRolls = diceRolls;
    }

    @Override
    public int roll() {
        return diceRolls.remove(0);
    }
}

package com.snakes_and_ladders.input;

import java.util.List;

public class DiceRollStub implements DiceRoll {

    private final List<Integer> diceRolls;

    public DiceRollStub(List<Integer> diceRolls) {
        this.diceRolls = diceRolls;
    }

    @Override
    public int getNumber() {
        return diceRolls.remove(0);
    }
}

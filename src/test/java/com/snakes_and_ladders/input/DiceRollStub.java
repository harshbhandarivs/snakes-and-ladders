package test.java.com.snakes_and_ladders.input;

import main.java.com.snakes_and_ladders.input.DiceRoll;

import java.util.List;

public class DiceRollStub implements DiceRoll {

    private final List<Integer> diceRolls;

    DiceRollStub(List<Integer> diceRolls) {
        this.diceRolls = diceRolls;
    }

    @Override
    public int getNumber() {
        return diceRolls.remove(0);
    }
}

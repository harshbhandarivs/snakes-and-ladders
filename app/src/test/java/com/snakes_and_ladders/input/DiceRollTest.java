package com.snakes_and_ladders.input;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class DiceRollTest {
    @Test
    public void testStub() {
        DiceRollStub diceRollStub = new DiceRollStub(new ArrayList<>(List.of(1, 2, 3)));

        Assertions.assertEquals(1, diceRollStub.getNumber());
        Assertions.assertEquals(2, diceRollStub.getNumber());
        Assertions.assertEquals(3, diceRollStub.getNumber());
        Assertions.assertThrows(IndexOutOfBoundsException.class, diceRollStub::getNumber);
    }
}

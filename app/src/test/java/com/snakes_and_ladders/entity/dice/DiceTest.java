package com.snakes_and_ladders.entity.dice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class DiceTest {
    @Test
    public void testStub() {
        DiceStub diceRollStub = new DiceStub(new ArrayList<>(List.of(1, 2, 3)));

        Assertions.assertEquals(1, diceRollStub.roll());
        Assertions.assertEquals(2, diceRollStub.roll());
        Assertions.assertEquals(3, diceRollStub.roll());
        Assertions.assertThrows(IndexOutOfBoundsException.class, diceRollStub::roll);
    }
}

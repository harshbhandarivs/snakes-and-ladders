package com.snakes_and_ladders.entity.ladder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LadderTest {

    @Test
    void headPositionMatchesAsConstructor() {
        Ladder ladder = new Ladder(30, 10);

        assertEquals(30, ladder.startPosition());
    }

    @Test
    void tailPositionMatchesAsConstructor() {
        Ladder snake = new Ladder(30, 10);

        assertEquals(10, snake.endPosition());
    }
}

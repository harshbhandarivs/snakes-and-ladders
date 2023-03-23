package com.snakes_and_ladders.entity.snake;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class SnakeMapTest {
    @Test
    void snakeHeadPositionsAddedIsContainedAsKeyInMap() {
        SnakeMap snakeMap = new SnakeMap(new Snake[]{new Snake(30, 10), new Snake(20, 5)});

        assertTrue(snakeMap.isSnakeHeadPresentAt(30));
        assertTrue(snakeMap.isSnakeHeadPresentAt(20));
    }

    @Test
    void snakeTailPositionsAddIsAvailableWhenQueriedWithHeadPosition() {
        SnakeMap snakeMap = new SnakeMap(new Snake[]{new Snake(30, 10), new Snake(20, 5)});

        Assertions.assertEquals(10, snakeMap.getTailPositionFor(30));
        Assertions.assertEquals(5, snakeMap.getTailPositionFor(20));
    }
}

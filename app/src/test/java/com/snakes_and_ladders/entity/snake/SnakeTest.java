package com.snakes_and_ladders.entity.snake;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SnakeTest {
    @Test
    void headPositionMatchesAsConstructor() {
        Snake snake = new Snake(30, 10);

        assertEquals(30, snake.headPosition());
    }

    @Test
    void tailPositionMatchesAsConstructor() {
        Snake snake = new Snake(30, 10);

        assertEquals(10, snake.tailPosition());
    }
}

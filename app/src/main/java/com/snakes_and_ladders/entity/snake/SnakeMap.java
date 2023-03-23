package com.snakes_and_ladders.entity.snake;

import java.util.HashMap;

public class SnakeMap extends HashMap<Integer, Integer> {
    public SnakeMap(Snake[] snakes) {
        for(Snake snake: snakes) {
            put(snake.headPosition(), snake.tailPosition());
        }
    }

    public Boolean isSnakeHeadPresentAt(int position) {
        return containsKey(position);
    }

    public Integer getTailPositionFor(int headPosition) {
        return get(headPosition);
    }
}

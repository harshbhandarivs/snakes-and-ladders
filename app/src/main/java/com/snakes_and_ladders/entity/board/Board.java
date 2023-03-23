package com.snakes_and_ladders.entity.board;

import java.util.Map;

public class Board {
    public final Map<Integer, Integer> snakePositions;
    public final Map<Integer, Integer> ladderPositions;

    public Board(Map<Integer, Integer> snakePositions, Map<Integer, Integer> ladderPositions) {
        this.snakePositions = snakePositions;
        this.ladderPositions = ladderPositions;
    }
}

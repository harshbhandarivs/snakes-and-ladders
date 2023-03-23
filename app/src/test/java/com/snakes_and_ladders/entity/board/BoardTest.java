package com.snakes_and_ladders.entity.board;

import com.snakes_and_ladders.entity.ladder.Ladder;
import com.snakes_and_ladders.entity.ladder.LadderMap;
import com.snakes_and_ladders.entity.snake.Snake;
import com.snakes_and_ladders.entity.snake.SnakeMap;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BoardTest {
    @Test
    void snakeMapMatchesAsConstructor() {
        SnakeMap snakeMap = new SnakeMap(new Snake[]{new Snake(30, 10), new Snake(20, 5)});
        LadderMap ladderMap = new LadderMap(new Ladder[]{new Ladder(10, 30), new Ladder(20, 40)});

        Board board = new Board(snakeMap, ladderMap);

        assertEquals(snakeMap, board.snakePositions());
        assertEquals(ladderMap, board.ladderPositions());
    }
}

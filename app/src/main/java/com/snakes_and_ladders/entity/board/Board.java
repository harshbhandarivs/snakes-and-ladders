package com.snakes_and_ladders.entity.board;

import com.snakes_and_ladders.entity.ladder.LadderMap;
import com.snakes_and_ladders.entity.snake.SnakeMap;

public record Board(SnakeMap snakePositions, LadderMap ladderPositions) {
}

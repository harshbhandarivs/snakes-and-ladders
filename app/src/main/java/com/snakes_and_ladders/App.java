package com.snakes_and_ladders;

import com.snakes_and_ladders.entity.board.Board;
import com.snakes_and_ladders.entity.dice.Dice;
import com.snakes_and_ladders.entity.dice.DiceImpl;
import com.snakes_and_ladders.entity.ladder.Ladder;
import com.snakes_and_ladders.entity.ladder.LadderMap;
import com.snakes_and_ladders.entity.snake.Snake;
import com.snakes_and_ladders.entity.snake.SnakeMap;
import com.snakes_and_ladders.printer.PrinterImpl;
import com.snakes_and_ladders.printer.Prompt;

public class App {

    private final Game game;

    App() {
        Dice diceRoll = new DiceImpl();
        Prompt prompt = new Prompt(new PrinterImpl());
        Snake[] snakes = {
                new Snake(18, 2),
                new Snake(25, 8),
                new Snake(38, 11),
                new Snake(41, 19),
                new Snake(59, 21),
                new Snake(72, 12),
                new Snake(78, 7),
                new Snake(86, 31),
                new Snake(92, 26),
                new Snake(97, 5),
        };
        Ladder[] ladders = {
                new Ladder(9, 32),
                new Ladder(12, 53),
                new Ladder(17, 90),
                new Ladder(21, 50),
                new Ladder(27, 66),
                new Ladder(29, 42),
                new Ladder(44, 73),
                new Ladder(63, 88)
        };
        LadderMap ladderPositions = new LadderMap(ladders);
        SnakeMap snakePositions = new SnakeMap(snakes);
        Board board = new Board(snakePositions, ladderPositions);
        game = new Game(diceRoll, prompt, board);
    }

    public void start() {
        game.play();
        System.exit(1);
    }
}

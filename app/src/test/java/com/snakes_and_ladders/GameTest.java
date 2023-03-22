package com.snakes_and_ladders;

import com.snakes_and_ladders.input.DiceRoll;
import com.snakes_and_ladders.input.DiceRollStub;
import com.snakes_and_ladders.printer.PrinterStub;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;


class GameTest {

    @Test
    public void shouldPlayGameWithPreSpecifiedOutComes() {
        DiceRoll diceRoll = new DiceRollStub(new ArrayList<>(List.of(4, 6, 6, 2, 2, 1, 3, 2, 6, 3, 1, 3, 6, 3, 2, 2, 6, 3, 5, 5, 2, 2, 3, 3, 4, 3, 5, 1, 2, 5, 4, 6, 4, 6, 6, 4, 2, 1, 5, 3, 5, 2, 4, 4, 2, 5, 6, 6, 3, 3, 1, 4)));
        PrinterStub printer = new PrinterStub();
        Game game = new Game(diceRoll, printer);

        game.play();

        Assertions.assertEquals(List.of("Player 1 got dice roll of 4",
                "Player one did not score 6. First a 6 needs to be scored to start moving on board.",
                "Next position for player one is 0",
                "Player two will play next turn",
                "Player 2 got dice roll of 6",
                "Next position for player two is 6",
                "Player three will play next turn",
                "Player 3 got dice roll of 6",
                "Next position for player three is 6",
                "Player four will play next turn",
                "Player 4 got dice roll of 2",
                "Player four did not score 6. First a 6 needs to be scored to start moving on board.",
                "Next position for player four is 0",
                "Player one will play next turn",
                "Player 1 got dice roll of 2",
                "Player one did not score 6. First a 6 needs to be scored to start moving on board.",
                "Next position for player one is 0",
                "Player two will play next turn",
                "Player 2 got dice roll of 1",
                "Next position for player two is 7",
                "Player three will play next turn",
                "Player 3 got dice roll of 3",
                "Player got chanced upon a ladder at position 9!",
                "Next position for player three is 32",
                "Player four will play next turn",
                "Player 4 got dice roll of 2",
                "Player four did not score 6. First a 6 needs to be scored to start moving on board.",
                "Next position for player four is 0",
                "Player one will play next turn",
                "Player 1 got dice roll of 6",
                "Next position for player one is 6",
                "Player two will play next turn",
                "Player 2 got dice roll of 3",
                "Next position for player two is 10",
                "Player three will play next turn",
                "Player 3 got dice roll of 1",
                "Next position for player three is 33",
                "Player four will play next turn",
                "Player 4 got dice roll of 3",
                "Player four did not score 6. First a 6 needs to be scored to start moving on board.",
                "Next position for player four is 0",
                "Player one will play next turn",
                "Player 1 got dice roll of 6",
                "Player got chanced upon a ladder at position 12!",
                "Next position for player one is 53",
                "Player two will play next turn",
                "Player 2 got dice roll of 3",
                "Next position for player two is 13",
                "Player three will play next turn",
                "Player 3 got dice roll of 2",
                "Next position for player three is 35",
                "Player four will play next turn",
                "Player 4 got dice roll of 2",
                "Player four did not score 6. First a 6 needs to be scored to start moving on board.",
                "Next position for player four is 0",
                "Player one will play next turn",
                "Player 1 got dice roll of 6",
                "Player got bit by snake a position 59",
                "Next position for player one is 21",
                "Player two will play next turn",
                "Player 2 got dice roll of 3",
                "Next position for player two is 16",
                "Player three will play next turn",
                "Player 3 got dice roll of 5",
                "Next position for player three is 40",
                "Player four will play next turn",
                "Player 4 got dice roll of 5",
                "Player four did not score 6. First a 6 needs to be scored to start moving on board.",
                "Next position for player four is 0",
                "Player one will play next turn",
                "Player 1 got dice roll of 2",
                "Next position for player one is 23",
                "Player two will play next turn",
                "Player 2 got dice roll of 2",
                "Player got bit by snake a position 18",
                "Next position for player two is 2",
                "Player three will play next turn",
                "Player 3 got dice roll of 3",
                "Next position for player three is 43",
                "Player four will play next turn",
                "Player 4 got dice roll of 3",
                "Player four did not score 6. First a 6 needs to be scored to start moving on board.",
                "Next position for player four is 0",
                "Player one will play next turn",
                "Player 1 got dice roll of 4",
                "Player got chanced upon a ladder at position 27!",
                "Next position for player one is 66",
                "Player two will play next turn",
                "Player 2 got dice roll of 3",
                "Next position for player two is 5",
                "Player three will play next turn",
                "Player 3 got dice roll of 5",
                "Next position for player three is 48",
                "Player four will play next turn",
                "Player 4 got dice roll of 1",
                "Player four did not score 6. First a 6 needs to be scored to start moving on board.",
                "Next position for player four is 0",
                "Player one will play next turn",
                "Player 1 got dice roll of 2",
                "Next position for player one is 68",
                "Player two will play next turn",
                "Player 2 got dice roll of 5",
                "Next position for player two is 10",
                "Player three will play next turn",
                "Player 3 got dice roll of 4",
                "Next position for player three is 52",
                "Player four will play next turn",
                "Player 4 got dice roll of 6",
                "Next position for player four is 6",
                "Player one will play next turn",
                "Player 1 got dice roll of 4",
                "Player got bit by snake a position 72",
                "Next position for player one is 12",
                "Player two will play next turn",
                "Player 2 got dice roll of 6",
                "Next position for player two is 16",
                "Player three will play next turn",
                "Player 3 got dice roll of 6",
                "Next position for player three is 58",
                "Player four will play next turn",
                "Player 4 got dice roll of 4",
                "Next position for player four is 10",
                "Player one will play next turn",
                "Player 1 got dice roll of 2",
                "Next position for player one is 14",
                "Player two will play next turn",
                "Player 2 got dice roll of 1",
                "Player got chanced upon a ladder at position 17!",
                "Next position for player two is 90",
                "Player three will play next turn",
                "Player 3 got dice roll of 5",
                "Player got chanced upon a ladder at position 63!",
                "Next position for player three is 88",
                "Player four will play next turn",
                "Player 4 got dice roll of 3",
                "Next position for player four is 13",
                "Player one will play next turn",
                "Player 1 got dice roll of 5",
                "Next position for player one is 19",
                "Player two will play next turn",
                "Player 2 got dice roll of 2",
                "Player got bit by snake a position 92",
                "Next position for player two is 26",
                "Player three will play next turn",
                "Player 3 got dice roll of 4",
                "Player got bit by snake a position 92",
                "Next position for player three is 26",
                "Player four will play next turn",
                "Player 4 got dice roll of 4",
                "Player got chanced upon a ladder at position 17!",
                "Next position for player four is 90",
                "Player one will play next turn",
                "Player 1 got dice roll of 2",
                "Player got chanced upon a ladder at position 21!",
                "Next position for player one is 50",
                "Player two will play next turn",
                "Player 2 got dice roll of 5",
                "Next position for player two is 31",
                "Player three will play next turn",
                "Player 3 got dice roll of 6",
                "Next position for player three is 32",
                "Player four will play next turn",
                "Player 4 got dice roll of 6",
                "Next position for player four is 96",
                "Player one will play next turn",
                "Player 1 got dice roll of 3",
                "Next position for player one is 53",
                "Player two will play next turn",
                "Player 2 got dice roll of 3",
                "Next position for player two is 34",
                "Player three will play next turn",
                "Player 3 got dice roll of 1",
                "Next position for player three is 33",
                "Player four will play next turn",
                "Player 4 got dice roll of 4",
                "Player four wins! Game finished."), printer.getOutputLines());
    }

    @Test
    public void shouldPlayGameWithPreSpecifiedOutComes2() {
        DiceRoll diceRoll = new DiceRollStub(new ArrayList<>(List.of(6, 1, 1, 1, 5, 1, 1, 1, 6, 1, 1, 1, 6, 1, 1, 1, 4)));
        PrinterStub printer = new PrinterStub();
        Game game = new Game(diceRoll, printer);

        game.play();

        Assertions.assertEquals(List.of("Player 1 got dice roll of 6",
                "Next position for player one is 6",
                "Player two will play next turn",
                "Player 2 got dice roll of 1",
                "Player two did not score 6. First a 6 needs to be scored to start moving on board.",
                "Next position for player two is 0",
                "Player three will play next turn",
                "Player 3 got dice roll of 1",
                "Player three did not score 6. First a 6 needs to be scored to start moving on board.",
                "Next position for player three is 0",
                "Player four will play next turn",
                "Player 4 got dice roll of 1",
                "Player four did not score 6. First a 6 needs to be scored to start moving on board.",
                "Next position for player four is 0",
                "Player one will play next turn",
                "Player 1 got dice roll of 5",
                "Next position for player one is 11",
                "Player two will play next turn",
                "Player 2 got dice roll of 1",
                "Player two did not score 6. First a 6 needs to be scored to start moving on board.",
                "Next position for player two is 0",
                "Player three will play next turn",
                "Player 3 got dice roll of 1",
                "Player three did not score 6. First a 6 needs to be scored to start moving on board.",
                "Next position for player three is 0",
                "Player four will play next turn",
                "Player 4 got dice roll of 1",
                "Player four did not score 6. First a 6 needs to be scored to start moving on board.",
                "Next position for player four is 0",
                "Player one will play next turn",
                "Player 1 got dice roll of 6",
                "Player got chanced upon a ladder at position 17!",
                "Next position for player one is 90",
                "Player two will play next turn",
                "Player 2 got dice roll of 1",
                "Player two did not score 6. First a 6 needs to be scored to start moving on board.",
                "Next position for player two is 0",
                "Player three will play next turn",
                "Player 3 got dice roll of 1",
                "Player three did not score 6. First a 6 needs to be scored to start moving on board.",
                "Next position for player three is 0",
                "Player four will play next turn",
                "Player 4 got dice roll of 1",
                "Player four did not score 6. First a 6 needs to be scored to start moving on board.",
                "Next position for player four is 0",
                "Player one will play next turn",
                "Player 1 got dice roll of 6",
                "Next position for player one is 96",
                "Player two will play next turn",
                "Player 2 got dice roll of 1",
                "Player two did not score 6. First a 6 needs to be scored to start moving on board.",
                "Next position for player two is 0",
                "Player three will play next turn",
                "Player 3 got dice roll of 1",
                "Player three did not score 6. First a 6 needs to be scored to start moving on board.",
                "Next position for player three is 0",
                "Player four will play next turn",
                "Player 4 got dice roll of 1",
                "Player four did not score 6. First a 6 needs to be scored to start moving on board.",
                "Next position for player four is 0",
                "Player one will play next turn",
                "Player 1 got dice roll of 4",
                "Player one wins! Game finished."), printer.getOutputLines());
    }
}

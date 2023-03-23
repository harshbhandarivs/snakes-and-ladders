package com.snakes_and_ladders.printer;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

class PromptTest {
    PrinterStub printer;
    Prompt prompt;

    @BeforeEach
    void setUp() {
        printer = new PrinterStub();
        prompt = new Prompt(printer);
    }

    @Test
    void promptForDiceRoll() {
        prompt.diceRollOutcome(1, 10);

        Assertions.assertEquals(List.of("Player 2 got dice roll of 10"), printer.getOutputLines());
    }

    @Test
    void promptWinner() {
        prompt.winner(1);

        Assertions.assertEquals(List.of("Player two wins! Game finished."), printer.getOutputLines());
    }

    @Test
    void promptNextPlayerPosition() {
        prompt.playerNextPosition(1, 20);

        Assertions.assertEquals(List.of("Next position for player two is 20"), printer.getOutputLines());
    }

    @Test
    void promptPlayerChancedLadder() {
        prompt.playerChancedLadder(30);

        Assertions.assertEquals(List.of("Player got chanced upon a ladder at position 30!"), printer.getOutputLines());
    }

    @Test
    void promptPlayerBitBySnake() {
        prompt.playerBitBySnake(30);

        Assertions.assertEquals(List.of("Player got bit by snake a position 30"), printer.getOutputLines());
    }

    @Test
    void promptPlayerDidNotStartWithSix() {
        prompt.playerDidNotStartWithSix(1);

        Assertions.assertEquals(List.of("Player two did not score 6. First a 6 needs to be scored to start moving on board."), printer.getOutputLines());
    }

    @Test
    void promptPlayerPositionIsMoreThanHundred() {
        prompt.playerPositionIsMoreThanHundred(2, 98);

        Assertions.assertEquals(List.of("Player three needs to score exactly 2 on dice roll to win. Passing chance."), printer.getOutputLines());
    }

    @Test
    void promptNextPlayerTurn() {
        prompt.nextPlayerTurn(2);

        Assertions.assertEquals(List.of("Player three will play next turn"), printer.getOutputLines());
    }
}

package com.snakes_and_ladders.printer;

import java.util.HashMap;
import java.util.Map;

public class Prompt {
    private final Printer printer;
    private final Map<Integer, String> playerNumberToNames;


    public Prompt(Printer printer) {
        this.printer = printer;
        this.playerNumberToNames = new HashMap<>() {
            {
                put(1, "one");
                put(2, "two");
                put(3, "three");
                put(4, "four");
            }
        };
    }

    public void diceRollOutcome(int currentPlayerIndex, int nextNum) {
        printer.println("Player " + (currentPlayerIndex + 1) + " got dice roll of " + nextNum);
    }

    public void playerNextPosition(int currentPlayerIndex, int playerPosition) {
        printer.println("Next position for player " + this.playerNumberToNames.get(currentPlayerIndex + 1) + " is " + playerPosition);
    }

    public void winner(int currentPlayerIndex) {
        printer.println("Player " + this.playerNumberToNames.get(currentPlayerIndex + 1) + " wins! Game finished.");
    }

    public void playerChancedLadder(int next) {
        printer.println("Player got chanced upon a ladder at position " + next + "!");
    }

    public void playerBitBySnake(int next) {
        printer.println("Player got bit by snake a position " + next);
    }

    public void playerDidNotStartWithSix(int currentPlayerIndex) {
        printer.println("Player " + this.playerNumberToNames.get(currentPlayerIndex + 1) + " did not score 6. First a 6 needs to be scored to start moving on board.");
    }

    public void playerPositionIsMoreThanHundred(int currentPlayerIndex, int currentPlayerPosition) {
        printer.println("Player " + this.playerNumberToNames.get(currentPlayerIndex + 1) + " needs to score exactly " + (100 - currentPlayerPosition) + " on dice roll to win. Passing chance.");
    }

    public void nextPlayerTurn(int nextPlayerIndex) {
        printer.println("Player " + this.playerNumberToNames.get(nextPlayerIndex + 1) + " will play next turn");
    }
}

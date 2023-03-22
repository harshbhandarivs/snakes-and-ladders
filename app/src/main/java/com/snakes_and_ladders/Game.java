package com.snakes_and_ladders;

import com.snakes_and_ladders.input.DiceRoll;
import com.snakes_and_ladders.printer.Printer;

import java.util.HashMap;
import java.util.Map;

public class Game {

    private final DiceRoll diceRoll;
    private final Printer printer;
    private final Map<Integer, Integer> snakePositions;
    private final Map<Integer, Integer> ladderPositions;
    private final int[] playerPositions;
    private final Map<Integer, String> playerNumberToNames;

    public Game(DiceRoll diceRoll, Printer printer, Map<Integer, Integer> snakePositions, Map<Integer, Integer> ladderPositions) {
        this.diceRoll = diceRoll;
        this.printer = printer;
        this.snakePositions = snakePositions;
        this.ladderPositions = ladderPositions;
        this.playerPositions = new int[4];
        this.playerNumberToNames = new HashMap<>() {
            {
                put(1, "one");
                put(2, "two");
                put(3, "three");
                put(4, "four");
            }
        };
    }

    public void play() {
        int currentPlayerIndex = 0;
        boolean skip = false;


        //continue to play the game until it is over
        while (true) {

            int nextNum = diceRoll.getNumber();
            printer.println("Player " + (currentPlayerIndex + 1) + " got dice roll of " + nextNum);
            int next = this.playerPositions[currentPlayerIndex] + nextNum;

            if (positionIsMoreThanHundred(next)) {
                printer.println("Player " + this.playerNumberToNames.get(currentPlayerIndex + 1) + " needs to score exactly " + (100 - this.playerPositions[currentPlayerIndex]) + " on dice roll to win. Passing chance.");
                skip = true;
            }

            if (positionIsHundred(next)) {
                printer.println("Player " + this.playerNumberToNames.get(currentPlayerIndex + 1) + " wins! Game finished.");
                break;
            }

            if (startsWithOtherThanSix(this.playerPositions[currentPlayerIndex], nextNum)) {
                printer.println("Player " + this.playerNumberToNames.get(currentPlayerIndex + 1) + " did not score 6. First a 6 needs to be scored to start moving on board.");
                skip = true;
            }

            if (positionHasSnake(next)) {
                printer.println("Player got bit by snake a position " + next);
                this.playerPositions[currentPlayerIndex] = snakePositions.get(next);
                skip = true;
            }

            if (positionHasLadder(next)) {
                printer.println("Player got chanced upon a ladder at position " + next + "!");
                this.playerPositions[currentPlayerIndex] = ladderPositions.get(next);
                skip = true;
            }

            if (!skip) {
                this.playerPositions[currentPlayerIndex] = next;
            }

            printer.println("Next position for player " + this.playerNumberToNames.get(currentPlayerIndex + 1) + " is " + this.playerPositions[currentPlayerIndex]);
            skip = false;
            currentPlayerIndex = (currentPlayerIndex + 1) % 4;
            printer.println("Player " + this.playerNumberToNames.get(currentPlayerIndex + 1) + " will play next turn");
        }
    }

    private boolean positionIsMoreThanHundred(int position) {
        return position > 100;
    }

    private boolean positionIsHundred(int position) {
        return position == 100;
    }

    private boolean positionHasLadder(int position) {
        return this.ladderPositions.get(position) != null;
    }

    private boolean positionHasSnake(int position) {
        return this.snakePositions.get(position) != null;
    }

    private boolean startsWithOtherThanSix(int currentPosition, int nextNum) {
        return currentPosition == 0 && nextNum != 6;
    }
}

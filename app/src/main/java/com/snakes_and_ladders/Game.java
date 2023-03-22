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

    public Game(DiceRoll diceRoll, Printer printer) {
        this.diceRoll = diceRoll;
        this.printer = printer;
        this.snakePositions = new HashMap<>() {
            {
                put(18, 2);
                put(25, 8);
                put(38, 11);
                put(41, 19);
                put(59, 21);
                put(72, 12);
                put(78, 7);
                put(86, 31);
                put(92, 26);
                put(97, 5);
            }
        };
        this.ladderPositions = new HashMap<>() {
            {
                put(9, 32);
                put(12, 53);
                put(17, 90);
                put(21, 50);
                put(27, 66);
                put(29, 42);
                put(44, 73);
                put(63, 88);
            }
        };
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

            if (next > 100) {
                printer.println("Player " + this.playerNumberToNames.get(currentPlayerIndex + 1) + " needs to score exactly " + (100 - this.playerPositions[currentPlayerIndex]) + " on dice roll to win. Passing chance.");
                skip = true;
            }

            if (next == 100) {
                printer.println("Player " + this.playerNumberToNames.get(currentPlayerIndex + 1) + " wins! Game finished.");
                return;
            }

            if (startsWithOtherThanSix(this.playerPositions[currentPlayerIndex], nextNum)) {
                printer.println("Player " + this.playerNumberToNames.get(currentPlayerIndex + 1) + " did not score 6. First a 6 needs to be scored to start moving on board.");
                skip = true;
            }

            if (nextPositionHasSnake(snakePositions, next)) {
                printer.println("Player got bit by snake a position " + next);
                this.playerPositions[currentPlayerIndex] = snakePositions.get(next);
                skip = true;
            }

            if (nextPositionHasLadder(ladderPositions, next)) {
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

    private static boolean nextPositionHasLadder(Map<Integer, Integer> ldrPos, int next) {
        return ldrPos.get(next) != null;
    }

    private static boolean nextPositionHasSnake(Map<Integer, Integer> snkPos, int next) {
        return snkPos.get(next) != null;
    }

    private boolean startsWithOtherThanSix(int currentPosition, int nextNum) {
        return currentPosition == 0 && nextNum != 6;
    }
}

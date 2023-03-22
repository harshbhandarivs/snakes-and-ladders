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
    }

    public void play() {
        int player = 1;
        int onePos = 0, twoPos = 0, threePos = 0, fourPos = 0;
        boolean skip = false;


        //continue to play the game until it is over
        while (true) {

            int nextNum = diceRoll.getNumber();
            printer.println("Player " + player + " got dice roll of " + nextNum);

            if (player == 1) {
                int next = onePos + nextNum;

                if (next > 100) {
                    printer.println("Player one needs to score exactly " + (100 - onePos) + " on dice roll to win. Passing chance.");
                    skip = true;
                }

                if (next == 100) {
                    printer.println("Player one wins! Game finished.");
                    return;
                }

                if (startsWithOtherThanSix(onePos, nextNum)) {
                    printer.println("Player one did not score 6. First a 6 needs to be scored to start moving on board.");
                    skip = true;
                }

                if (nextPositionHasSnake(snakePositions, next)) {
                    printer.println("Player got bit by snake a position " + next);
                    onePos = snakePositions.get(next);
                    skip = true;
                }

                if (nextPositionHasLadder(ladderPositions, next)) {
                    printer.println("Player got chanced upon a ladder at position " + next + "!");
                    onePos = ladderPositions.get(next);
                    skip = true;
                }

                if (!skip) {
                    onePos = next;
                }

                printer.println("Next position for player one is " + onePos);
                skip = false;
                player = 2;
                printer.println("Player two will play next turn");

            } else if (player == 2) {

                int next = twoPos + nextNum;

                if (next > 100) {
                    printer.println("Player two needs to score exactly " + (100 - twoPos) + " on dice roll to win. Passing chance.");
                    skip = true;
                }

                if (next == 100) {
                    printer.println("Player two wins! Game finished.");
                    return;
                }

                if (startsWithOtherThanSix(twoPos, nextNum)) {
                    printer.println("Player two did not score 6. First a 6 needs to be scored to start moving on board.");
                    skip = true;
                }

                if (nextPositionHasSnake(snakePositions, next)) {
                    printer.println("Player got bit by snake a position " + next);
                    twoPos = snakePositions.get(next);
                    skip = true;
                }

                if (nextPositionHasLadder(ladderPositions, next)) {
                    printer.println("Player got chanced upon a ladder at position " + next + "!");
                    twoPos = ladderPositions.get(next);
                    skip = true;
                }

                if (!skip) {
                    twoPos = next;
                }
                printer.println("Next position for player two is " + twoPos);
                skip = false;
                player = 3;
                printer.println("Player three will play next turn");

            } else if (player == 3) {

                int next = threePos + nextNum;

                if (next > 100) {
                    printer.println("Player three needs to score exactly " + (100 - threePos) + " on dice roll to win. Passing chance.");
                    skip = true;
                }

                if (next == 100) {
                    printer.println("Player three wins! Game finished.");
                    return;
                }

                if (startsWithOtherThanSix(threePos, nextNum)) {
                    printer.println("Player three did not score 6. First a 6 needs to be scored to start moving on board.");
                    skip = true;
                }

                if (nextPositionHasSnake(snakePositions, next)) {
                    printer.println("Player got bit by snake a position " + next);
                    threePos = snakePositions.get(next);
                    skip = true;
                }

                if (nextPositionHasLadder(ladderPositions, next)) {
                    printer.println("Player got chanced upon a ladder at position " + next + "!");
                    threePos = ladderPositions.get(next);
                    skip = true;
                }

                if (!skip) {
                    threePos = next;
                }
                printer.println("Next position for player three is " + threePos);
                skip = false;
                player = 4;
                printer.println("Player four will play next turn");

            } else {

                int next = fourPos + nextNum;

                if (next > 100) {
                    printer.println("Player four needs to score exactly " + (100 - fourPos) + " on dice roll to win. Passing chance.");
                    skip = true;
                }

                if (next == 100) {
                    printer.println("Player four wins! Game finished.");
                    return;
                }

                if (startsWithOtherThanSix(fourPos, nextNum)) {
                    printer.println("Player four did not score 6. First a 6 needs to be scored to start moving on board.");
                    skip = true;
                }

                if (nextPositionHasSnake(snakePositions, next)) {
                    printer.println("Player got bit by snake a position " + next);
                    fourPos = snakePositions.get(next);
                    skip = true;
                }

                if (nextPositionHasLadder(ladderPositions, next)) {
                    printer.println("Player got chanced upon a ladder at position " + next + "!");
                    fourPos = ladderPositions.get(next);
                    skip = true;
                }

                if (!skip) {
                    fourPos = next;
                }
                printer.println("Next position for player four is " + fourPos);
                skip = false;
                player = 1;
                printer.println("Player one will play next turn");
            }

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

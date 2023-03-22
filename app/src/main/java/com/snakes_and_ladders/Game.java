package com.snakes_and_ladders;

import com.snakes_and_ladders.input.DiceRoll;
import com.snakes_and_ladders.printer.Printer;

import java.util.HashMap;
import java.util.Map;

public class Game {

    private final DiceRoll diceRoll;
    private final Printer printer;

    public Game(DiceRoll diceRoll, Printer printer) {
        this.diceRoll = diceRoll;
        this.printer = printer;
    }

    public void play() {
        Map<Integer, Integer> snkPos = new HashMap<>() {
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
        Map<Integer, Integer> ldrPos = new HashMap<>() {
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

                if (onePos == 0 && nextNum != 6) {
                    printer.println("Player one did not score 6. First a 6 needs to be scored to start moving on board.");
                    skip = true;
                }

                if (snkPos.get(next) != null) {
                    printer.println("Player got bit by snake a position " + next);
                    onePos = snkPos.get(next);
                    skip = true;
                }

                if (ldrPos.get(next) != null) {
                    printer.println("Player got chanced upon a ladder at position " + next + "!");
                    onePos = ldrPos.get(next);
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

                if (twoPos == 0 && nextNum != 6) {
                    printer.println("Player two did not score 6. First a 6 needs to be scored to start moving on board.");
                    skip = true;
                }

                if (snkPos.get(next) != null) {
                    printer.println("Player got bit by snake a position " + next);
                    twoPos = snkPos.get(next);
                    skip = true;
                }

                if (ldrPos.get(next) != null) {
                    printer.println("Player got chanced upon a ladder at position " + next + "!");
                    twoPos = ldrPos.get(next);
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

                if (threePos == 0 && nextNum != 6) {
                    printer.println("Player three did not score 6. First a 6 needs to be scored to start moving on board.");
                    skip = true;
                }

                if (snkPos.get(next) != null) {
                    printer.println("Player got bit by snake a position " + next);
                    threePos = snkPos.get(next);
                    skip = true;
                }

                if (ldrPos.get(next) != null) {
                    printer.println("Player got chanced upon a ladder at position " + next + "!");
                    threePos = ldrPos.get(next);
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

                if (fourPos == 0 && nextNum != 6) {
                    printer.println("Player four did not score 6. First a 6 needs to be scored to start moving on board.");
                    skip = true;
                }

                if (snkPos.get(next) != null) {
                    printer.println("Player got bit by snake a position " + next);
                    fourPos = snkPos.get(next);
                    skip = true;
                }

                if (ldrPos.get(next) != null) {
                    printer.println("Player got chanced upon a ladder at position " + next + "!");
                    fourPos = ldrPos.get(next);
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
}

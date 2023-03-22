package com.snakes_and_ladders;


import com.snakes_and_ladders.input.DiceRoll;
import com.snakes_and_ladders.input.DiceRollImpl;
import com.snakes_and_ladders.printer.Printer;
import com.snakes_and_ladders.printer.PrinterImpl;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        DiceRoll diceRoll = new DiceRollImpl();
        Printer printer = new PrinterImpl();
        Game game = new Game(diceRoll, printer, new HashMap<>() {
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
        }, new HashMap<>() {
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
        });
        game.play();
        System.exit(1);
    }

}

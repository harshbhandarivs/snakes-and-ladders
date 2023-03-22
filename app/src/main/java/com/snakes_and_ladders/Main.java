package com.snakes_and_ladders;


import com.snakes_and_ladders.input.DiceRoll;
import com.snakes_and_ladders.input.DiceRollImpl;
import com.snakes_and_ladders.printer.Printer;
import com.snakes_and_ladders.printer.PrinterImpl;

public class Main {

    public static void main(String[] args) {
        DiceRoll diceRoll = new DiceRollImpl();
        Printer printer = new PrinterImpl();
        Game game = new Game(diceRoll, printer);
        game.play();
        System.exit(1);
    }

}

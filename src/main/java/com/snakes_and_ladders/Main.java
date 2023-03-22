package main.java.com.snakes_and_ladders;

import main.java.com.snakes_and_ladders.input.DiceRollImpl;
import main.java.com.snakes_and_ladders.printer.PrinterImpl;

public class Main {

    public static void main(String[] args) {
        Game game = new Game(new DiceRollImpl(), new PrinterImpl());
        game.play();
    }

}

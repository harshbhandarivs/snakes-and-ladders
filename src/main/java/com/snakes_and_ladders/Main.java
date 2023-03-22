package main.java.com.snakes_and_ladders;

import main.java.com.snakes_and_ladders.input.DiceRollImpl;

public class Main {

    public static void main(String[] args) {
        Game game = new Game(new DiceRollImpl());
        game.play();
    }

}

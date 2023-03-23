package com.snakes_and_ladders;

import com.snakes_and_ladders.input.DiceRoll;
import com.snakes_and_ladders.printer.Prompt;

import java.util.Map;

public class Game {

    private final DiceRoll diceRoll;
    private final Prompt prompt;
    private final Map<Integer, Integer> snakePositions;
    private final Map<Integer, Integer> ladderPositions;
    private final int[] playerPositions;

    public Game(DiceRoll diceRoll, Prompt prompt, Map<Integer, Integer> snakePositions, Map<Integer, Integer> ladderPositions) {
        this.diceRoll = diceRoll;
        this.prompt = prompt;
        this.snakePositions = snakePositions;
        this.ladderPositions = ladderPositions;
        this.playerPositions = new int[4];
    }

    public void play() {
        int currentPlayerIndex = 0;
        boolean skip = false;


        //continue to play the game until it is over
        while (true) {

            int nextNum = diceRoll.getNumber();
            this.prompt.diceRollOutcome(currentPlayerIndex, nextNum);
            int next = this.playerPositions[currentPlayerIndex] + nextNum;

            if (isPositionMoreThanHundred(next)) {
                this.prompt.playerPositionIsMoreThanHundred(currentPlayerIndex, this.playerPositions[currentPlayerIndex]);
                skip = true;
            }

            if (isPositionHundred(next)) {
                this.prompt.winner(currentPlayerIndex);
                break;
            }

            if (startsWithOtherThanSix(this.playerPositions[currentPlayerIndex], nextNum)) {
                this.prompt.playerDidNotStartWithSix(currentPlayerIndex);
                skip = true;
            }

            if (isPositionContainingSnake(next)) {
                this.prompt.playerBitBySnake(next);
                this.playerPositions[currentPlayerIndex] = snakePositions.get(next);
                skip = true;
            }

            if (isPositionContainingLadder(next)) {
                this.prompt.playerChancedLadder(next);
                this.playerPositions[currentPlayerIndex] = ladderPositions.get(next);
                skip = true;
            }

            if (!skip) {
                this.playerPositions[currentPlayerIndex] = next;
            }

            this.prompt.playerNextPosition(currentPlayerIndex, this.playerPositions[currentPlayerIndex]);
            skip = false;
            currentPlayerIndex = (currentPlayerIndex + 1) % 4;
            this.prompt.nextPlayerTurn(currentPlayerIndex);
        }
    }

    private boolean isPositionMoreThanHundred(int position) {
        return position > 100;
    }

    private boolean isPositionHundred(int position) {
        return position == 100;
    }

    private boolean isPositionContainingLadder(int position) {
        return this.ladderPositions.get(position) != null;
    }

    private boolean isPositionContainingSnake(int position) {
        return this.snakePositions.get(position) != null;
    }

    private boolean startsWithOtherThanSix(int currentPosition, int nextNum) {
        return currentPosition == 0 && nextNum != 6;
    }
}

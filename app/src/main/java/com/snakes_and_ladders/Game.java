package com.snakes_and_ladders;

import com.snakes_and_ladders.entity.board.Board;
import com.snakes_and_ladders.entity.dice.Dice;
import com.snakes_and_ladders.entity.player.Player;
import com.snakes_and_ladders.printer.Prompt;

public class Game {

    private final Dice diceRoll;
    private final Prompt prompt;
    private final Board board;
    private final Player[] players;

    public Game(Dice diceRoll, Prompt prompt, Board board) {
        this.diceRoll = diceRoll;
        this.prompt = prompt;
        this.board = board;
        this.players = new Player[4];
        for (int i=0;i<4;i++) {
            this.players[i] = new Player();
        }
    }

    public void play() {
        int currentPlayerIndex = 0;

        //continue to play the game until it is over
        while (true) {

            int diceRoll = getDiceRoll(currentPlayerIndex);

            if (isGameOver(currentPlayerIndex, diceRoll)) break;

            updatePlayerPosition(currentPlayerIndex, diceRoll);

            currentPlayerIndex = incrementAndPromptCurrentPlayerIndex(currentPlayerIndex);
        }
    }

    private int incrementAndPromptCurrentPlayerIndex(int currentPlayerIndex) {
        currentPlayerIndex = (currentPlayerIndex + 1) % 4;
        this.prompt.nextPlayerTurn(currentPlayerIndex);
        return currentPlayerIndex;
    }

    private int getDiceRoll(int currentPlayerIndex) {
        int nextNum = diceRoll.roll();
        this.prompt.diceRollOutcome(currentPlayerIndex, nextNum);
        return nextNum;
    }

    private boolean isGameOver(int currentPlayerIndex, int nextNum) {
        if (isPositionHundred(this.players[currentPlayerIndex].getPosition() + nextNum)) {
            this.prompt.winner(currentPlayerIndex);
            return true;
        }
        return false;
    }

    private void updatePlayerPosition(int currentPlayerIndex, int nextNum) {
        boolean skip = false;
        int next = this.players[currentPlayerIndex].getPosition() + nextNum;

        if (isPositionMoreThanHundred(next)) {
            this.prompt.playerPositionIsMoreThanHundred(currentPlayerIndex, this.players[currentPlayerIndex].getPosition());
            skip = true;
        }

        if (startsWithOtherThanSix(this.players[currentPlayerIndex].getPosition(), nextNum)) {
            this.prompt.playerDidNotStartWithSix(currentPlayerIndex);
            skip = true;
        }

        if (isPositionContainingSnake(next)) {
            this.prompt.playerBitBySnake(next);
            this.players[currentPlayerIndex].setPosition(this.board.snakePositions().getTailPositionFor(next));
            skip = true;
        }

        if (isPositionContainingLadder(next)) {
            this.prompt.playerChancedLadder(next);
            this.players[currentPlayerIndex].setPosition(this.board.ladderPositions().getEndPositionOfLadderAt(next));
            skip = true;
        }

        if (!skip) {
            this.players[currentPlayerIndex].setPosition(next);
        }

        this.prompt.playerNextPosition(currentPlayerIndex, this.players[currentPlayerIndex].getPosition());
    }

    private boolean isPositionMoreThanHundred(int position) {
        return position > 100;
    }

    private boolean isPositionHundred(int position) {
        return position == 100;
    }

    private boolean isPositionContainingLadder(int position) {
        return this.board.ladderPositions().isLadderPresentAt(position);
    }

    private boolean isPositionContainingSnake(int position) {
        return this.board.snakePositions().isSnakeHeadPresentAt(position);
    }

    private boolean startsWithOtherThanSix(int currentPosition, int nextNum) {
        return currentPosition == 0 && nextNum != 6;
    }
}

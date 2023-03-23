package com.snakes_and_ladders;

import com.snakes_and_ladders.input.DiceRoll;
import com.snakes_and_ladders.input.DiceRollStub;
import com.snakes_and_ladders.printer.PrinterStub;
import com.snakes_and_ladders.printer.Prompt;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Stream;

class GameTest {

    public static Stream<Arguments> provideOutcomes() {
        return Stream.of(
                Arguments.of(new DiceRollStub(
                        new ArrayList<>(List.of(4, 6, 6, 2, 2, 1, 3, 2, 6, 3, 1, 3, 6, 3, 2, 2, 6, 3, 5, 5, 2, 2, 3, 3, 4, 3, 5,
                                1, 2, 5, 4, 6, 4, 6, 6, 4, 2, 1, 5, 3, 5, 2, 4, 4, 2, 5, 6, 6, 3, 3, 1, 5, 1, 1, 1, 4))),
                        List.of("Player 1 got dice roll of 4",
                        "Player one did not score 6. First a 6 needs to be scored to start moving on board.",
                        "Next position for player one is 0",
                        "Player two will play next turn",
                        "Player 2 got dice roll of 6",
                        "Next position for player two is 6",
                        "Player three will play next turn",
                        "Player 3 got dice roll of 6",
                        "Next position for player three is 6",
                        "Player four will play next turn",
                        "Player 4 got dice roll of 2",
                        "Player four did not score 6. First a 6 needs to be scored to start moving on board.",
                        "Next position for player four is 0",
                        "Player one will play next turn",
                        "Player 1 got dice roll of 2",
                        "Player one did not score 6. First a 6 needs to be scored to start moving on board.",
                        "Next position for player one is 0",
                        "Player two will play next turn",
                        "Player 2 got dice roll of 1",
                        "Next position for player two is 7",
                        "Player three will play next turn",
                        "Player 3 got dice roll of 3",
                        "Player got chanced upon a ladder at position 9!",
                        "Next position for player three is 32",
                        "Player four will play next turn",
                        "Player 4 got dice roll of 2",
                        "Player four did not score 6. First a 6 needs to be scored to start moving on board.",
                        "Next position for player four is 0",
                        "Player one will play next turn",
                        "Player 1 got dice roll of 6",
                        "Next position for player one is 6",
                        "Player two will play next turn",
                        "Player 2 got dice roll of 3",
                        "Next position for player two is 10",
                        "Player three will play next turn",
                        "Player 3 got dice roll of 1",
                        "Next position for player three is 33",
                        "Player four will play next turn",
                        "Player 4 got dice roll of 3",
                        "Player four did not score 6. First a 6 needs to be scored to start moving on board.",
                        "Next position for player four is 0",
                        "Player one will play next turn",
                        "Player 1 got dice roll of 6",
                        "Player got chanced upon a ladder at position 12!",
                        "Next position for player one is 53",
                        "Player two will play next turn",
                        "Player 2 got dice roll of 3",
                        "Next position for player two is 13",
                        "Player three will play next turn",
                        "Player 3 got dice roll of 2",
                        "Next position for player three is 35",
                        "Player four will play next turn",
                        "Player 4 got dice roll of 2",
                        "Player four did not score 6. First a 6 needs to be scored to start moving on board.",
                        "Next position for player four is 0",
                        "Player one will play next turn",
                        "Player 1 got dice roll of 6",
                        "Player got bit by snake a position 59",
                        "Next position for player one is 21",
                        "Player two will play next turn",
                        "Player 2 got dice roll of 3",
                        "Next position for player two is 16",
                        "Player three will play next turn",
                        "Player 3 got dice roll of 5",
                        "Next position for player three is 40",
                        "Player four will play next turn",
                        "Player 4 got dice roll of 5",
                        "Player four did not score 6. First a 6 needs to be scored to start moving on board.",
                        "Next position for player four is 0",
                        "Player one will play next turn",
                        "Player 1 got dice roll of 2",
                        "Next position for player one is 23",
                        "Player two will play next turn",
                        "Player 2 got dice roll of 2",
                        "Player got bit by snake a position 18",
                        "Next position for player two is 2",
                        "Player three will play next turn",
                        "Player 3 got dice roll of 3",
                        "Next position for player three is 43",
                        "Player four will play next turn",
                        "Player 4 got dice roll of 3",
                        "Player four did not score 6. First a 6 needs to be scored to start moving on board.",
                        "Next position for player four is 0",
                        "Player one will play next turn",
                        "Player 1 got dice roll of 4",
                        "Player got chanced upon a ladder at position 27!",
                        "Next position for player one is 66",
                        "Player two will play next turn",
                        "Player 2 got dice roll of 3",
                        "Next position for player two is 5",
                        "Player three will play next turn",
                        "Player 3 got dice roll of 5",
                        "Next position for player three is 48",
                        "Player four will play next turn",
                        "Player 4 got dice roll of 1",
                        "Player four did not score 6. First a 6 needs to be scored to start moving on board.",
                        "Next position for player four is 0",
                        "Player one will play next turn",
                        "Player 1 got dice roll of 2",
                        "Next position for player one is 68",
                        "Player two will play next turn",
                        "Player 2 got dice roll of 5",
                        "Next position for player two is 10",
                        "Player three will play next turn",
                        "Player 3 got dice roll of 4",
                        "Next position for player three is 52",
                        "Player four will play next turn",
                        "Player 4 got dice roll of 6",
                        "Next position for player four is 6",
                        "Player one will play next turn",
                        "Player 1 got dice roll of 4",
                        "Player got bit by snake a position 72",
                        "Next position for player one is 12",
                        "Player two will play next turn",
                        "Player 2 got dice roll of 6",
                        "Next position for player two is 16",
                        "Player three will play next turn",
                        "Player 3 got dice roll of 6",
                        "Next position for player three is 58",
                        "Player four will play next turn",
                        "Player 4 got dice roll of 4",
                        "Next position for player four is 10",
                        "Player one will play next turn",
                        "Player 1 got dice roll of 2",
                        "Next position for player one is 14",
                        "Player two will play next turn",
                        "Player 2 got dice roll of 1",
                        "Player got chanced upon a ladder at position 17!",
                        "Next position for player two is 90",
                        "Player three will play next turn",
                        "Player 3 got dice roll of 5",
                        "Player got chanced upon a ladder at position 63!",
                        "Next position for player three is 88",
                        "Player four will play next turn",
                        "Player 4 got dice roll of 3",
                        "Next position for player four is 13",
                        "Player one will play next turn",
                        "Player 1 got dice roll of 5",
                        "Next position for player one is 19",
                        "Player two will play next turn",
                        "Player 2 got dice roll of 2",
                        "Player got bit by snake a position 92",
                        "Next position for player two is 26",
                        "Player three will play next turn",
                        "Player 3 got dice roll of 4",
                        "Player got bit by snake a position 92",
                        "Next position for player three is 26",
                        "Player four will play next turn",
                        "Player 4 got dice roll of 4",
                        "Player got chanced upon a ladder at position 17!",
                        "Next position for player four is 90",
                        "Player one will play next turn",
                        "Player 1 got dice roll of 2",
                        "Player got chanced upon a ladder at position 21!",
                        "Next position for player one is 50",
                        "Player two will play next turn",
                        "Player 2 got dice roll of 5",
                        "Next position for player two is 31",
                        "Player three will play next turn",
                        "Player 3 got dice roll of 6",
                        "Next position for player three is 32",
                        "Player four will play next turn",
                        "Player 4 got dice roll of 6",
                        "Next position for player four is 96",
                        "Player one will play next turn",
                        "Player 1 got dice roll of 3",
                        "Next position for player one is 53",
                        "Player two will play next turn",
                        "Player 2 got dice roll of 3",
                        "Next position for player two is 34",
                        "Player three will play next turn",
                        "Player 3 got dice roll of 1",
                        "Next position for player three is 33",
                        "Player four will play next turn",
                        "Player 4 got dice roll of 5",
                        "Player four needs to score exactly 4 on dice roll to win. Passing chance.",
                        "Next position for player four is 96", "Player one will play next turn",
                        "Player 1 got dice roll of 1", "Next position for player one is 54",
                        "Player two will play next turn", "Player 2 got dice roll of 1",
                        "Next position for player two is 35", "Player three will play next turn",
                        "Player 3 got dice roll of 1", "Next position for player three is 34",
                        "Player four will play next turn", "Player 4 got dice roll of 4",
                        "Player four wins! Game finished.")),
        Arguments.of(new DiceRollStub(new ArrayList<>(List.of(2,
                2, 6, 5, 3, 4, 3, 6, 5, 5, 3, 2, 5, 1, 3, 4, 4, 5, 5, 5, 3, 4, 4, 4, 1, 3, 3, 6, 6, 1, 4, 3, 2, 4, 6, 2, 2, 2, 4, 3, 3, 1, 4, 5, 2, 3, 6, 1, 3, 2, 3, 2, 2, 1, 1, 5, 2, 5, 1, 2, 6, 2, 6, 5, 6, 2, 1, 4
        ))), List.of("Player 1 got dice roll of 2",
                "Player one did not score 6. First a 6 needs to be scored to start moving on board.",
                "Next position for player one is 0",
                "Player two will play next turn",
                "Player 2 got dice roll of 2",
                "Player two did not score 6. First a 6 needs to be scored to start moving on board.",
                "Next position for player two is 0",
                "Player three will play next turn",
                "Player 3 got dice roll of 6",
                "Next position for player three is 6",
                "Player four will play next turn",
                "Player 4 got dice roll of 5",
                "Player four did not score 6. First a 6 needs to be scored to start moving on board.",
                "Next position for player four is 0",
                "Player one will play next turn",
                "Player 1 got dice roll of 3",
                "Player one did not score 6. First a 6 needs to be scored to start moving on board.",
                "Next position for player one is 0",
                "Player two will play next turn",
                "Player 2 got dice roll of 4",
                "Player two did not score 6. First a 6 needs to be scored to start moving on board.",
                "Next position for player two is 0",
                "Player three will play next turn",
                "Player 3 got dice roll of 3",
                "Player got chanced upon a ladder at position 9!",
                "Next position for player three is 32",
                "Player four will play next turn",
                "Player 4 got dice roll of 6",
                "Next position for player four is 6",
                "Player one will play next turn",
                "Player 1 got dice roll of 5",
                "Player one did not score 6. First a 6 needs to be scored to start moving on board.",
                "Next position for player one is 0",
                "Player two will play next turn",
                "Player 2 got dice roll of 5",
                "Player two did not score 6. First a 6 needs to be scored to start moving on board.",
                "Next position for player two is 0",
                "Player three will play next turn",
                "Player 3 got dice roll of 3",
                "Next position for player three is 35",
                "Player four will play next turn",
                "Player 4 got dice roll of 2",
                "Next position for player four is 8",
                "Player one will play next turn",
                "Player 1 got dice roll of 5",
                "Player one did not score 6. First a 6 needs to be scored to start moving on board.",
                "Next position for player one is 0",
                "Player two will play next turn",
                "Player 2 got dice roll of 1",
                "Player two did not score 6. First a 6 needs to be scored to start moving on board.",
                "Next position for player two is 0",
                "Player three will play next turn",
                "Player 3 got dice roll of 3",
                "Player got bit by snake a position 38",
                "Next position for player three is 11",
                "Player four will play next turn",
                "Player 4 got dice roll of 4",
                "Player got chanced upon a ladder at position 12!",
                "Next position for player four is 53",
                "Player one will play next turn",
                "Player 1 got dice roll of 4",
                "Player one did not score 6. First a 6 needs to be scored to start moving on board.",
                "Next position for player one is 0",
                "Player two will play next turn",
                "Player 2 got dice roll of 5",
                "Player two did not score 6. First a 6 needs to be scored to start moving on board.",
                "Next position for player two is 0",
                "Player three will play next turn",
                "Player 3 got dice roll of 5",
                "Next position for player three is 16",
                "Player four will play next turn",
                "Player 4 got dice roll of 5",
                "Next position for player four is 58",
                "Player one will play next turn",
                "Player 1 got dice roll of 3",
                "Player one did not score 6. First a 6 needs to be scored to start moving on board.",
                "Next position for player one is 0",
                "Player two will play next turn",
                "Player 2 got dice roll of 4",
                "Player two did not score 6. First a 6 needs to be scored to start moving on board.",
                "Next position for player two is 0",
                "Player three will play next turn",
                "Player 3 got dice roll of 4",
                "Next position for player three is 20",
                "Player four will play next turn",
                "Player 4 got dice roll of 4",
                "Next position for player four is 62",
                "Player one will play next turn",
                "Player 1 got dice roll of 1",
                "Player one did not score 6. First a 6 needs to be scored to start moving on board.",
                "Next position for player one is 0",
                "Player two will play next turn",
                "Player 2 got dice roll of 3",
                "Player two did not score 6. First a 6 needs to be scored to start moving on board.",
                "Next position for player two is 0",
                "Player three will play next turn",
                "Player 3 got dice roll of 3",
                "Next position for player three is 23",
                "Player four will play next turn",
                "Player 4 got dice roll of 6",
                "Next position for player four is 68",
                "Player one will play next turn",
                "Player 1 got dice roll of 6",
                "Next position for player one is 6",
                "Player two will play next turn",
                "Player 2 got dice roll of 1",
                "Player two did not score 6. First a 6 needs to be scored to start moving on board.",
                "Next position for player two is 0",
                "Player three will play next turn",
                "Player 3 got dice roll of 4",
                "Player got chanced upon a ladder at position 27!",
                "Next position for player three is 66",
                "Player four will play next turn",
                "Player 4 got dice roll of 3",
                "Next position for player four is 71",
                "Player one will play next turn",
                "Player 1 got dice roll of 2",
                "Next position for player one is 8",
                "Player two will play next turn",
                "Player 2 got dice roll of 4",
                "Player two did not score 6. First a 6 needs to be scored to start moving on board.",
                "Next position for player two is 0",
                "Player three will play next turn",
                "Player 3 got dice roll of 6",
                "Player got bit by snake a position 72",
                "Next position for player three is 12",
                "Player four will play next turn",
                "Player 4 got dice roll of 2",
                "Next position for player four is 73",
                "Player one will play next turn",
                "Player 1 got dice roll of 2",
                "Next position for player one is 10",
                "Player two will play next turn",
                "Player 2 got dice roll of 2",
                "Player two did not score 6. First a 6 needs to be scored to start moving on board.",
                "Next position for player two is 0",
                "Player three will play next turn",
                "Player 3 got dice roll of 4",
                "Next position for player three is 16",
                "Player four will play next turn",
                "Player 4 got dice roll of 3",
                "Next position for player four is 76",
                "Player one will play next turn",
                "Player 1 got dice roll of 3",
                "Next position for player one is 13",
                "Player two will play next turn",
                "Player 2 got dice roll of 1",
                "Player two did not score 6. First a 6 needs to be scored to start moving on board.",
                "Next position for player two is 0",
                "Player three will play next turn",
                "Player 3 got dice roll of 4",
                "Next position for player three is 20",
                "Player four will play next turn",
                "Player 4 got dice roll of 5",
                "Next position for player four is 81",
                "Player one will play next turn",
                "Player 1 got dice roll of 2",
                "Next position for player one is 15",
                "Player two will play next turn",
                "Player 2 got dice roll of 3",
                "Player two did not score 6. First a 6 needs to be scored to start moving on board.",
                "Next position for player two is 0",
                "Player three will play next turn",
                "Player 3 got dice roll of 6",
                "Next position for player three is 26",
                "Player four will play next turn",
                "Player 4 got dice roll of 1",
                "Next position for player four is 82",
                "Player one will play next turn",
                "Player 1 got dice roll of 3",
                "Player got bit by snake a position 18",
                "Next position for player one is 2",
                "Player two will play next turn",
                "Player 2 got dice roll of 2",
                "Player two did not score 6. First a 6 needs to be scored to start moving on board.",
                "Next position for player two is 0",
                "Player three will play next turn",
                "Player 3 got dice roll of 3",
                "Player got chanced upon a ladder at position 29!",
                "Next position for player three is 42",
                "Player four will play next turn",
                "Player 4 got dice roll of 2",
                "Next position for player four is 84",
                "Player one will play next turn",
                "Player 1 got dice roll of 2",
                "Next position for player one is 4",
                "Player two will play next turn",
                "Player 2 got dice roll of 1",
                "Player two did not score 6. First a 6 needs to be scored to start moving on board.",
                "Next position for player two is 0",
                "Player three will play next turn",
                "Player 3 got dice roll of 1",
                "Next position for player three is 43",
                "Player four will play next turn",
                "Player 4 got dice roll of 5",
                "Next position for player four is 89",
                "Player one will play next turn",
                "Player 1 got dice roll of 2",
                "Next position for player one is 6",
                "Player two will play next turn",
                "Player 2 got dice roll of 5",
                "Player two did not score 6. First a 6 needs to be scored to start moving on board.",
                "Next position for player two is 0",
                "Player three will play next turn",
                "Player 3 got dice roll of 1",
                "Player got chanced upon a ladder at position 44!",
                "Next position for player three is 73",
                "Player four will play next turn",
                "Player 4 got dice roll of 2",
                "Next position for player four is 91",
                "Player one will play next turn",
                "Player 1 got dice roll of 6",
                "Player got chanced upon a ladder at position 12!",
                "Next position for player one is 53",
                "Player two will play next turn",
                "Player 2 got dice roll of 2",
                "Player two did not score 6. First a 6 needs to be scored to start moving on board.",
                "Next position for player two is 0",
                "Player three will play next turn",
                "Player 3 got dice roll of 6",
                "Next position for player three is 79",
                "Player four will play next turn",
                "Player 4 got dice roll of 5",
                "Next position for player four is 96",
                "Player one will play next turn",
                "Player 1 got dice roll of 6",
                "Player got bit by snake a position 59",
                "Next position for player one is 21",
                "Player two will play next turn",
                "Player 2 got dice roll of 2",
                "Player two did not score 6. First a 6 needs to be scored to start moving on board.",
                "Next position for player two is 0",
                "Player three will play next turn",
                "Player 3 got dice roll of 1",
                "Next position for player three is 80",
                "Player four will play next turn",
                "Player 4 got dice roll of 4",
                "Player four wins! Game finished.")), Arguments.of(new DiceRollStub(
                        new ArrayList<>(List.of(6, 1, 1, 1, 5, 1, 1, 1, 6, 1, 1, 1, 6, 1, 1, 1, 4))), List.of("Player 1 got dice roll of 6",
                        "Next position for player one is 6",
                        "Player two will play next turn",
                        "Player 2 got dice roll of 1",
                        "Player two did not score 6. First a 6 needs to be scored to start moving on board.",
                        "Next position for player two is 0",
                        "Player three will play next turn",
                        "Player 3 got dice roll of 1",
                        "Player three did not score 6. First a 6 needs to be scored to start moving on board.",
                        "Next position for player three is 0",
                        "Player four will play next turn",
                        "Player 4 got dice roll of 1",
                        "Player four did not score 6. First a 6 needs to be scored to start moving on board.",
                        "Next position for player four is 0",
                        "Player one will play next turn",
                        "Player 1 got dice roll of 5",
                        "Next position for player one is 11",
                        "Player two will play next turn",
                        "Player 2 got dice roll of 1",
                        "Player two did not score 6. First a 6 needs to be scored to start moving on board.",
                        "Next position for player two is 0",
                        "Player three will play next turn",
                        "Player 3 got dice roll of 1",
                        "Player three did not score 6. First a 6 needs to be scored to start moving on board.",
                        "Next position for player three is 0",
                        "Player four will play next turn",
                        "Player 4 got dice roll of 1",
                        "Player four did not score 6. First a 6 needs to be scored to start moving on board.",
                        "Next position for player four is 0",
                        "Player one will play next turn",
                        "Player 1 got dice roll of 6",
                        "Player got chanced upon a ladder at position 17!",
                        "Next position for player one is 90",
                        "Player two will play next turn",
                        "Player 2 got dice roll of 1",
                        "Player two did not score 6. First a 6 needs to be scored to start moving on board.",
                        "Next position for player two is 0",
                        "Player three will play next turn",
                        "Player 3 got dice roll of 1",
                        "Player three did not score 6. First a 6 needs to be scored to start moving on board.",
                        "Next position for player three is 0",
                        "Player four will play next turn",
                        "Player 4 got dice roll of 1",
                        "Player four did not score 6. First a 6 needs to be scored to start moving on board.",
                        "Next position for player four is 0",
                        "Player one will play next turn",
                        "Player 1 got dice roll of 6",
                        "Next position for player one is 96",
                        "Player two will play next turn",
                        "Player 2 got dice roll of 1",
                        "Player two did not score 6. First a 6 needs to be scored to start moving on board.",
                        "Next position for player two is 0",
                        "Player three will play next turn",
                        "Player 3 got dice roll of 1",
                        "Player three did not score 6. First a 6 needs to be scored to start moving on board.",
                        "Next position for player three is 0",
                        "Player four will play next turn",
                        "Player 4 got dice roll of 1",
                        "Player four did not score 6. First a 6 needs to be scored to start moving on board.",
                        "Next position for player four is 0",
                        "Player one will play next turn",
                        "Player 1 got dice roll of 4",
                        "Player one wins! Game finished.")));
    }

    @ParameterizedTest
    @MethodSource("provideOutcomes")
    public void shouldPlayGameWithPreSpecifiedOutComes(DiceRoll diceRoll, List<String> output) {
        PrinterStub printer = new PrinterStub();
        Prompt prompt = new Prompt(printer);
        Game game = new Game(diceRoll, prompt, new HashMap<>() {
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

        Assertions.assertEquals(output, printer.getOutputLines());
    }

}

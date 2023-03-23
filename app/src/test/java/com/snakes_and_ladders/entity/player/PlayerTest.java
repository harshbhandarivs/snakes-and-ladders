package com.snakes_and_ladders.entity.player;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PlayerTest {

    @Test
    void defaultValueOfPlayerPositionIsZero() {
        Player player = new Player();

        assertEquals(0, player.getPosition());
    }

    @Test
    void setAndGetPlayerPosition() {
        Player player = new Player();

        player.setPosition(10);

        assertEquals(10, player.getPosition());
    }
}

package com.snakes_and_ladders.entity.ladder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class LadderMapTest {
    @Test
    void startPositionLadderIsPresentInMapAsKey() {
        LadderMap ladderMap = new LadderMap(new Ladder[]{new Ladder(10, 30), new Ladder(20, 40)});

        assertTrue(ladderMap.isLadderPresentAt(10));
        assertTrue(ladderMap.isLadderPresentAt(20));
    }

    @Test
    void endPositionOfLadderIsPresentInMapAsTheValueForGivenKey() {
        LadderMap ladderMap = new LadderMap(new Ladder[]{new Ladder(10, 30), new Ladder(20, 40)});

        assertEquals(30, ladderMap.getEndPositionOfLadderAt(10));
        assertEquals(40, ladderMap.getEndPositionOfLadderAt(20));
    }
}

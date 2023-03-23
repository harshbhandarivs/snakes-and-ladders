package com.snakes_and_ladders.entity.ladder;

import java.util.HashMap;

public class LadderMap extends HashMap<Integer, Integer> {
    public LadderMap(Ladder[] ladders) {
        for(Ladder ladder: ladders) {
            put(ladder.startPosition(), ladder.endPosition());
        }
    }

    public Boolean isLadderPresentAt(int position) {
        return containsKey(position);
    }

    public Integer getEndPositionOfLadderAt(int position) {
        return get(position);
    }
}

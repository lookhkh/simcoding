package com.simcoding.design.strategy.character.model.moves;

import com.simcoding.design.strategy.character.model.Direction;

public class CarStrategy extends AbstractTemplateStrategy {

    @Override
    protected int handleY(Direction dir, int curY) {
        return  dir.getcY() * 3 + curY;
    }

    @Override
    protected int handleX(Direction dir, int curX) {
        return dir.getcX() * 3 + curX;
    }
}

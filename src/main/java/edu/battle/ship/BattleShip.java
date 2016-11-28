package edu.battle.ship;

import edu.battle.exception.IllegalShipCoordinatesException;

/**
 * Created by Aleksandr on 19.11.2016.
 */
public class BattleShip extends  AbstractShip{
    private final static int SIZE = 4;

    @Override
    protected int getShipSize() {
        return SIZE;
    }

    public BattleShip(ShipCoordinates coordinates) throws IllegalShipCoordinatesException {
        super(coordinates);
    }
}

package edu.battle.ship;

import edu.battle.exception.IllegalShipCoordinatesException;

/**
 * Created by Aleksandr on 19.11.2016.
 */
public class Cruiser extends  AbstractShip{
    private final static int SIZE = 3;

    @Override
    protected int getShipSize() {
        return SIZE;
    }

    public Cruiser(ShipCoordinates coordinates) throws IllegalShipCoordinatesException {
        super(coordinates);
    }
}

package edu.battle.ship;

import edu.battle.exception.IllegalShipCoordinatesException;

/**
 * @author Alex on 20.11.2016.
 */
public class Submarine extends  AbstractShip {
    private final static int SIZE = 1;

    @Override
    protected int getShipSize() {
        return SIZE;
    }

    public Submarine(ShipCoordinates coordinates) throws IllegalShipCoordinatesException {
        super(coordinates);
    }
}

package edu.battle.ship;

import edu.battle.exception.IllegalShipCoordinatesException;

/**
 * @author Alex on 20.11.2016.
 */
public class Destroyer extends  AbstractShip {
    private final static int SIZE = 2;

    @Override
    protected int getShipSize() {
        return SIZE;
    }

    public Destroyer(ShipCoordinates coordinates) throws IllegalShipCoordinatesException {
        super(coordinates);
    }
}

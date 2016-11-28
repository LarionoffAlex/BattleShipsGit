package edu.battle.ship;

import edu.battle.exception.IllegalShipCoordinatesException;
import edu.battle.field.CellCoordinates;

import java.util.Set;

/**
 * Created by Aleksandr on 26.11.2016.
 */
public abstract class AbstractShip implements Ship{
    private ShipCoordinates coordinates;

    protected abstract int getShipSize();

    protected AbstractShip(ShipCoordinates coordinates) throws IllegalShipCoordinatesException{
        if (getShipSize() != coordinates.getSize()) {
            throw new IllegalShipCoordinatesException("Ship size mismatch");
        }

        this.coordinates = coordinates;
    }

    @Override
    public Set<CellCoordinates> getShipCells() {
        return coordinates.getShipCells();
    }

    public String toString() {
        return getClass() + ", with coordinates "+coordinates;
    }
}

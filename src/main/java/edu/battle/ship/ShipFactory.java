package edu.battle.ship;

import edu.battle.exception.IllegalShipCoordinatesException;
import edu.battle.field.CellCoordinates;

/**
 * Created by Aleksandr on 26.11.2016.
 */
public class ShipFactory {

    @Deprecated
    public static Ship create(ShipType type, CellCoordinates start, CellCoordinates end) throws IllegalShipCoordinatesException{
        ShipCoordinates shipCoordinates = new ShipCoordinates(start, end);
        return create(type, shipCoordinates);
    }

    public static Ship create(ShipType type, ShipCoordinates shipCoordinates) throws IllegalShipCoordinatesException{
        switch (type) {
            case BATTLE_SHIP:
                return new BattleShip(shipCoordinates);
            case CRUISER:
                return new Cruiser(shipCoordinates);
            case DESTROYER:
                return new Destroyer(shipCoordinates);
            case SUBMARINE:
                return new Submarine(shipCoordinates);

            default:
                throw new RuntimeException("Unknown ship type " + type);
        }
    }

}

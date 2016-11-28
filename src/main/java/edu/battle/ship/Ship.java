package edu.battle.ship;

import edu.battle.field.CellCoordinates;

import java.util.Set;

/**
 * Created by Aleksandr on 19.11.2016.
 */
public interface Ship {

    Set<CellCoordinates> getShipCells();

}

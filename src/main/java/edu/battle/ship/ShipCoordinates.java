package edu.battle.ship;

import edu.battle.exception.IllegalShipCoordinatesException;
import edu.battle.field.CellCoordinates;

import java.util.*;

/**
 * Created by Aleksandr on 26.11.2016.
 */
public class ShipCoordinates {
    private final CellCoordinates start;
    private final CellCoordinates end;
    private final int size;

    public ShipCoordinates(CellCoordinates start, CellCoordinates end) throws IllegalShipCoordinatesException {
        List<CellCoordinates> cells = new ArrayList<>(2);
        cells.add(start);
        cells.add(end);

        Collections.sort(cells);
        size = getSize(start, end);

        this.start = cells.get(0);
        this.end = cells.get(1);
    }

    private int getSize(CellCoordinates start, CellCoordinates end) throws IllegalShipCoordinatesException {
        int deltaX = getDeltaHorizontal(start, end);
        int deltaY = getDeltaVertical(start, end);

        if (deltaX > 0 && deltaY > 0) {
            throw new IllegalShipCoordinatesException("Ship should be either vertical or horizontal");
        }

        return deltaX + deltaY + 1;
    }


    private int getDeltaHorizontal(CellCoordinates start, CellCoordinates end) {
        return getDelta(start, end, 0);
    }

    private int getDeltaVertical(CellCoordinates start, CellCoordinates end) {
        return getDelta(start, end, 1);
    }

    private int getDelta(CellCoordinates start, CellCoordinates end, int idx) {
        char startChar = start.getCoordinates().charAt(idx);
        char endChar = end.getCoordinates().charAt(idx);
        return Math.abs(startChar - endChar);
    }

    public int getSize() {
        return size;
    }


    public Set<CellCoordinates> getShipCells() {
        Set<CellCoordinates> result = new HashSet<>(4);
        result.add(start);

        int delta = getDeltaHorizontal(start, end);
        if (delta > 0 ) {
            int limit = start.getX()+delta;
            for (char x = start.getX(); x<=limit; x++) {
                CellCoordinates coordinates = new CellCoordinates(x, start.getY());
                result.add(coordinates);
            }
        }

        delta = getDeltaVertical(start, end);
        if (delta > 0) {
            int limit = start.getY()+delta;
            for (int y = start.getY(); y<=limit; y++) {
                CellCoordinates coordinates = new CellCoordinates(start.getX(), y);
                result.add(coordinates);
            }
        }


        return result;
    }

    @Override
    public String toString() {
        return start + " - " + end;
    }
}

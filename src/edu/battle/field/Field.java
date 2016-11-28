package edu.battle.field;

import edu.battle.ship.BattleShip;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Aleksandr on 19.11.2016.
 */
public class Field {
    private final Map<CellCoordinates, Cell> cells;
    private final int size;

    public Field(int size) {
        this.size = size;
        cells = new HashMap<>(size * size);
        fill();
        dummyFill();
    }

    private void fill() {
        for (char x = 'a'; x<'a'+size; x++) {
            for (int y = 1; y <= size; y++) {
                CellCoordinates cellCoordinates = new CellCoordinates(x, y);
                Cell cell = new Cell();
                cells.put(cellCoordinates, cell);
            }
        }
    }

    public void print() {
        System.out.println("    A  B  C  D  E  F  G  H  J  I");
        for (int y = 1; y <= size; y++) {
            if (y<10) {
                System.out.print(y + " |");
            }else {
                System.out.print(y + "|");
            }
            for (char x = 'a'; x < 'a' + size; x++) {
                CellCoordinates cellCoordinates = new CellCoordinates(x, y);
                System.out.print(cells.get(cellCoordinates) + "_|");
            }

            System.out.println();
        }
    }

    // TODO remove
    private void dummyFill() {
        CellCoordinates cellCoordinates = new CellCoordinates('b',3);
        Cell cell = cells.get(cellCoordinates);
        cell.setChecked(true);

        cells.get(new CellCoordinates("d8")).setChecked(true);

        cells.get(new CellCoordinates("a1")).setShip(new BattleShip());
        cells.get(new CellCoordinates("a10")).setShip(new BattleShip());
    }
}

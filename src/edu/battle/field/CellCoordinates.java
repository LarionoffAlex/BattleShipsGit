package edu.battle.field;

/**
 * Created by Aleksandr on 19.11.2016.
 */
public class CellCoordinates {
    private final String coordinates;

    public CellCoordinates(char x, int y) {
        coordinates = String.valueOf(x).toUpperCase() + y;
    }

    public CellCoordinates(String coordinates) {
        this.coordinates = coordinates.toUpperCase();
    }

    public String getCoordinates() {
        return coordinates;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CellCoordinates that = (CellCoordinates) o;

        return getCoordinates().equals(that.getCoordinates());

    }

    @Override
    public int hashCode() {
        return getCoordinates().hashCode();
    }
}

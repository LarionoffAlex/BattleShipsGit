package edu.battle.field;

/**
 * Created by Aleksandr on 19.11.2016.
 */
public class CellCoordinates implements Comparable<CellCoordinates>{
    private final String coordinates;

    public CellCoordinates(char x, int y) {
        coordinates = String.valueOf(x).toUpperCase() + y;
    }

    public CellCoordinates(char x, String y) {
        this(x + y);
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

    public char getX() {
        return coordinates.charAt(0);
    }

    public int getY() {
        return Integer.valueOf(coordinates.substring(1));
    }


    @Override
    public int hashCode() {
        return getCoordinates().hashCode();
    }

    @Override
    public int compareTo(CellCoordinates o) {
        int result = 0;
        Character x1 = getX();
        Character x2 = o.getX();
        result = x1.compareTo(x2);

        if (result !=0) {
            return result;
        }

        Integer y1 = getY();
        Integer y2 = o.getY();
        return y1.compareTo(y2);
    }

    public String toString() {
        return getCoordinates();
    }
}

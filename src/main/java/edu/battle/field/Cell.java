package edu.battle.field;

import edu.battle.ship.Ship;

/**
 * Created by Aleksandr on 19.11.2016.
 */
public class Cell {
    private Ship ship;

    private boolean available;
    private boolean checked;

    public Cell() {
        available = true;
    }

    public Ship getShip() {
        return ship;
    }

    public void setShip(Ship ship) {
        this.ship = ship;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public boolean isChecked() {
        return checked;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }

    @Override
    public String toString() {
        char result = ' ';
        if (ship == null) {
            if (checked) {
                result = '*';
            }
        } else {
            if (checked) {
                result = 'X';
            } else {
                result = '#';
            }
        }

        return String.valueOf(result);
    }
}

package edu.battle.ship;

/**
 * Created by Aleksandr on 26.11.2016.
 */
public enum ShipType {
    BATTLE_SHIP(1),
    CRUISER(2),
    DESTROYER(3),
    SUBMARINE(4);

    private final int quantity;

     ShipType(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }
}

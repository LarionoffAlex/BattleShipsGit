package edu.battle.field;

import edu.battle.player.Player;

/**
 * Created by Aleksandr on 26.11.2016.
 */
public class FieldFactory {
    private static final int SIZE = 10;

    public static Field create(Player player) {
        Field field = new Field(SIZE);
        player.placeShips(field);
        return field;
    }

}

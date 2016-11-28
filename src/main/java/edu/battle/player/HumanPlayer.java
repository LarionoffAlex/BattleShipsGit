package edu.battle.player;

import edu.battle.exception.IllegalShipCoordinatesException;
import edu.battle.field.CellCoordinates;
import edu.battle.field.Field;
import edu.battle.ship.Ship;
import edu.battle.ship.ShipCoordinates;
import edu.battle.ship.ShipFactory;
import edu.battle.ship.ShipType;

import java.util.Scanner;

/**
 * Created by Aleksandr on 19.11.2016.
 */
public class HumanPlayer implements Player {
    private final static Scanner SCANNER = new Scanner(System.in);
    private Field field;

    @Override
    public void placeShips(Field field) {
        this.field = field;

        for (ShipType type : ShipType.values()) {
            placeShip(type);
        }
    }

    private void placeShip(ShipType type) {
        for (int i = 0; i < type.getQuantity(); i++) {

            boolean success = false;
            do {
                System.out.println("you have to put " + type);
                ShipCoordinates shipCoordinates = readShipCoordinates();
                try {
                    Ship ship = ShipFactory.create(type, shipCoordinates);
                    //TODO add ship to the field
                    success = true;
                } catch (IllegalShipCoordinatesException e) {
                    System.out.println(e.getMessage());
                }
            } while (!success);
        }
    }

    private ShipCoordinates readShipCoordinates() {
        do {
            String coordinates = readCommand();
            String startCoordinatesLine = coordinates.substring(0, 2);
            String endCoordinatesLine = null;

            try {
                endCoordinatesLine = coordinates.substring(2, 4);
            } catch (Exception e) {
                endCoordinatesLine = startCoordinatesLine;
            }


            CellCoordinates startCoordinates = new CellCoordinates(startCoordinatesLine);
            CellCoordinates endCoordinates = new CellCoordinates(endCoordinatesLine);


            try {
                return new ShipCoordinates(startCoordinates, endCoordinates);
            } catch (IllegalShipCoordinatesException e) {
                System.out.println(e.getMessage());
            }
        } while (true);
    }

    //TODO refactor
    private String readCommand() {
        String command = SCANNER.next();

        if (command.equals("?")) {
            field.print();
            return readCommand();
        } else {
            return command;
        }

    }
}

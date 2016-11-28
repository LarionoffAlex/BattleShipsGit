import edu.battle.field.CellCoordinates;
import edu.battle.field.Field;
import edu.battle.field.FieldFactory;
import edu.battle.player.HumanPlayer;
import edu.battle.player.Player;
import edu.battle.ship.Ship;
import edu.battle.ship.ShipCoordinates;
import edu.battle.ship.ShipFactory;
import edu.battle.ship.ShipType;

/**
 * Created by Aleksandr on 26.11.2016.
 */
public class Test {
    public static void main(String[] args) throws Exception{
        //   printField();
        checkShipCoordinates();
        testCreateShips();
        placeShips();
    }


    private static void checkShipCoordinates() {
        System.out.println();
        System.out.println("checkShipCoordinates..");
        CellCoordinates a1 = new CellCoordinates("a1");
        CellCoordinates a5 = new CellCoordinates("A5");
        CellCoordinates c3 = new CellCoordinates("c3");

        try {
            new ShipCoordinates(a1, a5);
            System.out.println("A1-A5 are valid coordinates");
        } catch (Exception e) {
            System.out.println("We should not see this message");
        }

        try {
            new ShipCoordinates(a1, c3);
            System.out.println("We should not see this message");
        } catch (Exception e) {
            System.out.println("A1-C3 are invalid coordinates");
        }

        try {
            new ShipCoordinates(a5, c3);
            System.out.println("We should not see this message");
        } catch (Exception e) {
            System.out.println("A5-C3 are invalid coordinates");
        }

    }

    private static void testCreateShips() throws Exception{
        System.out.println();
        System.out.println("create ships...");

        Ship submarine = ShipFactory.create(ShipType.SUBMARINE, new CellCoordinates("a10"), new CellCoordinates("a10"));
        System.out.println("Submarine " +submarine);
        System.out.println(submarine.getShipCells());

        Ship battleShip = ShipFactory.create(ShipType.BATTLE_SHIP, new CellCoordinates("j1"), new CellCoordinates("g1"));
        System.out.println("BattleShip " +battleShip);
        System.out.println(battleShip.getShipCells());

        Ship cruiser = ShipFactory.create(ShipType.CRUISER, new CellCoordinates("b5"), new CellCoordinates("b7"));
        System.out.println("Cruiser " +cruiser);
        System.out.println(cruiser.getShipCells());
    }


    private static void placeShips() {
        System.out.println();
        System.out.println("place ships...");

        Player humanPlayer = new HumanPlayer();
        Field filed = FieldFactory.create(humanPlayer);

    }
}

package edu.battle;

import edu.battle.field.Field;

/**
 * Created by Aleksandr on 19.11.2016.
 * выводить координаты как на рисунке
 * буквы сверху
 * доделать корабли
 * интерфес player продумать
 */
public class Main {
    public static void main(String[] args) {
        Field field = new Field(10);
        field.print();
    }
}

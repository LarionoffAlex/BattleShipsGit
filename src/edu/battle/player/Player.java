package edu.battle.player;

/**
 * Created by Aleksandr on 19.11.2016.
 */
public interface Player {
    void createBattleField(); // создание поля в начале игры
    void move(); // ход
    String getName(); // возврат имени игрока


}

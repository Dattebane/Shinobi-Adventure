package com.cpayne.adventure.game.shinobi;

import com.cpayne.adventure.game.jutsu.Jutsu;
import com.cpayne.adventure.game.shinobi.enemies.Enemy;

public abstract class Shinobi {
    //Properties
    String name = "";
    int age = 0;


    int HP = 100;
    int chakra = 100;

    int atk = 1;


    public abstract String getName();

    public abstract int getHP();

    public abstract int getAtk();

    public abstract int getAge();

    public abstract int getChakra();

    public abstract void setChakra(int chakra);

    public abstract void setHP(int HP);

    public abstract void useJutsu(Shinobi target);
}

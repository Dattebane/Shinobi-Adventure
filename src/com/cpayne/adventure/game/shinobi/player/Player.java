package com.cpayne.adventure.game.shinobi.player;

import com.cpayne.adventure.game.jutsu.FireStyle;
import com.cpayne.adventure.game.jutsu.FireballJutsu;
import com.cpayne.adventure.game.jutsu.Jutsu;
import com.cpayne.adventure.game.shinobi.Shinobi;

public class Player extends Shinobi {
    //Properties
    private String name;
    private int age;

    private Jutsu FireballJutsu;
    private Jutsu[] jutsus = {FireballJutsu};

    private int HP = 100;
    private int chakra = 100;

    private int atk;


    public Player(String name, int age, int HP, int chakra, int atk) {
        this.name = name;
        this.age = age;

        this.HP = HP;
        this.chakra = chakra;

        this.atk = atk;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public int getHP() {
        return HP;
    }

    @Override
    public void setHP(int HP) {
        this.HP = HP;
    }

    @Override
    public int getChakra() {
        return chakra;
    }

    @Override
    public void setChakra(int chakra) {
        this.chakra = chakra;
    }

    @Override
    public int getAtk() {
        return atk;
    }

    @Override
    public void setAtk(int atk) {
        this.atk = atk;
    }
}

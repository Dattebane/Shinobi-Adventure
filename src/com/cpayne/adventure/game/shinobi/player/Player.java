package com.cpayne.adventure.game.shinobi.player;

import com.cpayne.adventure.game.jutsu.Jutsu;
import com.cpayne.adventure.game.shinobi.Shinobi;

public class Player extends Shinobi {
    //Properties
    private String name = "Nini";
    private int age;

    private Jutsu FireballJutsu;
    private Jutsu[] jutsus = {FireballJutsu};

    private int HP = 1000;
    private int maxHP = HP;
    private int chakra = 100;

    private int atk;
    private int def;


    public Player(String name, int age, int chakra, int atk, int def) {
        this.name = name;
        this.age = age;

        this.chakra = chakra;

        this.atk = atk;
        this.def = def;
    }

    @Override
    public String getName() {
        return name;
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
        //System.out.println("Player set chakra called");
    }

    @Override
    public int getAtk() {
        return atk;
    }

    @Override
    public void setAtk(int atk) {
        this.atk = atk;
    }

    @Override
    public int getDef() {
        return def;
    }

    @Override
    public void setDef(int def) {
        this.def = def;
    }

    @Override
    public int getMaxHP() {
        return maxHP;
    }

    @Override
    public void setMaxHP(int maxHP) {
        this.maxHP = maxHP;
    }
}

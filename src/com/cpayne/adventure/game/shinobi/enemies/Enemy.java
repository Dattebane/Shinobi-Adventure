package com.cpayne.adventure.game.shinobi.enemies;

import com.cpayne.adventure.game.shinobi.Shinobi;

import java.util.Random;

public class Enemy extends Shinobi {


    // Properties
    private String name;
    private String[] names = {"Raikage", "Tsuchikage", "Mizukage", "Kazekage", "Hokage", "Hoshikage"};

    private int HP;
    private int maxHP = HP;
    private int atk;
    private int def;

    private Random rand = new Random();

    public Enemy() {
        name = names[rand.nextInt(names.length)];
        HP = rand.nextInt(1000);
        maxHP = HP;
        atk = 1 + rand.nextInt(1000);
        def = 0 + rand.nextInt(1000);
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

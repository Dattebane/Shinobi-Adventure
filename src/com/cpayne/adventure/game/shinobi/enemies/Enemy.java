package com.cpayne.adventure.game.shinobi.enemies;

import com.cpayne.adventure.game.shinobi.Shinobi;

import java.util.Random;

public class Enemy extends Shinobi {


    // Properties
    private String name;
    private String[] names = {"Raikage", "Tsuchikage", "Mizukage", "Kazekage", "Hokage", "Hoshikage"};

    private int HP;
    private int atk;

    private Random rand = new Random();

    public Enemy() {
        name = names[rand.nextInt(names.length)];
        HP = rand.nextInt(100);
        atk = 1 + rand.nextInt(50);
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
}

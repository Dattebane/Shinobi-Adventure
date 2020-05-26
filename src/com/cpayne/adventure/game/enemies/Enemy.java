package com.cpayne.adventure.game.enemies;

import java.util.Random;

public class Enemy {


    // Properties
    private String name;
    private String[] names = {"Raikage", "Tsuchikage", "Mizukage", "Kazekage", "Hokage", "Hoshikage"};

    private int HP;
    private int atk;

    private Random rand = new Random();

    public Enemy() {
        name = names[rand.nextInt(names.length)];
        HP = rand.nextInt(100);
        atk = rand.nextInt(50);
    }

    public int getAtk() {
        int atk = this.atk;
        return atk;
    }

    public int getHP() {
        return HP;
    }

    public String getName(){
        return this.name;
    }

    public void setHP(int currHP) {
        this.HP = currHP;
    }
}

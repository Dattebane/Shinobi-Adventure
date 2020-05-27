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

    public int getAtk() {
        int atk = this.atk;
        return atk;
    }

    @Override
    public int getAge() {
        return 0;
    }

    @Override
    public int getChakra() {
        return 0;
    }

    @Override
    public void setChakra(int chakra) {

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

    @Override
    public void useJutsu(Shinobi target) {

    }
}

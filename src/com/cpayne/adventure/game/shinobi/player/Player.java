package com.cpayne.adventure.game.shinobi.player;

import com.cpayne.adventure.game.jutsu.FireStyleJutsu;
import com.cpayne.adventure.game.shinobi.Shinobi;
import com.cpayne.adventure.game.shinobi.enemies.Enemy;
import com.cpayne.adventure.game.jutsu.Jutsu;

public class Player extends Shinobi {
    //Properties
    private String name;
    private int age;


    private int HP;
    private int chakra;

    private int atk;
    private int burnCounter = 0;


    public Player(String name, int age, int HP, int chakra, int atk) {
        this.name = name;
        this.age = age;

        this.HP = HP;
        this.chakra = chakra;

        this.atk = atk;
    }

    @Override
    public String getName(){
        return name;
    }

    @Override
    public int getHP() {
        return HP;
    }

    @Override
    public int getAtk() {
        return atk;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public int getChakra() {
        return chakra;
    }

    public void setChakra(int chakra) {
        this.chakra = chakra;
    }

    @Override
    public void setHP(int HP) {
        this.HP = HP;
    }

    @Override
    public void useJutsu(Shinobi target) {
        new Jutsu(this, target);
    }

    @Override
    public void burn(FireStyleJutsu fireStyleJutsu) {
        if (burnCounter > 0) {
            this.setHP(this.getHP() - fireStyleJutsu.getDamage());
            this.burnCounter = fireStyleJutsu.getBurnDuration();
            this.burnCounter--;
        }
    }

}

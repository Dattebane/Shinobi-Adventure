package com.cpayne.adventure.game.jutsu;

import com.cpayne.adventure.game.shinobi.Shinobi;

public class Jutsu {
    private String name;
    private int damage;
    private int chakraCost;
    private Shinobi user;
    private Shinobi target;

    //constructor
    public Jutsu(Shinobi user, Shinobi target){
        this.damage = 30;
        this.chakraCost = 30;
        this.name = "Jutsu";

        this.user = user;
        this.target = target;

        target.setHP(target.getHP() - damage);

        System.out.println(user.getName() + " has used " + name + "!");
    }

    public int getDamage() {
        return damage;
    }

    public int getChakraCost() {
        return chakraCost;
    }
}

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

        if(user.getChakra() >= chakraCost){
            target.setHP(target.getHP() - damage);
            user.setChakra(user.getChakra() - chakraCost);

            System.out.println("\t> " + user.getName() + " has used " + name + "! " + damage + " damage dealt!");
        } else {
            System.out.println("\t> You try to use a jutsu that costs too much chakra");
        }
    }

    public int getDamage() {
        return damage;
    }

    public int getChakraCost() {
        return chakraCost;
    }
}

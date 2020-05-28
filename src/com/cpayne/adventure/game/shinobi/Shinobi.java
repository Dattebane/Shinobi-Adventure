package com.cpayne.adventure.game.shinobi;

import com.cpayne.adventure.game.jutsu.FireStyle;
import com.cpayne.adventure.game.jutsu.Jutsu;

public abstract class Shinobi {
    //Properties
    private String name = "";
    private int age = 0;
    private int lvl = 1;


    private int HP;
    private int chakra;

    private int atk;
    private int def;

    private boolean isBurning = false;
    private int burnDuration = 0;
    private int burnDMG = 0;

    private boolean isPoisoned = false;
    private boolean isGenjutsud = false;

    public void attack(Shinobi target, Jutsu attack){
        attack.applyEffects(target);
        //System.out.println("\t Shinobi Attack Method Called");
    }

    public String getName() {
        return this.name;
    }


    public int getAge() {
        return age;
    }

    public int getHP() {
        return this.HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public int getChakra() {
        return chakra;
    }

    public void setChakra(int chakra) {
        this.chakra = chakra;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }

    public boolean isBurning() {
        return isBurning;
    }

    public void setBurning(boolean burning) {
        isBurning = burning;
    }

    public int getBurnDuration() {
        return burnDuration;
    }

    public void setBurnDuration(int burn) {
        this.burnDuration = burn;
    }

    // Get the amount of damage the next burn tick will take
    public int getBurnDMG() {
        return burnDMG;
    }

    // Set the amount of damage the next
    public void setBurnDMG(FireStyle jutsu) {
        this.burnDMG = jutsu.getBurnAmount();
    }
}

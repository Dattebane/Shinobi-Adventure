package com.cpayne.adventure.game.shinobi;

import com.cpayne.adventure.game.jutsu.FireStyle;
import com.cpayne.adventure.game.jutsu.Jutsu;

public abstract class Shinobi {

    //Properties
    private String name = "";
    private int age = 0;
    private int lvl = 1;

    private int maxHP;
    private int HP;
    private int chakra = 45;

    private int atk;
    private int def;

    private int shield = 0;
    private Jutsu shieldReason;


    private int burnDuration = 0;
    private int burnDMG = 0;
    private FireStyle burnReason;

    private boolean isBurning = false;
    private boolean isPoisoned = false;
    private boolean isGenjutsud = false;

    public void attack(Shinobi target, Jutsu attack){
        attack.applyEffects(target);
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

    public abstract int getChakra();

    public abstract void setChakra(int chakra);

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

    public FireStyle getBurnReason() {
        return burnReason;
    }

    public void setBurnReason(FireStyle burnReason) {
        this.burnReason = burnReason;
    }

    public abstract int getMaxHP();

    public abstract void setMaxHP(int maxHP);

    public int getShield() {
        return shield;
    }

    public void setShield(int shield) {
        this.shield = shield;
    }

    public Jutsu getShieldReason() {
        return shieldReason;
    }

    public void setShieldReason(Jutsu shieldReason) {
        this.shieldReason = shieldReason;
    }
}

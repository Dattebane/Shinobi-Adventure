package com.cpayne.adventure.game.shinobi;

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
    private boolean isPoisoned = false;
    private boolean isGenjutsud = false;


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
}

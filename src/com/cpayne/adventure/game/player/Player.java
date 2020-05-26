package com.cpayne.adventure.game.player;

public class Player {
    //Properties
    private String name;
    private int age;


    private int HP;
    private int chakra;

    private int atk;


    public Player(String name, int age, int HP, int chakra, int atk) {
        this.name = name;
        this.age = age;

        this.HP = HP;
        this.chakra = chakra;

        this.atk = atk;
    }

    public int getHP() {
        return HP;
    }

    public int getAtk() {
        return atk;
    }

    public int getAge() {
        return age;
    }

    public int getChakra() {
        return chakra;
    }

    public void setChakra(int chakra) {
        this.chakra = chakra;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }
}

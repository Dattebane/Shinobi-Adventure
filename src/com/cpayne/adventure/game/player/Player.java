package com.cpayne.adventure.game.player;

import kotlin.Triple;

import java.util.Set;

public class Player {
    //Properties
    private String name;
    private int age;

    private int x;
    private int y;      // Coordinates
    private int z;


    private int width = 1;
    private int depth = 1;    // Dimensions
    private int height = 2;

   //private Location location;

    private int maxHP = 100;
    private int maxChakra = 100;

    private int currHP;
    private int currChakra;

    private int str;
    private int spd;
    private int dur;


    public Player() {
    }
}

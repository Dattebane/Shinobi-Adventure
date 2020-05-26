package com.cpayne.adventure.game;

import com.cpayne.adventure.game.player.Player;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // System objects
        Scanner in = new Scanner(System.in);
        Random rand = new Random();

        boolean running = true;


        // Game Variables
        String[] enemies = {"Skeleton", "Zombie", "Warrior", "Assassin"};
        int maxEnemyHealth = 100;
        int enemyAttackDamage = 25;

        // Player Variables
        int health = 100;
        int atk = 35;
        int numPots = 3;
        int potPotentcy = 30;
        int potDropChance = 50;


        System.out.println("Welcome to the Dungeon!");

        GAME:
        while(running){

        }

    }
}

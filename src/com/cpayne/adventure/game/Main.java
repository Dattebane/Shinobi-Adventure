package com.cpayne.adventure.game;

import com.cpayne.adventure.game.jutsu.FireballJutsu;
import com.cpayne.adventure.game.jutsu.MudWallJutsu;
import com.cpayne.adventure.game.jutsu.Taijutsu;
import com.cpayne.adventure.game.shinobi.enemies.Enemy;
import com.cpayne.adventure.game.shinobi.player.Player;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // System objects
        Scanner in = new Scanner(System.in);
        Random rand = new Random();


        boolean running = true;


        // Game Variables

        // Player Variables
        Player you = new Player("Nini", 20, 100, 1000, 100);

        int numPots = 3;


        int potPotentcy = 30;
        int potDropChance = 50;



        System.out.println("Welcome to the Dungeon!");

        GAME:
        while(running){
            System.out.println("--------------------------------------------------------");

            Enemy curr = new Enemy();
            String currName = curr.getName();

            System.out.println("\t# " + currName + " appeared! #\n");
            //      # Skeleton has appeared! #
            label:
            while(curr.getHP() > 0){
                //Player Health Bar
                //System.out.println("\t> " + you.getChakra());
                System.out.print("\n\tYour HP: "+ you.getHP() + ":");
                for(int i = 0; i <= you.getMaxHP()/10; i++){
                    if (i <= (you.getHP()/10)){
                        System.out.print("▇");
                    } else {
                        System.out.print("_");
                    }
                }
                System.out.println();
                //Enemy Health Bar
                System.out.print("\t"+ currName + "'s HP: " + curr.getHP() + ":");
                for(int i = 0; i < curr.getMaxHP()/10; i++){
                    if (i <= (curr.getHP()/10)){
                        System.out.print("▇");
                    } else {
                        System.out.print("_");
                    }
                }
                System.out.println();
                System.out.println("\n\tWhat would you like to do?");
                System.out.println("\t1. Attack");
                System.out.println("\t2. Drink Health Potion (" + numPots + ")");
                System.out.println("\t3. Nigerun da yo! Smokey!!");

                String input = in.nextLine();
                switch (input) {
                    case "1": // Attack
                        boolean attacking = true;
                        while (attacking && curr.getHP() > 0) {
                            System.out.println("\tHow do you attack? ");
                            System.out.println("\t\t1. Ninjutsu");
                            System.out.println("\t\t2. Taijutu");
                            System.out.println("\t\t3. Back");
                            String input2 = in.nextLine();
                            switch (input2) {
                                case "1": // Ninjutsu
                                    boolean choosingJutsu = true;
                                    while (choosingJutsu) {
                                        System.out.println("\t\tWhich Jutsu are you going to use? ");
                                        System.out.println("\t\t\t1. Fire Style: Fireball Jutsu");
                                        System.out.println("\t\t\t2. Earth Style: Mud Wall");
                                        System.out.println("\t\t\t3. Back");

                                        String input3 = in.nextLine();
                                        switch (input3) { // Ninjutsu
                                            case "1": { // Fireball Jutsu
                                                FireballJutsu fireBallJutsu = new FireballJutsu(you);
                                                Taijutsu enemyTaijutsu = new Taijutsu(curr, you);

                                                you.attack(curr, fireBallJutsu);
                                                curr.attack(you, enemyTaijutsu);


                                                choosingJutsu = false;
                                                attacking = false;
                                                break;
                                            } // Fireball Jutsu
                                            case "2": { //Mud Wall Jutsu
                                                int startingShield = you.getShield(); // ex 100
                                                MudWallJutsu mudWallJutsu = new MudWallJutsu(you);
                                                Taijutsu enemyTaijutsu = new Taijutsu(curr, you);

                                                curr.attack(you, enemyTaijutsu);
                                                you.attack(you, mudWallJutsu);

                                                int baseDMG = enemyTaijutsu.getDMG(curr, you); // ex 20

                                                int endingShield = Math.max(startingShield - baseDMG, 0); // 100 - 20 = 80
                                                int damageTaken = Math.max((baseDMG - startingShield), 0); // ex 20 - 100 = 0

                                                choosingJutsu = false;
                                                attacking = false;
                                                break;
                                            } // Mud Wall
                                            case "3":  // Back
                                                choosingJutsu = false;
                                                break;
                                        }
                                    }
                                    break;
                                case "2": // Taijutsu
                                    Taijutsu playerTaijutsu = new Taijutsu(you, curr);
                                    Taijutsu enemyTaijutsu = new Taijutsu(curr, you);

                                    you.attack(curr, playerTaijutsu);
                                    curr.attack(you, enemyTaijutsu);

                                    attacking = false;
                                    break;
                                case "3": // Back
                                    attacking = false;
                                    break;
                            }
                        }
                        if (you.getHP() < 1) {
                            System.out.println("You died.");
                            break label;
                        }
                        break;
                    case "2": // Drink Potion
                        if (numPots > 0) {
                            int startingHP = you.getHP();
                            potPotentcy = you.getMaxHP()/3;
                            int endingHP = Math.min(you.getHP() + potPotentcy, you.getMaxHP());
                            int healing = (endingHP)-(startingHP);
                            you.setHP(endingHP);
                            numPots--;
                            System.out.println("\t> You drink a health potion, healing for " + healing
                                    + "\n\t> You now have " + you.getHP() + " HP!"
                                    + "\n\t> You have " + numPots + " health potion(s) left.");

                            Taijutsu enemyTaijutsu = new Taijutsu(curr, you);
                            curr.attack(you, enemyTaijutsu);

                        } else {
                            System.out.println("\t> You have no pots left. Maybe " + currName + " has one...?");
                        }
                        break;
                    case "3": // Run away
                        System.out.println("\tCoward! You run away from " + currName + " with your tail between your legs...");
                        continue GAME;
                    default:
                        System.out.println("That's not an option. Type a number or the option");
                        break;
                }

                // Status Effect Calculation

                // Player Status
                if(you.getShield() > 0){
                    if (you.getShield() != you.getShieldReason().getShield()){
                        System.out.println("\t> You still have a " + you.getShield() + " HP Shield left!");
                        you.getShieldReason().render();
                    }
                }

                // Enemy Status
                if (curr.isBurning()){
                    if (curr.getBurnDuration() == curr.getBurnReason().getBurnDuration()){
                        curr.setBurnDuration(curr.getBurnDuration() - 1);
                    } else if(curr.getBurnDuration() > 0 && curr.getBurnDuration() < curr.getBurnReason().getBurnDuration()){
                        curr.setBurnDuration(curr.getBurnDuration() - 1);
                        curr.setHP(curr.getHP() - curr.getBurnDMG());
                        System.out.println("\t\t> " + curr.getName() + " takes " + curr.getBurnDMG() + " burn damage! ");
                        if(curr.getBurnDuration() == 0){
                            System.out.println("\t\t> " + curr.getName() + " is no longer on fire!!");
                            curr.setBurning(false);
                        }
                    }
                }

            }

            if (you.getHP() < 1){
                System.out.println("Welcome the sweet embrace of death...");
                break;
            }

            System.out.println("--------------------------------------------------------");
            System.out.println(" # " + currName + " was defeated! # ");
            System.out.println(" # You have " + you.getHP() + " HP left. # ");
            if (rand.nextInt(100) < potDropChance){
                numPots++;
                System.out.println(" # The enemy dropped a health potion! # ");
            }
            System.out.println(" # You now have " + numPots + " health potion(s). # ");
            System.out.println("--------------------------------------------------------");
            System.out.println("What would you like to do now?");
            System.out.println("1. Continue fighting");
            System.out.println("2. Exit dungeon");

            String input = in.nextLine();

            while (!input.equals("1") && !input.equals("2")){
                System.out.println("Invalid command!");
                input = in.nextLine();
            }
            if (input.equals("1")){
                System.out.println("The adventure continues!");
            } else if (input.equals("2")){
                System.out.println("Game over ");
                break;
            }
        }
        System.out.println("#####################");
        System.out.println("#Thanks for playing!#");
        System.out.println("#####################");
    }
}

package com.cpayne.adventure.game;

import com.cpayne.adventure.game.enemies.Enemy;
import com.cpayne.adventure.game.player.Player;

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
        Player you = new Player("Nini", 20, 100, 100, 50);
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
            while(curr.getHP() > 0){
                System.out.println("\tYour HP: "+ you.getHP());
                System.out.println("\t"+ currName + "'s HP: " + curr.getHP());
                System.out.println("\n\tWhat would you like to do?");
                System.out.println("\t1. Attack");
                System.out.println("\t2. Drink Health Potion (" + numPots + "2)");
                System.out.println("\t3. Run");

                String input = in.nextLine();
                if(input.equals("1") || input.toLowerCase().contains("attack")){
                    int damageDealt = rand.nextInt(you.getAtk());
                    int damageTaken = rand.nextInt(curr.getAtk());
                    curr.setHP(curr.getHP() - damageDealt);
                    you.setHP(you.getHP()- damageTaken);

                    System.out.println("\t> You strike the "+ currName + "for " + damageDealt + " damage.");
                    System.out.println("\t> You receive " + damageTaken + " in retaliation.");

                    if(you.getHP() < 1){
                        System.out.println("You died.");
                        break;
                    }

                } else if(input.equals("2") || input.toLowerCase().contains("drink") ||input.toLowerCase().contains("health") || input.toLowerCase().contains("potion")){
                    if (numPots >0){
                        you.setHP(you.getHP() + potPotentcy);
                        numPots--;

                        System.out.println("\t> You drink a health potion, healing for " + potPotentcy
                                + "\n\t> You now have " + you.getHP() + "HP!"
                                + "\n\t> You have " + numPots + " health potions left.");


                    } else {
                        System.out.println("\t> You have no pots left. Maybe " + currName + " has one...?");
                    }
                } else if(input.equals("3") || input.toLowerCase().contains("run")){
                    System.out.println("\tCoward! You run away from " + currName + " with your tail between your legs...");
                    continue GAME;
                } else {
                    System.out.println("That's not an option. Type a number or the option");
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
            }
            System.out.println(" # The enemy dropped a health potion! # ");
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

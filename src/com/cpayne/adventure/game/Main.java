package com.cpayne.adventure.game;

import com.cpayne.adventure.game.jutsu.FireballJutsu;
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
        Player you = new Player("Nini", 20, 100, 1000, 1000);

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
                //Player Health Bar
                System.out.print("\n\tYour HP: "+ you.getHP() + ":");
                for(int i = 0; i < you.getMaxHP()/10; i++){
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
                System.out.println("\t3. Run");

                String input = in.nextLine();
                if(input.equals("1") || input.toLowerCase().contains("attack")){
                    boolean attacking = true;
//                    int damageDealt = rand.nextInt(you.getAtk());
//                    //you.useJutsu(curr);
//                    int damageTaken = rand.nextInt(curr.getAtk());
//                    curr.setHP(curr.getHP() - damageDealt);
//                    you.setHP(you.getHP()- damageTaken);
                    while (attacking && curr.getHP() > 0){
                        System.out.println("\tHow do you attack? ");
                        System.out.println("\t\t1. Ninjutsu");
                        System.out.println("\t\t2. Taijutu");
                        System.out.println("\t\t3. Back");
                        String input2 = in.nextLine();
                        if(input2.equals("1")){
                            FireballJutsu fireBallJutsu = new FireballJutsu(you);
                            you.attack(curr, fireBallJutsu);

                            Taijutsu enemyTaijutsu = new Taijutsu(curr);
                            curr.attack(you, enemyTaijutsu);

                            int damageDealt = fireBallJutsu.getDMG(you,curr);
                            int damageTaken = enemyTaijutsu.getDMG(curr, you);
                            System.out.println(damageTaken);

                            System.out.println("\t> You deal " + damageDealt + " damage with your Fire Ball Jutsu!");
                            System.out.println("\t> You receive " + damageTaken + " in retaliation.");

                            attacking = false;
                        } else if (input2.equals("2")){
                            Taijutsu playerTaijutsu = new Taijutsu(you);
                            Taijutsu enemyTaijutsu = new Taijutsu(curr);

                            you.attack(curr, playerTaijutsu);
                            curr.attack(you, enemyTaijutsu);

                            int damageDealt = playerTaijutsu.getDMG(you,curr);
                            int damageTaken = enemyTaijutsu.getDMG(curr, you);

                            curr.setHP(curr.getHP() - damageDealt);
                            you.setHP(you.getHP()- damageTaken);

                            System.out.println("\t> You strike the " + currName + " for " + damageDealt + " damage.");
                            System.out.println("\t> You receive " + damageTaken + " in retaliation.\n");

                            attacking = false;
                        } else if (input2.equals("3")){
                            attacking = false;
                        }
                    }


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

                // Status Effect Calculation
                if(curr.getBurnDuration() > 0){
                    if(curr.getBurnDuration() == curr.getBurnReason().getBurnDuration()){
                        System.out.println("\t> "+ curr.getName() + " has been burnt by Fire Style: " + curr.getBurnReason().getName() + "!!!");
                    }
                    curr.setBurnDuration(curr.getBurnDuration() - 1);
                    curr.setHP(curr.getHP() - curr.getBurnDMG());
                    System.out.println("\t> " + curr.getName() + " takes " + curr.getBurnDMG() + " burn damage! ");
                    if(curr.getBurnDuration() == 0){
                        System.out.println("\t> " + curr.getName() + " is no longer on fire!!");
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

package com.cpayne.adventure.game.jutsu;

import com.cpayne.adventure.game.shinobi.Shinobi;
import com.cpayne.adventure.game.shinobi.player.Player;

import java.util.Random;

public class MudWallJutsu extends EarthStyle {

    private Shinobi user;
    private int shield;
    private final String name = "Earth Style: Mud Wall";

    private Random rand = new Random();

    public MudWallJutsu(Shinobi user) {
        super(user);
        this.user = user;
        shield = Math.max(rand.nextInt(user.getDef()), 1);
    }

    @Override
    public void applyEffects(Shinobi user) {
        if(user.getChakra() > 20) {
            user.setChakra(user.getChakra() - user.getChakra()/5);
            user.setShield(shield);
            user.setShieldReason(this);

            System.out.println("\t> "+ user.getName() + " erected a " + shield + " damage Mud Wall!!!");
            render();
            System.out.println("Shield HP: " + shield);
        } else {
            System.out.println("You don't have enough chakra for Mud Wall!!");
        }
    }

    @Override
    public int getDMG(Shinobi user, Shinobi target) {
        return 0;
    }

    public int getShield() {
        return shield;
    }

    public void setShield(int value){
        this.shield = value;
    }

    @Override
    public String getName() {
        return name;
    }

    public void render(){
        System.out.println("__________________________________________________________________________");
        System.out.println("__/___/___/___/___/___/___/___/___/___/___/___/___/___/___/___/___/___/_/|");
        System.out.println("_|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|_|/|");
        for(int i = 0; i < user.getShield()/10;i++){
            System.out.println("___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|/|");
            System.out.println("_|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|_|/|");
        }
        System.out.println("___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|/");
    }
}

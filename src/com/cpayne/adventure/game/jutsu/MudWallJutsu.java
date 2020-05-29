package com.cpayne.adventure.game.jutsu;

import com.cpayne.adventure.game.shinobi.Shinobi;
import com.cpayne.adventure.game.shinobi.player.Player;

public class MudWallJutsu extends EarthStyle {

    private Shinobi user;
    public MudWallJutsu(Shinobi user) {
        super(user);
        this.user = user;
    }

    @Override
    public void applyEffects(Shinobi user) {
        if(user.getChakra() > 60) {
            render();
            user.setChakra(user.getChakra() - 60);
        } else {
            System.out.println("You don't have enough chakra for Mud Wall!!");
        }
    }

    @Override
    public int getDMG(Shinobi user, Shinobi target) {
        return 0;
    }

    @Override
    public String getName() {
        return null;
    }

    private void render(){
        System.out.println("__________________________________________________________________________");
        System.out.println("__/___/___/___/___/___/___/___/___/___/___/___/___/___/___/___/___/___/_/|");
        System.out.println("_|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|_|/|");
        System.out.println("___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|/|");
        System.out.println("_|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|_|/|");
        System.out.println("___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|/|");
        System.out.println("_|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|_|/|");
        System.out.println("___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|/|");
        System.out.println("_|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|_|/|");
        System.out.println("___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|/|");
        System.out.println("_|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|_|/|");
        System.out.println("___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|/|");
        System.out.println("_|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|_|/|");
        System.out.println("___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|/|");
        System.out.println("_|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|_|/|");
        System.out.println("___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|/|");
        System.out.println("_|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|_|/|");
        System.out.println("___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|/|");
        System.out.println("_|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|_|/|");
        System.out.println("___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|/");
    }
}

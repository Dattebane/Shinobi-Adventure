package com.cpayne.adventure.game.jutsu;

import com.cpayne.adventure.game.shinobi.Shinobi;

import java.util.Random;

public class FireStyleJutsu extends Jutsu {

    public FireStyleJutsu(Shinobi user, Shinobi target) {
        super(user, target);
    }

    private int burnDuration = 4;
    private int burnAmount;

    Random rand = new Random();

    public void burn(Shinobi target){
        target.setHP(target.getHP() - rand.nextInt(burnAmount));
        System.out.println(" ");
    }

    public int getBurnDuration() {
        return burnDuration;
    }


}

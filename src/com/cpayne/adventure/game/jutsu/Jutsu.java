package com.cpayne.adventure.game.jutsu;

import com.cpayne.adventure.game.shinobi.Shinobi;

public  abstract class Jutsu {
    private Shinobi user;
    Jutsu(Shinobi user){
        this.user = user;
    }
    public abstract void applyEffects(Shinobi target);

    public abstract String getName();

    //public abstract int getDMG(Shinobi user, Shinobi target);
}

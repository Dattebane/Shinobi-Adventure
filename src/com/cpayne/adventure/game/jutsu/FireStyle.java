package com.cpayne.adventure.game.jutsu;

import com.cpayne.adventure.game.shinobi.Shinobi;

public abstract class FireStyle extends Ninjutsu {
    public FireStyle(Shinobi user) {
        super(user);
    }

    public abstract void applyEffects(Shinobi target);

    protected void burn(Shinobi target, FireStyle jutsu){
        target.setBurning(true);
        target.setBurnDuration(jutsu.getBurnDuration());
        target.setBurnDMG(jutsu);
        System.out.println("\t> "+ target.getName() + " has been burnt by Fire Style: " + jutsu.getName() + "!!!");
    };

    public abstract int getBurnDuration();

    public abstract int getDMG(Shinobi user, Shinobi target);

    public abstract int getBurnAmount();

    public abstract String getName();
}

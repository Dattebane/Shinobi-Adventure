package com.cpayne.adventure.game.jutsu;

import com.cpayne.adventure.game.shinobi.Shinobi;

public abstract class EarthStyle extends Ninjutsu {
    EarthStyle(Shinobi user) {
        super(user);
    }

    public abstract void applyEffects(Shinobi target);



    public abstract int getDMG(Shinobi user, Shinobi target);

    public abstract String getName();
}

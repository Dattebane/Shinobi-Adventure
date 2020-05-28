package com.cpayne.adventure.game.jutsu;

import com.cpayne.adventure.game.shinobi.Shinobi;

public abstract class Ninjutsu extends Jutsu {
    int chakraCost;

    Ninjutsu(Shinobi user) {
        super(user);
    }

    public abstract void applyEffects(Shinobi target);
    public abstract String getName();
}

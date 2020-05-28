package com.cpayne.adventure.game.jutsu;

import com.cpayne.adventure.game.shinobi.Shinobi;

public abstract class Ninjutsu extends Jutsu {
    int chkCost;

    Ninjutsu(Shinobi user) {
        super(user);
    }

    public abstract void applyEffects(Shinobi target);
}

package com.cpayne.adventure.game.jutsu;

import com.cpayne.adventure.game.shinobi.Shinobi;

public  abstract class Jutsu {
    Jutsu(Shinobi user){ }
    public abstract void applyEffects(Shinobi target);

    public abstract String getName();
}

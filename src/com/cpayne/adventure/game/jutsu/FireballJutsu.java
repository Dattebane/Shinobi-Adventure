package com.cpayne.adventure.game.jutsu;

import com.cpayne.adventure.game.shinobi.Shinobi;

public class FireballJutsu extends FireStyle {

    private Shinobi user;

    private final String name = "Fireball Jutsu";
    private int chakraCost = 30;
    private int burnAmount = 1;
    private int burnDuration = 3;

    public FireballJutsu(Shinobi user) {
        super(user);
        this.user = user;
    }

    @Override
    public void applyEffects(Shinobi target) {
        target.setHP(target.getHP() - getDMG(user, target));
        user.setChakra(user.getChakra() - chakraCost);
        burn(target, this);
    }

    @Override
    public int getDMG(Shinobi user, Shinobi target){
        return 10;
    }

    public int getBurnAmount() {
        return burnAmount;
    }

    public int getBurnDuration() {
        return burnDuration;
    }

    public String getName() {
        return name;
    }
}

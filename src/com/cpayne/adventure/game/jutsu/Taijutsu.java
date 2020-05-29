package com.cpayne.adventure.game.jutsu;

import com.cpayne.adventure.game.shinobi.Shinobi;

import java.util.Random;

public class Taijutsu extends Jutsu {
    private Shinobi user;
    private Shinobi target;
    private Random rand = new Random();

    public Taijutsu(Shinobi user) {
        super(user);
        this.user = user;
    }

    @Override
    public void applyEffects(Shinobi target) {
        this.target = target;
        target.setHP(target.getHP() - getDMG(user,target));
    }

    @Override
    public String getName() {
        return null;
    }

    public int getDMG(Shinobi user, Shinobi target) {
        return Math.max(10,rand.nextInt(user.getAtk()/2) - target.getDef());
    }
}

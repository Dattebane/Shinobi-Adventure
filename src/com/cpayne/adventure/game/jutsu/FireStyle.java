package com.cpayne.adventure.game.jutsu;

import com.cpayne.adventure.game.shinobi.Shinobi;

public class FireStyle extends Ninjutsu {
    private int dmg;
    private int chakraCost;
    private Shinobi user;

    public FireStyle(Shinobi user) {
        super(user);
        this.user = user;
    }

    @Override
    public void applyEffects(Shinobi target) {
        target.setHP(target.getHP() - getDmg(user, target));
        user.setChakra(user.getChakra() - chakraCost);
        // TODO: Add actual fire effect.
    }

    public int getDmg(Shinobi user, Shinobi target){
        return user.getAtk()/2;
    }
}

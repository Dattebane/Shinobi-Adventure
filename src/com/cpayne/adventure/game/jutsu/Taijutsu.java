package com.cpayne.adventure.game.jutsu;

import com.cpayne.adventure.game.shinobi.Shinobi;

import java.util.Random;

public class Taijutsu extends Jutsu {
    private Shinobi user;
    private Shinobi target;
    private int DMG;
    private Random rand = new Random();

    public Taijutsu(Shinobi user, Shinobi target) {
        super(user);
        this.user = user;
        this.target = target;
        DMG = Math.max(10,rand.nextInt(user.getAtk()/2) - target.getDef());
    }

    @Override
    public void applyEffects(Shinobi target) {
        int blocked = 0;
        while(target.getShield() > 0 && DMG > 0){
            target.setShield(target.getShield() - 1);
            //target.getShieldReason().setShield(target.getShieldReason().getShield() - 1);
            DMG--;
            blocked++;
            if (target.getShield() == 0){
                System.out.println("\t> " + target.getName() + "'s Shield has been broken!!!");
            }
        }
        if (blocked > 0) {
            System.out.println("\t> " + blocked + " damage was blocked by " + target.getName() + "'s " + target.getShieldReason().getName() + " !!!");
        }
        target.setHP(target.getHP() - getDMG(user,target));
        System.out.println("\t> " + user.getName() + " struck " + target.getName() + " for " + DMG + " damage !!!");
    }


    @Override
    public String getName() {
        return null;
    }

    public int getDMG(Shinobi user, Shinobi target) {
        return DMG;
    }

    @Override
    public void render() {

    }

    @Override
    protected void setShield(int value) {

    }

    @Override
    public int getShield() {
        return 0;
    }
}

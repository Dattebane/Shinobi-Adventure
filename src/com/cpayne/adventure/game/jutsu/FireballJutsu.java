package com.cpayne.adventure.game.jutsu;

import com.cpayne.adventure.game.shinobi.Shinobi;

public class FireballJutsu extends FireStyle {

    private Shinobi user;

    private final String name = "Fire Style: Fireball Jutsu";
    private int chakraCost = 30;
    private int baseDMG;
    private int burnAmount;
    private int burnDuration = 4;

    public FireballJutsu(Shinobi user) {
        super(user);
        this.baseDMG = Math.max(40,user.getAtk()/5);
        this.burnAmount = user.getAtk()/30;
        this.user = user;
    }

    @Override
    public void applyEffects(Shinobi target) {
        int blocked = 0;
        System.out.println(baseDMG + " incoming damage.");
        while(target.getShield() > 0 && baseDMG > 0){
            System.out.println(target.getShield());
            target.setShield(target.getShield() - 1);
            target.getShieldReason().setShield(target.getShieldReason().getShield() - 1);
            baseDMG--;
            blocked++;
        }
        render();
        target.setHP(target.getHP() - baseDMG);
        System.out.println("\t> You deal " + baseDMG + " damage with your Fire Ball Jutsu!");
        user.setChakra(user.getChakra() - chakraCost);
        burn(target, this);
        if (blocked > 0) {
            System.out.println("\t> " + blocked + " damage was blocked by " + target.getShieldReason().getName() + " !!!");
        }
    }

    @Override
    public int getDMG(Shinobi user, Shinobi target){
        return Math.max(40,user.getAtk()/5);
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

    public void render(){
        System.out.println("                                                                   __________");
        System.out.println("                                                             _.;;;’mmmmmmmmmmmm‘;;;.");
        System.out.println("                                        ----....____....-=’”’”;;MMMMMMMMMMMMMMMMM;;”’\\");
        System.out.println("                                          \\cccccccccccMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\\");
        System.out.println("                        ____           _==}cccc}MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM’|");
        System.out.println("              ~.~  __-=”ccccc--..__..-“fffmmmmmmmMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM..\\");
        System.out.println("                     ‘’fFMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM''iiiiiiiiiiiiiiiiiiiii)");
        System.out.println("         ..-=’’”””””-..  \\FMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM'iiiiiiiiiiiiiiiiiiiiiiiii)");
        System.out.println("       -“cmmMMMMMMMMm-c’   \\ffMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMm\\iiiiiiiiiiiiiiiiiiii.}");
        System.out.println("     /’”MMMMMMMMMMMMMMM\\””   ‘””””fffMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM}iiiiiiiiiiiiiiiiiiiiii~}");
        System.out.println("    /’MMMMMMMMMMMMMMMMMMMM\\CCCcccccc’}MMMMMMMMMMMMMMMMMMMMMMMMMMMMM”iiiiiiiiiiiiiiiiiiiiiiiiiiiii))");
        System.out.println("  //MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM;iiiiiiiiiiiiiiiii|iiiiiiiiiiiiii}");
        System.out.println(" |//’’””””’’\\MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM|iiiiiiiiiiiiiiiiiiiiiiiiiiiiiii)");
        System.out.println(" ‘         ‘”cc\\MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\\iiiiiiiiiiiiiiiiiiiiiiiiiii~|");
        System.out.println("              ‘””””—“-“..MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\\iiiiiiiiiiiiiiiiiiiiiiii{");
        System.out.println("                   __  ‘’}MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM/iiiiiiiiiiiiiiiiiiiiiii)");
        System.out.println("       ~ `  `__-=’”’’””=’c}MMMMMMMMM/;;;;\\MMMMMMMMMMMMMMMMMMMMMMMMMMMM|iiiiiiiiiiiiiiiiiiiii)");
        System.out.println("               ‘’””-;;\\MMMMMMMMMM/c/’ ‘CCCMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\\iiiiiiiiiiiiiiiii}");
        System.out.println("                     ``;;ccMMMc;;/’ |’jMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM)");
        System.out.println("                          ‘’’”’     |P”””’’”-=CC\\MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM./");
        System.out.println("                                   “            “”-=CCcmMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM/");
        System.out.println("                                                       ‘””-CC”ccc.MMMMMMMMMMMMVVMM’”””");
        System.out.println("                                                              ‘”””’’’-=====-‘’”’```");
        System.out.println("                                                                        ```'''");
    }

    @Override
    protected void setShield(int value) {

    }

    @Override
    public int getShield() {
        return 0;
    }
}

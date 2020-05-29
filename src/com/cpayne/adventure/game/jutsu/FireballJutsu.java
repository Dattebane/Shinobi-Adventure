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
        render();
        target.setHP(target.getHP() - getDMG(user, target));
        user.setChakra(user.getChakra() - chakraCost);
        burn(target, this);
    }

    @Override
    public int getDMG(Shinobi user, Shinobi target){
        return Math.max(40,user.getAtk()/5 - target.getDef());
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

    private void render(){
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
}

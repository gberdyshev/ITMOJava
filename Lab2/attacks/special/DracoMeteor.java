package attacks.special;

import ru.ifmo.se.pokemon.*;

public final class DracoMeteor extends SpecialMove {

    public DracoMeteor() {
        super(Type.DRAGON, 130, 90);
    }

    protected void applySelfEffects(Pokemon p) {
        p.setMod(Stat.SPECIAL_ATTACK, -2);
    }

    protected String describe() {
        return "атакует с помощью AirFlash";
    }


}
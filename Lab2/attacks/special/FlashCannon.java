package attacks.special;

import ru.ifmo.se.pokemon.*;

public final class FlashCannon extends SpecialMove {
    
    public FlashCannon() {
        super(Type.STEEL, 80, 100);
    }

    protected void applyOppEffects(Pokemon p) {
        if (Math.random() <= 0.1) {
            p.setMod(Stat.SPECIAL_DEFENSE, -1);
        }
    }

    protected String describe() {
        return "атакует с помощью FlashCannon";
    }


}
package attacks.special;

import ru.ifmo.se.pokemon.*;

public final class NightShade extends SpecialMove {
    
    public NightShade() {
        super(Type.GHOST, 0, 100);
    }

    protected double calcBaseDamage(Pokemon attacker, Pokemon defender) {
        int specialMoveFactor = attacker.getLevel();
        return specialMoveFactor;
    }

    protected String describe() {
        return "атакует с помощью NightShade";
    }


}
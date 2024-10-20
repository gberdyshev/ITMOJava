package attacks.special;

import ru.ifmo.se.pokemon.*;

public final class AirSlash extends SpecialMove {

    public AirSlash() {
        super(Type.FLYING, 75, 95);
    }

    protected void applyOppEffects(Pokemon p) {
        if (Math.random() <= 0.3) {
            Effect.flinch(p);
        }
    }

    protected String describe() {
        return "атакует с помощью AirFlash";
    }


}
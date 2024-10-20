package attacks.status;

import ru.ifmo.se.pokemon.*;

public final class ConfuseRay extends StatusMove {
    /* Confuse Ray causes the target to become confused. */

    public ConfuseRay() {
        super(Type.GHOST, 0, 100);
    }

    protected void applyOppEffects(Pokemon p) {
        Effect.confuse(p);
    }

    protected String describe() {
        return "атакует с помощью ConfuseRay";
    }

}
package attacks.status;

import ru.ifmo.se.pokemon.*;

public final class Swagger extends StatusMove {
    /* Swagger confuses the target 
    and raises its Attack by two stages. */

    public Swagger() {
        super(Type.NORMAL, 0, 85);

    }

    protected void applyOppEffects(Pokemon p) {
        Effect.confuse(p);
        p.setMod(Stat.ATTACK, 2);

    }

    protected String describe() {
        return "атакует с помощью Swagger";
    }
}
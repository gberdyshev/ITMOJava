package attacks.status;

import ru.ifmo.se.pokemon.*;

public final class Rest extends StatusMove {
    /* User sleeps for 2 turns, 
    but user is fully healed. */

    public Rest() {
        super(Type.PSYCHIC, 0, 0);
    }

    protected void applySelfEffects(Pokemon p) {
        p.restore();
        // сначала все восстановили, потом сон
        Effect e = new Effect().condition(Status.SLEEP).turns(2);
        p.addEffect(e);
    }

    protected String describe() {
        return "атакует с помощью Rest";
    }
}
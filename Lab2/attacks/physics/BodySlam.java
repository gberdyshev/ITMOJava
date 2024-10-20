package attacks.physics;

import ru.ifmo.se.pokemon.*;

public class BodySlam extends PhysicalMove {
    public BodySlam() {
        super(Type.NORMAL, 85, 100);
    }

    protected void applyOppEffects(Pokemon p) {
        if (!p.hasType(Type.ELECTRIC) && Math.random() <= 0.3) {
            Effect.paralyze(p);
        }

    }
    protected String describe() {
        return "атакует с помощью BodySlam";
    }
    
}
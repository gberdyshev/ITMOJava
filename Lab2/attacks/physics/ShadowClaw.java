package attacks.physics;

import ru.ifmo.se.pokemon.*;

public final class ShadowClaw extends PhysicalMove {

    public ShadowClaw () {
        super(Type.GHOST, 70, 100);
    }

    protected double calcCriticalHit(Pokemon att, Pokemon def) {
        return 3;
    }

    protected String describe() {
        return "атакует с помощью ShadowClaw";
    }


}
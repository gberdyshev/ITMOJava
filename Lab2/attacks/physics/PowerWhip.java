package attacks.physics;

import ru.ifmo.se.pokemon.*;

public final class PowerWhip extends PhysicalMove {

    public PowerWhip() {
        super(Type.GRASS, 120, 85);
    }

    protected String describe() {
        return "атакует с помощью PowerWhip";
    }

    
}
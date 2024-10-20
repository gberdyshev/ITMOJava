package attacks.physics;

import ru.ifmo.se.pokemon.*;

public final class DoubleHit extends PhysicalMove {
    /*Double Hit deals damage and 
    will strike twice (with 35 base power each time). */
    public DoubleHit() {
        super(Type.NORMAL, 35, 90, 0, 2);
    }

    protected String describe() {
        return "атакует с помощью DoubleHit";
    }
    
}
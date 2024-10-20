package attacks.physics;

import ru.ifmo.se.pokemon.*;

public final class SteelWing extends PhysicalMove {

    public SteelWing () {
        super(Type.STEEL, 70, 90);
    }

    protected void applySelfEffects(Pokemon p) {
        Effect e = new Effect().stat(Stat.DEFENSE, 1).chance(0.1);
        p.addEffect(e);
    }

    protected String describe() {
        return "атакует с помощью Steel Wing";
    }

}
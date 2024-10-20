package pokemons;

import ru.ifmo.se.pokemon.*;
import attacks.physics.BodySlam;

public final class Hydreigon extends Zweilous {
    public Hydreigon(String name, int level) {
        super(name, level);
        this.setStats(92, 105, 90, 125, 90, 98);
        this.addMove(new BodySlam());

    }
}
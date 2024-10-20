package pokemons;

import ru.ifmo.se.pokemon.*;
import attacks.physics.DoubleHit;

public class Zweilous extends Deino {
    public Zweilous(String name, int level) {
        super(name, level);
        this.setStats(72, 85, 70, 65, 70, 58);
        this.addMove(new DoubleHit());
    }

}
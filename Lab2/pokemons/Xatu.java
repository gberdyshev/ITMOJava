package pokemons;

import ru.ifmo.se.pokemon.*;
import attacks.special.AirSlash;

public final class Xatu extends Natu {
    
    public Xatu(String name, int level) {
        super(name, level);
        this.setStats(65, 75, 70, 95, 70, 95);
        this.addMove(new AirSlash());

    }

}

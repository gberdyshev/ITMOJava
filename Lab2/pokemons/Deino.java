package pokemons;

import ru.ifmo.se.pokemon.*;
import attacks.special.DracoMeteor;
import attacks.status.Swagger;

public class Deino extends Pokemon {

    public Deino(String name, int level) {
        super(name, level);
        this.setStats(52, 65, 50, 45, 50, 38);
        this.setType(Type.DARK, Type.DRAGON);
        this.setMove(new DracoMeteor(), new Swagger());

    }

}
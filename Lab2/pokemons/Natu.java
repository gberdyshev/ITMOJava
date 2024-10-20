package pokemons;

import ru.ifmo.se.pokemon.*;
import attacks.status.ConfuseRay;
import attacks.physics.SteelWing;
import attacks.special.NightShade;

public class Natu extends Pokemon {
    public Natu(String name, int level) {
        super(name, level);
        this.setStats(40, 50, 45, 70, 45, 70);
        this.setType(Type.FLYING, Type.PSYCHIC);
        this.setMove(new ConfuseRay(), new SteelWing(), new NightShade());
        
    }


    


}
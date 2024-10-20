package pokemons;

import ru.ifmo.se.pokemon.*;
import attacks.physics.*;
import attacks.special.FlashCannon;
import attacks.status.Rest;


public final class Jangmo extends Pokemon {

    public Jangmo (String name, int level) {
        super(name, level);
        this.setStats(45, 55, 65, 45, 45, 45);
        this.setType(Type.DRAGON);
        this.setMove(new ShadowClaw(), new PowerWhip(), new FlashCannon(), new Rest());
    }
}
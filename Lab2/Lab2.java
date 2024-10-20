import ru.ifmo.se.pokemon.*;
import pokemons.*;
// import attacks.*;

public class Lab2 {
    public static void main(String[] args) {
        Battle b = new Battle();
        Pokemon p1 = new Jangmo("Чужой", 7);
        Pokemon p2 = new Natu("Хищник", 10);
        Pokemon p3 = new Xatu("Третий", 15);

        Pokemon r1 = new Deino("Чужой", 5);
        Pokemon r2 = new Zweilous("Хищник", 11);
        Pokemon r3 = new Hydreigon("Третий", 21);

        b.addAlly(p1);
        b.addAlly(p2);
        b.addAlly(p3);
        b.addFoe(r1);
        b.addFoe(r2);
        b.addFoe(r3);
        b.go();
    }

}



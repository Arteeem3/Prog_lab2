package artems_pokemons;
import artems_moves.*;
import ru.ifmo.se.pokemon.*;

public class Shiftry extends Nuzleaf {
    public Shiftry(String name, int level) {
        super(name, level);
        setStats(90, 100, 60, 90, 60, 80);
        setType(Type.GRASS, Type.DARK);
        setMove(new Confide());
    }
}

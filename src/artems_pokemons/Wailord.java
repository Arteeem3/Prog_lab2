package artems_pokemons;
import artems_moves.*;
import ru.ifmo.se.pokemon.*;

public class Wailord extends Wailmer {
    public Wailord(String name, int level) {
        super(name, level);
        setType(Type.WATER);
        setStats(170,90,45,90,45,60);
        setMove(new NobleRoar());
    }
}

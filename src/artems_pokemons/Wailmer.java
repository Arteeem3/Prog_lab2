package artems_pokemons;
import artems_moves.*;
import ru.ifmo.se.pokemon.*;

public class Wailmer extends Pokemon {
    public Wailmer(String name, int level) {
        super(name, level);
        setType(Type.WATER);
        setStats(130,70,35,70,35,60);
        setMove(new RockTomb(), new Splash(), new Rest());
    }
}
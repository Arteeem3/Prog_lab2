package artems_pokemons;
import artems_moves.*;
import ru.ifmo.se.pokemon.*;

public class Cobalion extends Pokemon {
    public Cobalion(String name, int level) {
        super(name, level);
        setType(Type.STEEL, Type.FIGHTING);
        setStats(91,90,129,90,72,108);
        setMove(new DoubleTeam(), new TakeDown(), new MetalClaw(), new DoubleKick());
    }
}

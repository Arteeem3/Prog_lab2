package artems_moves;

import ru.ifmo.se.pokemon.*;

public class NobleRoar extends StatusMove {

    private int stageLowered = -1;
    public NobleRoar() {
        super(Type.NORMAL, 0, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        if (stageLowered >= -6) {
            p.setMod(Stat.ATTACK, stageLowered);
            p.setMod(Stat.SPECIAL_ATTACK, stageLowered);
            stageLowered--;
        }
    }

    @Override
    protected String describe() {
        return "использует Rock Tomb";
    }
}
package artems_moves;

import ru.ifmo.se.pokemon.*;
public class DoubleTeam extends StatusMove{
    public DoubleTeam(){
        super(Type.NORMAL,0,100);
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        p.setMod(Stat.EVASION, 1);
    }

    @Override
    protected String describe() {
        return "использует Double Team ";
    }
}
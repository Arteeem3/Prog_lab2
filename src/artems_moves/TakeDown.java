package artems_moves;

import ru.ifmo.se.pokemon.*;

public class TakeDown extends StatusMove{
    public TakeDown(){
        super(Type.NORMAL,90,85);
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        p.setMod(Stat.HP, 1);
    }

    @Override
    protected String describe() {
        return "использует Double Team ";
    }
}
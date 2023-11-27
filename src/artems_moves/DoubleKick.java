package artems_moves;

import ru.ifmo.se.pokemon.*;
public class DoubleKick extends PhysicalMove {
    public DoubleKick() {
        super(Type.FIGHTING, 30, 100);
    }

    @Override
    public void applySelfEffects (Pokemon p){
        p.setMod(Stat.ATTACK,2);
    }

    @Override
    protected String describe(){
        return "использует Double Kick";
    }
}
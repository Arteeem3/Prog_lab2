import artems_pokemons.*;
import ru.ifmo.se.pokemon.*;

public class program {
    public static void main(String[] args) {

        Battle b = new Battle();
        Cobalion p1 = new Cobalion("Металлический олень",3);
        Wailmer p2 = new Wailmer("Мелкий кит",3);
        Wailord p3 = new Wailord("Кит побольше",3);
        Seedot p4 = new Seedot("Жёлудь",3);
        Nuzleaf p5 = new Nuzleaf("Пикмин", 3);
        Shiftry p6 = new Shiftry("Шиноби",3);

        b.addAlly(p1);
        b.addAlly(p2);
        b.addAlly(p3);
        b.addFoe(p4);
        b.addFoe(p5);
        b.addFoe(p6);
        b.go();

    }
}

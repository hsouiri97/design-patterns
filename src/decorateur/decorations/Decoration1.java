package decorateur.decorations;

import decorateur.Decorateur;
import decorateur.SapinNoel;

public class Decoration1 extends Decorateur {
    public Decoration1(SapinNoel sapinNoel) {
        super(sapinNoel);
    }

    public String ajouterDecoration1() {
        return "ajout de decoration1\t";
    }

    @Override
    public String decorer() {
        return super.decorer()+" "+ajouterDecoration1();
    }
}

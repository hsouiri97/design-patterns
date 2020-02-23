package decorateur.decorations;

import decorateur.Decorateur;
import decorateur.SapinNoel;

public class Decoration2 extends Decorateur {
    public Decoration2(SapinNoel sapinNoel) {
        super(sapinNoel);
    }

    public String ajouterDecoration2() {
        return "ajout de decoration2\t";
    }

    @Override
    public String decorer() {
        return super.decorer()+" "+ajouterDecoration2();
    }
}

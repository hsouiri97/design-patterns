package decorateur.decorations;

import decorateur.Decorateur;
import decorateur.SapinNoel;

public class Decoration3 extends Decorateur {
    public Decoration3(SapinNoel sapinNoel) {
        super(sapinNoel);
    }

    public String ajouterDecoration3() {
        return "ajout de decoration3\t";
    }

    @Override
    public String decorer() {
        return super.decorer()+" "+ajouterDecoration3();
    }
}

package decorateur;

import decorateur.decorations.Decoration1;
import decorateur.decorations.Decoration2;
import decorateur.decorations.Decoration3;

public class Main {
    public static void main(String[] args) {
        SapinNoel sapinNoel = new SapinNoelImpl();
        System.out.println(sapinNoel.decorer());

        sapinNoel = new Decoration1(sapinNoel);
        System.out.println(sapinNoel.decorer());

        sapinNoel = new Decoration3(new Decoration2(sapinNoel));
        System.out.println(sapinNoel.decorer());
    }
}

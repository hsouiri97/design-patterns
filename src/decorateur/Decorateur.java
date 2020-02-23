package decorateur;

public class Decorateur implements SapinNoel {
    private SapinNoel sapinNoel;

    public Decorateur(SapinNoel sapinNoel) {
        this.sapinNoel = sapinNoel;
    }

    @Override
    public String decorer() {
        return sapinNoel.decorer();
    }
}

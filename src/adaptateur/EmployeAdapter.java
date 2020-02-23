package adaptateur;

public class EmployeAdapter implements Utilisateur {
    private Employe employe;

    public EmployeAdapter(Employe employe) {
        this.employe = employe;
    }

    @Override
    public void afficher() {
        System.out.print("Employe: ");
        employe.afficherNom();
        System.out.print("\t");
        employe.afficherPoste();
    }
}

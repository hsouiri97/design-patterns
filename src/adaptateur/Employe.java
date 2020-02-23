package adaptateur;

public class Employe {
    private String nom;
    private String poste;

    public Employe(String nom, String poste) {
        this.nom = nom;
        this.poste = poste;
    }

    public void afficherNom() {
        System.out.print(nom);
    }

    public void afficherPoste() {
        System.out.println(poste);
    }

}

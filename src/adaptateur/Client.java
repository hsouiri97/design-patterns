package adaptateur;

public class Client implements Utilisateur {
    private String nom;

    public Client(String nom) {
        this.nom = nom;
    }

    @Override
    public void afficher() {
        System.out.println("Client: "+nom);
    }
}

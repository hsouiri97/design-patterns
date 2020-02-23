package proxy;

public class VraiServeur implements Serveur {
    @Override
    public void connexion() {
        System.out.println("connecte au serveur!");
    }

    @Override
    public void get() {
        System.out.println("obtenir les données");
    }

    @Override
    public void post() {
        System.out.println("ajouter les données");
    }

    @Override
    public void put() {
        System.out.println("modifier les données");
    }

    @Override
    public void delete() {
        System.out.println("supprimer les données");
    }

    @Override
    public void deconnexion() {
        System.out.println("déconnexion");
    }
}

package proxy;

public class ProxyServeur implements Serveur {
    private Serveur vraiServeur;
    private boolean sessionActive;

    public ProxyServeur() {
        vraiServeur = new VraiServeur();
    }

    @Override
    public void connexion() {
        sessionActive = true;
        vraiServeur.connexion();
    }

    @Override
    public void get() {
        if (sessionActive)
            vraiServeur.get();
    }

    @Override
    public void post() {
        if (sessionActive)
            vraiServeur.post();
    }

    @Override
    public void put() {
        if (sessionActive)
            vraiServeur.put();
    }

    @Override
    public void delete() {
        if (sessionActive)
            vraiServeur.delete();
    }

    @Override
    public void deconnexion() {
        vraiServeur.deconnexion();
        sessionActive = false;
    }
}

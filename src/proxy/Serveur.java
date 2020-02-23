package proxy;

public interface Serveur {
    void connexion();
    void get();
    void post();
    void put();
    void delete();
    void deconnexion();
}

package proxy;

public class Client {
    public static void main(String[] args) {
        Serveur proxyServeur = new ProxyServeur();
        proxyServeur.connexion();
        proxyServeur.get();
        proxyServeur.post();
        proxyServeur.put();
        proxyServeur.delete();
        proxyServeur.deconnexion();
    }
}

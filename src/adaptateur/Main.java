package adaptateur;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Utilisateur client1 = new Client("Steven");
        Utilisateur client2 = new Client("Joe");
        Utilisateur client3 = new Client("Eric");

        Employe employe1 = new Employe("Hamid", "poste de hamid");
        Employe employe2 = new Employe("Said", "poste de Said");
        Employe employe3 = new Employe("Rachid", "poste de Rachid");

        List<Utilisateur> list = new ArrayList<>();
        list.add(client1);
        list.add(client2);
        list.add(client3);
        list.add(new EmployeAdapter(employe1));
        list.add(new EmployeAdapter(employe2));
        list.add(new EmployeAdapter(employe3));

        list.forEach(Utilisateur::afficher);
    }
}

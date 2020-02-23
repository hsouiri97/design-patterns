package chainDeResponsablite;

public class Parser {

    private Parser successor;

    public void parse(String fileName){
        if ( getSuccessor() != null ){
            getSuccessor().parse(fileName);
        }
        else{
            System.out.println("Impossible de trouver le bon analyseur pour le fichier: "+fileName);
        }
    }

    protected boolean gerer_fichier(String fileName, String format){
        return (fileName == null) || (fileName.endsWith(format));

    }

    Parser getSuccessor() {
        return successor;
    }

    void setSuccessor(Parser successor) {
        this.successor = successor;
    }
}

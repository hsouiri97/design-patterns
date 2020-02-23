package chainDeResponsablite;

public class JSONParser extends Parser {
    public JSONParser(Parser successor){
        this.setSuccessor(successor);
    }

    @Override
    public void parse(String fileName) {
        if ( gerer_fichier(fileName, ".json")){
            System.out.println("Un analyseur de JSON gère le fichier:"+fileName);
        }
        else{
            super.parse(fileName);
        }

    }

}

package chainDeResponsablite;

public class TextParser extends Parser{

    public TextParser(Parser successor){
        this.setSuccessor(successor);
    }

    @Override
    public void parse(String fileName) {
        if ( gerer_fichier(fileName, ".txt")){
            System.out.println("Un analyseur de texte gère le fichier:"+fileName);
        }
        else{
            super.parse(fileName);
        }

    }

}

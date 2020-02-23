package chainDeResponsablite;

public class CSVParser extends Parser {
    public CSVParser(Parser successor){
        this.setSuccessor(successor);
    }

    @Override
    public void parse(String fileName) {
        if ( gerer_fichier(fileName, ".csv")){
            System.out.println("Un analyseur de csv gère le fichier:"+fileName);
        }
        else{
            super.parse(fileName);
        }

    }

}

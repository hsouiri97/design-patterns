package chainDeResponsablite;

import javax.sql.rowset.spi.XmlReader;

public class XMLParser extends Parser {


    @Override
    public void parse(String fileName) {
        if ( gerer_fichier(fileName, ".xml")){
            System.out.println("Un analyseur de XML gère le fichier:"+fileName);
        }
        else{
            super.parse(fileName);
        }

    }

}

package chainDeResponsablite;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> fileList = new ArrayList<>();
        fileList.add("someFile.txt");
        fileList.add("otherFile.json");
        fileList.add("xmlFile.xml");
        fileList.add("csvFile.csv");
        fileList.add("docFile.doc");

        //Pas de successeur pour ce xmlParser car c'est le dernier de la chaîne.
        Parser xmlParser = new XMLParser();

        //XmlParser est le successeur de CsvParser.
        Parser csvParser = new CSVParser(xmlParser);

        //CsvParser est le successeur de JsonParser.
        Parser jsonParser = new JSONParser(csvParser);

        //JsonParser est le successeur de TextParser.
        //TextParser marque le debut de la chaine.
        Parser textParser = new TextParser(jsonParser);

        //Passez les fichiers au premier Parser de la chaîne.
        for (String f : fileList) {
            textParser.parse(f);
        }
    }
}

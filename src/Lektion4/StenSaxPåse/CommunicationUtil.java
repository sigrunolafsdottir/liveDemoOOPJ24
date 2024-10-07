package Lektion4.StenSaxPåse;

public class CommunicationUtil {

    public  Symbol parseUserInput(String input){
        String cleanInput = input.trim().toLowerCase();
        switch (cleanInput){
            case "sten": return Symbol.STEN;
            case "sax": return Symbol.SAX;
            case "påse": return Symbol.PÅSE;
        }
        return null;
    }

}

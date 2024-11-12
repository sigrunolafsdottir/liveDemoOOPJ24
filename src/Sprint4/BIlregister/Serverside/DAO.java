package Sprint4.BIlregister.Serverside;

import java.util.Arrays;
import java.util.List;

public class DAO {

    private Bil b1 = new Bil("qwe123", "red", "Sigrun", "Volvo");
    private Bil b2 = new Bil("rty456", "blue", "Anna", "Saab");
    private Bil b3 = new Bil("cvb567", "black", "Bertil", "Fiat");
    private Bil b4 = new Bil("yui678", "silver", "Cecil", "Cadillac");
    private Bil b5 = new Bil("jkl456", "green", "Doris", "Ford");

    List<Bil> bilar = Arrays.asList(b1, b2, b3, b4, b5);

    public String findCar(String regNr){
        for (Bil bil : bilar) {
            if (bil.getRegnr().equals(regNr)) {
                return bil.toString();
            }
        }
        return "Bilen kunde inte hittas";
    }

}

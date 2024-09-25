package BilRegisterDistans;

public class Veteranbilsägare extends Bilägare {

    private boolean ärRaggare;

    //Object
    //Person
    //BIlägare
    //Veteranbilsägare

    public Veteranbilsägare(String name, int age, boolean harKeps, boolean ärRaggare) {
        super(name, age, harKeps);
        this.ärRaggare = ärRaggare;

    }

    @Override
    public String toString() {
        return "Veteranbilsägare{" +
                "ärRaggare=" + ärRaggare +
                "harKeps=" + super.isHarKeps() +
                '}';
    }
}

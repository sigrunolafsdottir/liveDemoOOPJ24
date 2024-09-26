package Lektion2.uppg2Fordon.uppg2a;

public class Bil extends Fordon{

    protected int antalVäxlar;
    protected int växelJustNu;

    public Bil(int hastghet, int vikt, int antalVäxlar, int växelJustNu) {
       // super(hastghet, vikt);
        this.hastghet = hastghet;
        this.vikt = vikt;
        this.antalVäxlar = antalVäxlar;
        this.växelJustNu = växelJustNu;
    }

    public int getAntalVäxlar() {
        return antalVäxlar;
    }

    public void setAntalVäxlar(int antalVäxlar) {
        this.antalVäxlar = antalVäxlar;
    }

    public int getVäxelJustNu() {
        return växelJustNu;
    }

    public void setVäxelJustNu(int växelJustNu) {
        this.växelJustNu = växelJustNu;
    }

    @Override
    public String toString() {
        return "Bil{" +
                "antalVäxlar=" + antalVäxlar +
                ", växelJustNu=" + växelJustNu +
                '}';
    }
}

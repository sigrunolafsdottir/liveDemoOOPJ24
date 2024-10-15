package Sprint1.Lektion1.Bilregister.BilRegisterDistans;

public class Bil {

    private String regNr;
    private String color;
    private String märke;

    private Bilägare bilägare;

    public Bil(String regnr, String märke, String color){
        this.regNr = regnr;
        this.color = color;
        this.märke = märke;
    }

    public Bil(String regnr, String märke, String color, Bilägare bilägare){
        this.regNr = regnr;
        this.color = color;
        this.märke = märke;
        this.bilägare = bilägare;
    }

    public Bil(){}

    public String getRegNr() {
        return regNr;
    }

    public void setRegNr(String regNr) {
        this.regNr = regNr;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMärke() {
        return märke;
    }

    public void setMärke(String märke) {
        this.märke = märke;
    }

    public Bilägare getBilägare() {
        return bilägare;
    }

    public void köp(Bilägare bilägare) {
        this.bilägare = bilägare;
    }

    @Override
    public String toString() {
        return "Bil{" +
                "regNr='" + regNr + '\'' +
                ", color='" + color + '\'' +
                ", märke='" + märke + '\'' +
                ", bilägare=" + bilägare +
                '}';
    }
}

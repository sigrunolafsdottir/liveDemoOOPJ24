package Sprint1.Lektion1.Bilregister;

import Sprint1.Lektion1.Bilregister.details.SomeOtherFile;

public class Bil {

    private String regNr;
    private String color;
    private String märke;

    private BilÄgare bilÄgare;
    private SomeOtherFile someOtherFile;

    public Bil(String regNr, String color, String märke, BilÄgare bilÄgare){
        this.regNr = regNr;
        this.color = color;
        this.märke = märke;
        this.bilÄgare = bilÄgare;

    }

    public void setNyBilägare(BilÄgare bilägare){
        this.bilÄgare = bilägare;
    }

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

    public BilÄgare getBilÄgare() {
        return bilÄgare;
    }

    public void setBilÄgare(BilÄgare bilÄgare) {
        this.bilÄgare = bilÄgare;
    }

    public SomeOtherFile getSomeOtherFile() {
        return someOtherFile;
    }

    public void setSomeOtherFile(SomeOtherFile someOtherFile) {
        this.someOtherFile = someOtherFile;
    }
}

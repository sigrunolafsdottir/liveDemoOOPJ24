package Lektion1.Bilregister.SP;

public class Student extends Person {

    private String pnr;
    private double snittbetyg;

    public void setPnr(String pnr) {
        this.pnr = pnr;
    }

    public String setPnr2(String pnr) {
        this.pnr = pnr;
        return this.pnr;
    }

    public void setSnittbetyg(double snittbetyg) {
        this.snittbetyg = snittbetyg;
    }
}

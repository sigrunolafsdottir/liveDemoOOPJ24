package Lektion1.Bilregister;

import Lektion1.Bilregister.details.SomeOtherFile;

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
}

package Lektion4.Övningsuppgift2;

import javax.swing.*;

public class BilUträkning {
    
    public BilUträkning(){
        //separera inläsningen
        Double mätarställningNu = Double.parseDouble(JOptionPane.showInputDialog("Mätarställning nu: ").trim());
        Double mätarställningFörEttÅrSen = Double.parseDouble(JOptionPane.showInputDialog("Mätarställning för ett år sen: ").trim());
        Double BensinförbrukningUnderÅret = Double.parseDouble(JOptionPane.showInputDialog("Bensinförbrukning under året:  ").trim());

        huvudprogram(mätarställningNu, mätarställningFörEttÅrSen, BensinförbrukningUnderÅret);
    }

    //för test
    public BilUträkning(Double mätarställningNu, Double mätarställningFörEttÅrSen, Double BensinförbrukningUnderÅret){
        huvudprogram(mätarställningNu, mätarställningFörEttÅrSen, BensinförbrukningUnderÅret);
    }

    public void huvudprogram(Double mätarställningNu, Double mätarställningFörEttÅrSen, Double BensinförbrukningUnderÅret){

        double mileagePerYear = getMileageOverYear(mätarställningNu, mätarställningFörEttÅrSen);
        double gasPerMil = getGasPerMile(mileagePerYear, BensinförbrukningUnderÅret)  ;

        System.out.println(getPrintOutMileage(mileagePerYear));
        System.out.println(getPrintOutGas(BensinförbrukningUnderÅret));
        System.out.println(getPrintOutGasPerMile(gasPerMil));
    }

    public double getMileageOverYear(double mileageNow, double mileageThen){
        return mileageNow - mileageThen;
    }

    public double getGasPerMile(double mileageLastYear, double gasLastYear) {
        return gasLastYear / mileageLastYear;
    }

    public String getPrintOutMileage(double mileage){
        return "Antal körda mil: " + mileage;
    }

    public String getPrintOutGas(double usedGas){
        return "Antal liter bensin: "+usedGas;
    }

    public String getPrintOutGasPerMile (double usedGasPerMile){
        return "Förbrukning per mil: "+usedGasPerMile;
    }

    public static void main(String[] args) {
        BilUträkning bu = new BilUträkning();
  /*      Double mätarställningNu = Double.parseDouble(JOptionPane.showInputDialog("Mätarställning nu: ").trim());
        Double mätarställningFörEttÅrSen = Double.parseDouble(JOptionPane.showInputDialog("Mätarställning för ett år sen: ").trim());
        Double BensinförbrukningUnderÅret = Double.parseDouble(JOptionPane.showInputDialog("Bensinförbrukning under året:  ").trim());

        double mileagePerYear = bu.getMileageOverYear(mätarställningNu, mätarställningFörEttÅrSen);
        double gasPerMil = bu.getGasPerMile(mileagePerYear, BensinförbrukningUnderÅret)  ;

        System.out.println(bu.getPrintOutMileage(mileagePerYear));
        System.out.println(bu.getPrintOutGas(BensinförbrukningUnderÅret));
        System.out.println(bu.getPrintOutGasPerMile(gasPerMil));*/
    }

}

package Lektion4.ÖvnUppg2Uppdelad;

public class CalculationUtil {

    public double getDeltaMileage(double mileageNow, double mileageThen){
        return mileageNow-mileageThen;
    }

    public double getGasPerMile(double bensinFörbrukadUnderÅret, double deltaMileage){
        return bensinFörbrukadUnderÅret/deltaMileage;
    }
}

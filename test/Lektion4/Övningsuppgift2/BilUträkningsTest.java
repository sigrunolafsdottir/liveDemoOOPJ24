package Lektion4.Övningsuppgift2;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BilUträkningsTest {

    double mätarställningNu = 3000.0;
    double mätarställningDå = 1000.0;
    double bensinFörbrukningSenasteÅret = 10000.0;
    BilUträkning bt = new BilUträkning(mätarställningNu, mätarställningDå , bensinFörbrukningSenasteÅret);


    //inhämtas i programmet:
    //indata: mätarställning nu, mätarställning för ett år sen, bensinförbrukning under året
    //beräkningar: deltaMätarställning, bensin per mil
    //skriva ut våra resultat

    @Test
    public void testAntalMilSenasteÅret() {
        double deltaMätarställning = bt.getMileageOverYear(mätarställningNu, mätarställningDå);
        assertEquals(2000.0, deltaMätarställning);
        assertNotEquals(1000.0, deltaMätarställning);
    }

    @Test
    public void testGasPerMile() {
        double deltaMätarställning = bt.getMileageOverYear(mätarställningNu, mätarställningDå);
        double gasPerMile = bt.getGasPerMile(deltaMätarställning, bensinFörbrukningSenasteÅret);
        // bensinen / deltaMileage,    10000/ 2000
        assertEquals(5.0, gasPerMile);
        assertNotEquals(1000, gasPerMile);
    }

    //Antal körda mil:
    //Antal liter bensin:
    //Förbrukning per mil:

    @Test
    public void testPrintOutMileage(){
        String antalKördaMil = bt.getPrintOutMileage( 2000 );
        assertTrue(antalKördaMil.startsWith("Antal körda mil: ") );
        assertEquals(antalKördaMil, "Antal körda mil: 2000.0" );
    }

    @Test
    public void testPrintOutGas(){
        String förbrukadBensin = bt.getPrintOutGas( 10000 );
        assertTrue(förbrukadBensin.startsWith("Antal liter bensin: ") );
        assertEquals(förbrukadBensin, "Antal liter bensin: 10000.0" );
    }

    @Test
    public void testPrintOut(){
        String gasPerMile = bt.getPrintOutGasPerMile( 5 );
        assertTrue(gasPerMile.startsWith("Förbrukning per mil: ") );
        assertEquals(gasPerMile, "Förbrukning per mil: 5.0" );
    }


}

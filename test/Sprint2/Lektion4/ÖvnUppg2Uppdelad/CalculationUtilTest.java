package Sprint2.Lektion4.ÖvnUppg2Uppdelad;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class CalculationUtilTest {
    
    double mätarställningNu = 3000;
    double mätarställningDå = 1000;
    double bensinFörbrukadUnderÅret = 10000;

    CalculationUtil cu = new CalculationUtil();

    @Test
    void testGetDeltaMileage(){
        double deltaMileage = cu.getDeltaMileage(mätarställningNu, mätarställningDå);
        assertEquals(2000.0, deltaMileage);
        assertNotEquals(5000.0, deltaMileage);
    }

    @Test
    void testGetGasPerMile(){
        double deltaMileage = cu.getDeltaMileage(mätarställningNu, mätarställningDå);
        double gasPerMile = cu.getGasPerMile(bensinFörbrukadUnderÅret, deltaMileage);
        assertEquals(5.0, gasPerMile);
        assertNotEquals(5000.0, gasPerMile);
    }


    
}

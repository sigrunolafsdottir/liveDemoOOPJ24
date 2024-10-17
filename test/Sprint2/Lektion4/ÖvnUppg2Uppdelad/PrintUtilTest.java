package Sprint2.Lektion4.ÖvnUppg2Uppdelad;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PrintUtilTest {
    //Antal körda mil:
    //Antal liter bensin:
    //Förbrukning per mil:
    double testval = 2000.0;
    PrintUtil pu = new PrintUtil();

    @Test
    void testAntalKördaMil(){
        String s = pu.getPrintOutAntalKördaMil(testval);
        assertTrue(s.startsWith("Antal körda mil:"));
        String s2 = "Antal körda mil: "+testval;
        assertEquals(s2, s);
    }

    @Test
    void testAntalLiterBensin(){
        String s = pu.getPrintOutAntalLiterBensin(testval);
        assertTrue(s.startsWith("Antal liter bensin:"));
        assertEquals("Antal liter bensin: "+testval, s);
    }

    @Test
    void testFörbrukningPerMil(){
        String s = pu.getPrintOutFörbrukningPerMil(testval);
        assertTrue(s.startsWith("Förbrukning per mil:"));
    }

}

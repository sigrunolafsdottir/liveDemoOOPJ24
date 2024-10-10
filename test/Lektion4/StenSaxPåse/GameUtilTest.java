package Lektion4.StenSaxPåse;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GameUtilTest {

    //slumpa fram sten, sax eller påse
    // metod() -> Symbol
    GameUtil gu = new GameUtil();

    private boolean evaluateSymbol(Symbol symbol){
        if (symbol == Symbol.STEN || symbol == Symbol.SAX || symbol == Symbol.PÅSE ) {
            return true;
        }
        return false;
    }

    private boolean evaluateNumber(int i){
        if (i == 0 || i == 1 || i == 2 ) {
            return true;
        }
        return false;
    }

    @Test
    public void testGetRandomSymbol() {
        for (int i = 0; i < 100; i++) {
            Symbol s = gu.getRandomSymbol();
            //System.out.println(s);
            assertTrue(evaluateSymbol(s));
        }
    }


    //Metod som slumpar fram ett tal mellan 0 och 2
    // void metod() -> 0,1,2
    @Test
    public void testGetRandomNumber() {
        for (int i = 0; i < 100; i++) {
            int j = gu.getRandomNumber();
            //System.out.println(j);
            assertTrue(evaluateNumber(j));
        }
    }

}

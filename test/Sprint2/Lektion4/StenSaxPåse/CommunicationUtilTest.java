package Sprint2.Lektion4.StenSaxPåse;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CommunicationUtilTest {

    CommunicationUtil cu = new CommunicationUtil();



    //parsar input, returnerar rätt symbol
    //in: String, ut: Symbol
    @Test
    public void testParseUserInput() {
        String testdata1 = "sax";
        String testdata2 = "sten";
        String testdata3 = "påse";
        String testdata4 = "SAX";
        String testdata5 = "Sten";
        String testdata6 = "gdfgdfgdd";
        String testdata7 = " sax ";

        assertEquals(Symbol.SAX, cu.parseUserInput(testdata1));
        assertEquals(Symbol.STEN, cu.parseUserInput(testdata2));
        assertEquals(Symbol.PÅSE, cu.parseUserInput(testdata3));
        assertEquals(Symbol.SAX, cu.parseUserInput(testdata4));
        assertEquals(Symbol.STEN, cu.parseUserInput(testdata5));
        assertEquals(null, cu.parseUserInput(testdata6));
        assertEquals(Symbol.SAX, cu.parseUserInput(testdata7));

    }

    @Test
    public void testGetUserInput() {}
}

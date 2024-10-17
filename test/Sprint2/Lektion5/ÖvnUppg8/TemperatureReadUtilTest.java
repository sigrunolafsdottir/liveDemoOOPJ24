package Sprint2.Lektion5.ÖvnUppg8;

import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class TemperatureReadUtilTest {

    TemperatureReadUtil tru = new TemperatureReadUtil();


    //Vi fr en sträng typ 23,5 och denna ska göras om till double 23.5
    @Test
    public void parseLineTest(){
        assertEquals(23.5, tru.parseDouble("23,5"));
        assertNotEquals(23.0, tru.parseDouble("23,5"));
        NumberFormatException nfe = assertThrows(
                NumberFormatException.class, ()-> tru.parseDouble("hej"));
    }


    // readFromFile(String pathToFile)  => List<String>, 1 rad blir 1 element
    @Test
    public void readFromFileTest() throws IOException {
        List<String> expectedResult = Arrays.asList("13,5", "14,0", "14,5");
        List<String> actualList = tru.readFromFile("test/Sprint2/Lektion5/ÖvnUppg8/tempz.txt");

        assertEquals(expectedResult.size(), actualList.size());
        assertEquals(3, actualList.size());
        assertEquals(expectedResult.get(0), actualList.get(0));
        assertEquals(expectedResult.get(1), actualList.get(1));
        assertEquals(expectedResult.get(2), actualList.get(2));
        assertNotEquals("hej", actualList.get(2));

        IOException nfe = assertThrows(
                IOException.class, ()->tru.readFromFile("test/Sprint2/Lektion5/ÖvnUppg8/tempx.txt"));
    }


    @Test
    public void testStringListToDoubleList(){
        List<String> stringList = Arrays.asList("13,5", "14,0", "14,5");
        List<Double> expectedList = Arrays.asList(13.5, 14.0, 14.5);

        assertEquals(3, tru.getDoubleList(stringList).size());
        assertEquals(stringList.size(), tru.getDoubleList(stringList).size());
        assertEquals(expectedList.get(0), tru.getDoubleList(stringList).get(0));
        assertEquals(expectedList.get(1), tru.getDoubleList(stringList).get(1));
        assertEquals(expectedList.get(2), tru.getDoubleList(stringList).get(2));

    }


}

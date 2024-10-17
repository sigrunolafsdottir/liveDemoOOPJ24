package Sprint2.Lektion5.ÖvnUppg8;



import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class TemperatureCalculationUtilTest {

    TemperatureCalculationUtil cu = new TemperatureCalculationUtil();
    List<Double> list = Arrays.asList(13.5, 14.0, 14.5);

    @Test
    public void testAverage(){
        assertEquals(14.0, cu.getAverage(list));
        assertNotEquals(14.5, cu.getAverage(list));
    }

    @Test
    public void testHighest(){
        assertEquals(14.5, cu.getHighest(list));
        assertNotEquals(14.0, cu.getHighest(list));
    }

    @Test
    public void testLowest(){
        assertEquals(13.5, cu.getLowest(list));
        assertNotEquals(13.0, cu.getLowest(list));
    }


}

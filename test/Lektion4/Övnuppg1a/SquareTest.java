package Lektion4.Övnuppg1a;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class SquareTest {

    double width = 3;
    double height = 5;
    Square s = new Square(width, height);

    @Test
    public void testArea(){
        double area = s.getArea();
        assertEquals(15, area);
        assertNotEquals(10, area);
    }

    @Test
    public void testCircumference(){
        double circumference = s.getCircumference();
        assertEquals(16, circumference);
        assertNotEquals(10, circumference);
    }

}

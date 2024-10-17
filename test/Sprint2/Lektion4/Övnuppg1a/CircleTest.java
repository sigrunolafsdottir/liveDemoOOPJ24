package Sprint2.Lektion4.Övnuppg1a;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CircleTest {

    double radius = 5;
    Circle c = new Circle(radius);

    @Test
    public void testArea() {
        double area = c.getArea();
        assertEquals(77, area, 1.6);
    }

    @Test
    public void testCircumference() {
        double circ = c.getCircumference();
        assertEquals(31, circ, 0.5);

    }

}

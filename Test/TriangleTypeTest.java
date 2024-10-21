import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTypeTest {
    @Test
    @DisplayName("Equilateral triangle")
    public void testTriangleTypeCaseEquilateralGetTriangle() {
        TriangleType triangleType = new TriangleType();
        int side1 = 2;
        int side2 = 2;
        int side3 = 2;

        String result = "Equilateral triangle";
        String triangle = triangleType.getTriangleType(side1, side2, side3);
        assertEquals(result, triangle);
    }

    @Test
    @DisplayName("Isosceles triangle")
    public void testTriangleTypeCaseIsoscelesGetTriangle() {
        TriangleType triangleType = new TriangleType();
        int side1 = 2;
        int side2 = 2;
        int side3 = 3;

        String result = "Isosceles triangle";
        String triangle = triangleType.getTriangleType(side1, side2, side3);
        assertEquals(result, triangle);
    }


}
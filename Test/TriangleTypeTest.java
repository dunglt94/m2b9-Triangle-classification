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

    @Test
    @DisplayName("Scalene triangle")
    public void testTriangleTypeCaseRegularGetTriangle() {
        TriangleType triangleType = new TriangleType();
        int side1 = 3;
        int side2 = 4;
        int side3 = 5;

        String result = "Scalene triangle";
        String triangle = triangleType.getTriangleType(side1, side2, side3);
        assertEquals(result, triangle);
    }

    @Test
    @DisplayName("Not a triangle with 1 side greater than the sum of other 2 sides")
    public void testTriangleTypeCaseNotATriangle1() {
        TriangleType triangleType = new TriangleType();
        int side1 = 8;
        int side2 = 2;
        int side3 = 3;

        String result = "Not a triangle";
        String triangle = triangleType.getTriangleType(side1, side2, side3);
        assertEquals(result, triangle);
    }

    @Test
    @DisplayName("Not a triangle with 1 side smaller than 0")
    public void testTriangleTypeCaseNotATriangle2() {
        TriangleType triangleType = new TriangleType();
        int side1 = -1;
        int side2 = 2;
        int side3 = 1;

        String result = "Not a triangle";
        String triangle = triangleType.getTriangleType(side1, side2, side3);
        assertEquals(result, triangle);
    }

    @Test
    @DisplayName("Not a triangle with 1 side equal 0")
    public void testTriangleTypeCaseNotATriangle3() {
        TriangleType triangleType = new TriangleType();
        int side1 = 0;
        int side2 = 1;
        int side3 = 1;

        String result = "Not a triangle";
        String triangle = triangleType.getTriangleType(side1, side2, side3);
        assertEquals(result, triangle);
    }

}
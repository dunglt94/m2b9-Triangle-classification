public class TriangleType {
    public String getTriangleType(int side1, int side2, int side3) {
        String result;
        if (side1 == side2) {
            result = "Isosceles triangle";
            if (side2 == side3) {
                result = "Equilateral triangle";
            }
        } else {
            result = "Regular triangle";
        }

        boolean OneSideIsGreaterThanTheSumOfOtherSides = side1 > (side2 + side3) ||
                                                        side2 > (side1 + side3) ||
                                                        side3 > (side1 + side2);
        if (OneSideIsGreaterThanTheSumOfOtherSides) {
            result = "Not a triangle";
        }

        boolean OneSideIsSmallerThanOrEqual0 = side1 <= 0 || side2 <= 0 || side3 <= 0;
        if (OneSideIsSmallerThanOrEqual0) {
            result = "Not a triangle";
        }

        return result;
    }
}

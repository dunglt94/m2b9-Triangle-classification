public class TriangleType {
    public String getTriangleType(int side1, int side2, int side3) {
        boolean OneSideIsGreaterThanTheSumOfOtherSides =
                side1 > (side2 + side3) ||
                side2 > (side1 + side3) ||
                side3 > (side1 + side2);
        boolean OneSideIsSmallerThanOrEqual0 = side1 <= 0 || side2 <= 0 || side3 <= 0;
        if (OneSideIsSmallerThanOrEqual0 || OneSideIsGreaterThanTheSumOfOtherSides) {
            return "Not a triangle";
        }

        if (side1 == side2 && side2 == side3) {
            return "Equilateral triangle";
        }

        if (side1 == side2 || side1 == side3 || side2 == side3) {
            return "Isosceles triangle";
        }

        return "Scalene triangle";
    }
}

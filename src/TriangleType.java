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


        return result;
    }
}

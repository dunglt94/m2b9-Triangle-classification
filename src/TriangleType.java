public class TriangleType {
    public String TriangleType(int side1, int side2, int side3) {
        String result = "";
        if (side1 == side2 && side2 == side3) {
            result = "Equilateral triangle";
        }
        return result;
    }
}

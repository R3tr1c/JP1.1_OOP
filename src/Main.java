import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TriangleCustom triangle = new TriangleCustom( getTriangleSideLength("a"),
                                                      getTriangleSideLength("b"),
                                                      getTriangleSideLength("c"));

        float heightToSideALength = triangle.getTriangleHeightLength(triangle.getSideALength()),
              heightToSideBLength = triangle.getTriangleHeightLength(triangle.getSideBLength()),
              heightToSideCLength = triangle.getTriangleHeightLength(triangle.getSideCLength());

        printTriangleHeight("a", heightToSideALength);
        printTriangleHeight("b", heightToSideBLength);
        printTriangleHeight("c", heightToSideCLength);

    }
    private static float getTriangleSideLength(String sideName) {
        System.out.printf("Длина стороны %s: ", sideName);
        Scanner inputScan = new Scanner(System.in);
        return  inputScan.nextFloat();
    }

    private static void printTriangleHeight(String toSideName, float heightLength){
        System.out.printf("\nВысота треугольника к стороне %s: %.2f;", toSideName, heightLength);
    }
}
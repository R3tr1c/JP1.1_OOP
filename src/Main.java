import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final char[] TriangleSidesName = {'a', 'b', 'c'};
        float[] TriangleSidesLength = { 0, 0, 0 },
                TriangleHeightsLength = { 0, 0, 0 };

        Scanner input_scan = new Scanner(System.in);

        System.out.println("\nВведите стороны треугольника:");
        for (int i = 0; i < 3; i++){
            System.out.printf("%s = ", TriangleSidesName[i]);
            TriangleSidesLength[i] = input_scan.nextFloat();
        }
        TriangleProperties Triangle = new TriangleProperties(TriangleSidesLength);

        TriangleHeightsLength = Triangle.GetTriangleProperties_Heights();

        System.out.println("\nВысоты треугольника: ");

        for (int i = 0; i < 3; i++){
            System.out.printf("h(%s) = %f \n", TriangleSidesName[i],  TriangleHeightsLength[i]);
        }
    }
}
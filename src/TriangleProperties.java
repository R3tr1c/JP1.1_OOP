public class TriangleProperties {

    public TriangleProperties( float[] TriangleSidesLengthInput ){
        TriangleSidesLength = TriangleSidesLengthInput;
        CheckSidesInput();
    }

    public float[] GetTriangleProperties_Heights(){
        float[] TriangleHeightsLength = { 0, 0, 0 };

        float p = (TriangleSidesLength[0] + TriangleSidesLength[1] + TriangleSidesLength[2]) / 2;

        float universal_count_part = (float) Math.sqrt( p * (p - TriangleSidesLength[0]) * (p - TriangleSidesLength[1]) * (p - TriangleSidesLength[2]));

        for (int i = 0; i < 3; i++){
            TriangleHeightsLength[i] = (2 / TriangleSidesLength[i]) * universal_count_part;
        }

        return TriangleHeightsLength;
    }

    private void CheckSidesInput(){
        if ( TriangleSidesLength[0] <= 0 || TriangleSidesLength[1] <= 0 || TriangleSidesLength[2] <= 0 )
            throw new IllegalArgumentException("Длина каждой из сторон треугольника должна быть больше нуля.");
        if ( TriangleSidesLength[0] > ( TriangleSidesLength[1] + TriangleSidesLength[2] ) ||
             TriangleSidesLength[1] > ( TriangleSidesLength[2] + TriangleSidesLength[0] ) ||
             TriangleSidesLength[2] > ( TriangleSidesLength[1] + TriangleSidesLength[0] )    ) {
            throw new IllegalArgumentException("Длина каждой из сторон треугольника не может быть больше суммы двух других сторон.");
        }
    }

    private float[]  TriangleSidesLength = { 0, 0, 0 };
}

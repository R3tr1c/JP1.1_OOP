public class TriangleCustom {
    public TriangleCustom(float sideALength, float sideBLength, float sideCLength){
        checkTriangleSideLength(sideALength);
        checkTriangleSideLength(sideBLength);
        checkTriangleSideLength(sideCLength);

        checkTriangleValid(sideALength, sideBLength, sideCLength);

        this.sideALength = sideALength;
        this.sideBLength = sideBLength;
        this.sideCLength = sideCLength;
    }

    public float getSideALength() {
        return sideALength;
    }

    public float getSideBLength(){
        return sideBLength;
    }

    public float getSideCLength(){
        return sideCLength;
    }

    public float getTriangleHeightLength(float sideLength){
        return 2 * getTriangleArea() / sideLength;
    }

    public float getTriangleArea() {
        if (triangleArea <= 0){
            setTriangleArea();
        }
        return triangleArea;
    }

    private final float sideALength,
                        sideBLength,
                        sideCLength;
    private float triangleArea;

    private void checkTriangleSideLength(float sideLength){
        if (sideLength <= 0) {
            throw new IllegalArgumentException("Длина каждой из сторон треугольника больше 0.");
        }
    }
    private void checkTriangleValid(float sideALength, float sideBLength, float sideCLength) {
        if (sideALength > (sideBLength + sideCLength) ||
            sideBLength > (sideCLength + sideALength) ||
            sideCLength > (sideBLength + sideALength)) {
            throw new IllegalArgumentException("Длина каждой из сторон треугольника не может быть больше суммы двух других сторон.");
        }
    }

    private void setTriangleArea(){
        float semiPerimeter = (sideALength + sideBLength + sideCLength) / 2;
        triangleArea = (float) Math.sqrt(semiPerimeter * (semiPerimeter - sideALength) * (semiPerimeter - sideBLength) * (semiPerimeter - sideCLength));
    }
}

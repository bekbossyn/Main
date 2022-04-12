public class ConstructRectangle {

    public int[] constructRectangle(int area) {
        for (int i = (int) Math.sqrt(area); i > 0; i--) {
            if (((area / i) * i) == area) return new int[]{area / i, i};
        }
        return new int[]{0, 0};
    }

}

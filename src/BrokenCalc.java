public class BrokenCalc {

    public int brokenCalc(int startValue, int target) {
        int result = 0;
        while (target > startValue) {
            result++;
            if (target % 2 == 0) {
                target /= 2;
            } else {
                target++;
            }
        }
        return result + startValue - target;
    }

}

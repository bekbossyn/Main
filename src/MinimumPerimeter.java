public class MinimumPerimeter {

    public long minimumPerimeter(long aps) {
        long i = 1;
        while (aps > 0) {
            aps -= i * i * 12;
            i++;
        }
        return (i - 1) * 8;
    }

}

public class SortByBits {

    public int[] sortByBits(int[] arr) {
        for (int i = 0; i < arr.length; i++)
            for (int j = 1; j < arr.length; j++) {
                int aa1 = Integer.bitCount(arr[j - 1]);
                int aa2 = Integer.bitCount(arr[j]);
                if (aa1 > aa2 || (aa1 == aa2 && arr[j - 1] > arr[j])) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        return arr;
    }

}

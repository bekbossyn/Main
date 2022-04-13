public class DuplicateZeros {

    public void duplicateZeros(int[] arr) {
        int i = 0;
        while (arr.length > i) {
            if (arr[i] == 0) {
                for (int j = arr.length - 1; j > i; j--) {
                    arr[j] = arr[j - 1];
                }
                i += 2;
            } else i++;

        }
    }
}

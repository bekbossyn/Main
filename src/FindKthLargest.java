public class FindKthLargest {

    public int findKthLargest(int[] ns, int k) {
        int[] count = new int[20001];
        int difference = 10000;
        for (int n : ns) count[n + difference]++;
        int index = 10000 + difference;
        while (k >= 0) {
            if (count[index] > 0) k -= count[index];
            index--;
        }
        return index - difference;
    }

}

public class SmallestEqual {

    public int smallestEqual(int[] ns) {
        for (int i = 0 ; i < ns.length; i++){
            if (i % 10 == ns[i]) return i;
        }
        return -1;
    }

}

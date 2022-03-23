public class SortByParity {

    public int[] sortArrayByParity(int[] ns) {
        int[] ms=new int[ns.length];
        int ind = 0;
        for (int n : ns){
            if (n % 2 == 0){
                ms[ind++] = n;
            }
        }
        for (int n : ns){
            if (n % 2 == 1){
                ms[ind++] = n;
            }
        }
        return ms;
    }

}

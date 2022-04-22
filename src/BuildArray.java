public class BuildArray {

    public int[] buildArray(int[] ns) {
        int n = ns.length;

        for(int i=0; i<n; i++){
            ns[i] = ns[i] + n * (ns[ns[i]] % n);
        }

        for(int i=0; i<n; i++){
            ns[i] = ns[i]/n;
        }

        return ns;
    }

}

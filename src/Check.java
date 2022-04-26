public class Check {

    public boolean check(int[] ns) {
        int ch = 0;
        for (int i = 0; i < ns.length - 1; i++)
            if (ns[i] > ns[i + 1]) ch++;
        if (ns[ns.length - 1] > ns[0]) ch++;
        return ch < 2;
    }

}

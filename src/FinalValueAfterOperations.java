public class FinalValueAfterOperations {

    public int finalValueAfterOperations(String[] os) {
        int n = 0;
        for (int i = 0; i < os.length; i++)
            if (os[i].contains("--")) n--;
            else if (os[i].contains("++")) n++;
        return n;
    }

}

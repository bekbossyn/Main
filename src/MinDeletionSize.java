public class MinDeletionSize {

    public int minDeletionSize(String[] ss) {
        int count = 0;
        for (int j = 0; j < ss[0].length(); j++) {
            boolean found = false;
            for (int i = 1; i < ss.length; i++) {
                if (ss[i].charAt(j) < ss[i - 1].charAt(j)) {
                    found = true;
                    break;
                }
            }
            if (found) count++;
        }
        return count;
    }

}

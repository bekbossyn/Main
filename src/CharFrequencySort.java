public class CharFrequencySort {

    public String frequencySort(String s) {
        int[] cs = new int[255];
        int[] is = new int[255];
        for (int i = 0; i < is.length; i++) is[i] = i;
        for (int i = 0; i < s.length(); i++) {
            cs[s.charAt(i)]++;
        }

        //  sorting
        for (int j = 0; j < 255; j++) {
            for (int i = 0; i < 255 - 1; i++) {
                if (cs[i] < cs[i + 1]) {
                    int temp = cs[i];
                    cs[i] = cs[i + 1];
                    cs[i + 1] = temp;
                    temp = is[i];
                    is[i] = is[i + 1];
                    is[i + 1] = temp;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < is.length; i++) {
            for (int c = 0; c < cs[i]; c++) {
                sb.append((char) is[i]);
            }
        }
        return sb.toString();
    }

}

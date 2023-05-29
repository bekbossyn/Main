public class CountAndSay {

    public String countAndSay(int n) {
        StringBuilder s = new StringBuilder("1");
        for (int i = 1; i < n; i++) {
            StringBuilder nn = new StringBuilder(s);
            char last = nn.charAt(0);
            int count = 0;
            s = new StringBuilder();
            for (int j = 0; j < nn.length(); j++) {
                if (nn.charAt(j) == last) count++;
                else {
                    s.append(String.valueOf(count)).append(last);
                    count = 1;
                    last = nn.charAt(j);
                }
            }
            if (count > 0) {
                s.append(String.valueOf(count)).append(last);
            }
        }
        return s.toString();
    }

}

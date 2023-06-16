import java.util.ArrayList;
import java.util.List;

public class ReadBinaryWatch {

    public List<String> readBinaryWatch(int turnedOn) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 60; j++) {
                StringBuilder s = new StringBuilder(Integer.toBinaryString(i));
                s.append(Integer.toBinaryString(j));
                if (count(s) == turnedOn) {
                    String st = Integer.toString(j);
                    if (j < 10) st = '0' + st;
                    st = Integer.toString(i) + ':' + st;
                    result.add(st);
                }
            }
        }
        return result;
    }

    private int count(StringBuilder s) {
        int cnt = 0;
        for (int i = 0; i < s.length(); i++) if (s.charAt(i) == '1') cnt++;
        return cnt;
    }
}


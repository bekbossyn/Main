import java.util.ArrayList;
import java.util.List;

public class ConvertToTitle {

    public String convertToTitle(int cN) {
        String a = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        List<Integer> l = new ArrayList<>();
        while (cN > 26) {
            if (cN % 26 != 0)
                l.add(cN % 26);
            else {
                l.add(26);
                cN -= 26;
            }
            cN /= 26;
        }
        l.add(cN);
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < l.size(); i++)
            res.insert(0, a.charAt(l.get(i) - 1));
        return res.toString();
    }

}

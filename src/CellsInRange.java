import java.util.ArrayList;
import java.util.List;

public class CellsInRange {

    public List<String> cellsInRange(String s) {
        List<String> ss = new ArrayList<>();
        for (char c = s.charAt(0); c <= s.charAt(3); c++) {
            for (int i = s.charAt(1) - 48; i <= s.charAt(4) - 48; i++) {
                ss.add(c + Integer.toString(i));
            }
        }
        return ss;
    }

}

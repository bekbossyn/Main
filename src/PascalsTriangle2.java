import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle2 {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();
        row.add(1);
        if (rowIndex == 0) return row;
        row.add(1);
        for (int i = 2; i <= rowIndex; i++) {
            List<Integer> newRow = new ArrayList<>();
            newRow.add(1);
            for (int j = 1; j < row.size(); j++)
                newRow.add(row.get(j) + row.get(j - 1));
            newRow.add(1);
            row = newRow;
        }
        return row;
    }
}

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<Integer> row = new ArrayList<>();
        List<List<Integer>> rows = new ArrayList<>();
        row.add(1);
        rows.add(row);
        for (int i = 2; i <= numRows; i++ ) {
            List<Integer> tempRow = new ArrayList<>();
            tempRow.add(1);
            for (int j = 1; j < row.size();j++)
                tempRow.add(row.get(j) + row.get(j - 1));
            tempRow.add(1);
            row = tempRow;
            rows.add(tempRow);
        }
        return rows;
    }
}

import java.util.*;

public class LexicalOrder {

    public List<Integer> lexicalOrder(int n) {
        List<Integer> result = new ArrayList<>();
        dfs(n, 1, result);
        return result;
    }

    private void dfs(int n, int i, List<Integer> result) {
        if (i > n) return;
        result.add(i);
        dfs(n, i * 10, result);
        if (i % 10 != 9)
            dfs(n, i + 1, result);
    }

}

import java.util.HashMap;

public class IsPathCrossing {

    static class Pair {
        int x, y;

        Pair(int x, int y) {
            this.x = x;
            this.y = y;

        }
    }

    public boolean isPathCrossing(String path) {
        int ix = 0, iy = 0;
        HashMap<Character, Pair> h = new HashMap<>();
        HashMap<String, Boolean> visited = new HashMap<>();
        h.put('N', new Pair(1, 0));
        h.put('E', new Pair(0, 1));
        h.put('S', new Pair(-1, 0));
        h.put('W', new Pair(0, -1));
        visited.put("0#0", true);
        for (int i = 0; i < path.length(); i++) {
            ix += h.get(path.charAt(i)).x;
            iy += h.get(path.charAt(i)).y;
            if (visited.containsKey(String.valueOf(ix) + "#" + iy)) return true;
            visited.put(String.valueOf(ix) + "#" + iy, true);
        }
        return false;
    }

}

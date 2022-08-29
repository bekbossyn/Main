public class JudgeCircle {

    public boolean judgeCircle(String m) {
        int x = 0, y = 0;
        for (char c : m.toCharArray()) {
            if (c == 'R') x++;
            if (c == 'L') x--;
            if (c == 'U') y++;
            if (c == 'D') y--;
        }
        return x == 0 && y == 0;
    }

}

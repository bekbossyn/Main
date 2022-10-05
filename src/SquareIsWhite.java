public class SquareIsWhite {

    public boolean squareIsWhite(String cs) {
        int x = cs.charAt(0) - 'a' + 1;
        int y = cs.charAt(1) - '0';
        return (x + y) % 2 != 0;
    }

}

import java.util.*;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args)  {

        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        out.println(new SortedArrayToBST().sortedArrayToBST(new int[]{0,1,2,3,4,5}));

        in.close();
        out.close();
    }
}

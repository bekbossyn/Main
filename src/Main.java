import java.util.*;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args)  {

        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        out.printf("%.5f\n",new Powxn().myPow(2.00, 10));
        out.printf("%.5f\n",new Powxn().myPow(2.10, 3));
        out.printf("%.5f\n",new Powxn().myPow(2.0, -2));
        out.printf("%.5f\n",new Powxn().myPow(1.0, -2147483648));

        in.close();
        out.close();
    }
}

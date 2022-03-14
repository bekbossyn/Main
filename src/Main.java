import java.util.*;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args)  {

        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        out.println(new ValidParentheses().isValid("{}(())[]"));

        in.close();
        out.close();
    }
}

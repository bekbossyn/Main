import java.io.*;
import java.util.*;

public class Sample {


    public static class Pair {

        int a;
        int b;

        Pair(int a, int b) {
            this.a = a;
            this.b = b;
        }
    }

    // For fast input output
    static class FastReader {

        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            try {
                br = new BufferedReader(new FileReader("input.txt"));
                PrintStream out = new PrintStream(new FileOutputStream("output.txt"));
                System.setOut(out);
            } catch (Exception e) {
                br = new BufferedReader(new InputStreamReader(System.in));
            }
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }

    // end of fast i/o code
    public static void main(String[] args) {
        FastReader s = new FastReader();
        int n = s.nextInt();
        int q = s.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }

        int[] query = new int[q];

        for (int i = 0; i < q; i++) {
            query[i] = s.nextInt();
        }

        Stack<Pair> st = new Stack<>();
        for (int i = n - 1; i >= 0; i--) {
            st.add(new Pair(a[i], i + 1));
        }
        StringBuilder res = new StringBuilder();

        for (int i = 0; i < q; i++) {
            Stack<Pair> temp = new Stack<>();
            int val = query[i];
            int ans = -1;
            int x = 0;
            while (!st.isEmpty()) {
                Pair p = st.pop();
                x++;
                int v = p.a;
                int idx = p.b;

                if (v == val) {
                    ans = idx;
                    break;
                } else {
                    temp.add(p);
                }
            }

            while (!temp.isEmpty()) {
                st.push(temp.pop());
            }

            st.push(new Pair(val, 1));
            res.append(Integer.toString(x));
            res.append(" ");
        }
        System.out.println(res);
    }
}

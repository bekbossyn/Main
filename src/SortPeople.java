import java.util.Arrays;

public class SortPeople {

    static class Pair {
        int height;
        String name;

        Pair(int height, String name) {
            this.height = height;
            this.name = name;
        }

        public static int compare(Pair p1, Pair p2) {
            return p2.height - p1.height;
        }

        public String toString() {
            return "Name: " + this.name + ", height: " + this.height;
        }
    }

    public String[] sortPeople(String[] ns, int[] hs) {
        Pair[] people = new Pair[ns.length];
        for (int i = 0; i < ns.length; i++) {
            people[i] = new Pair(hs[i], ns[i]);
        }
        Arrays.sort(people, Pair::compare);
        for (int i = 0; i < ns.length; i++) {
            ns[i] = people[i].name;
        }
        return ns;
    }

}

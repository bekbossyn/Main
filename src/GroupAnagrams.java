import java.util.*;

public class GroupAnagrams {

    public List<List<String>> groupAnagrams(String[] sts) {
        List<List<String>> uniques = new ArrayList<>();
        uniques.add(new ArrayList<>(Collections.singleton(sts[0])));
//        HashSet<String> unused = new HashSet<>(List.of(sts));
//        unused.remove(sts[0]);
        for (int k = 1; k < sts.length; k++) {
            String word = sts[k];
            boolean found = false;
            for (int i = 0; i < uniques.size(); i++) {
                String first = uniques.get(i).get(0);
                if (word.length() == first.length() && anagrams(word, first)) {
                    uniques.get(i).add(word);
//                    unused.remove(word);
                    found = true;
                    break;
                }
            }
            if (!found) {
                uniques.add(new ArrayList<>(Collections.singleton(word)));
//                unused.remove(word);
            }
        }
        return uniques;
    }

    boolean anagrams(String a, String b) {
        if (a.length() != b.length()) return false;
        char[] aa = a.toCharArray();
        char[] bb = b.toCharArray();
        Arrays.sort(aa);
        Arrays.sort(bb);
        return Arrays.equals(aa, bb);
    }

}

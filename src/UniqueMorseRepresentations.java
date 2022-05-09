import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UniqueMorseRepresentations {

    public int uniqueMorseRepresentations(String[] ws) {
        Set<String> hh = new HashSet<>();
        String[] morse = new String[]{".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
        for (String w : ws) {
            StringBuilder name = new StringBuilder();
            for (char c : w.toCharArray()) {
                name.append(morse[c - 'a']);
            }
            hh.add(name.toString());
        }
        return hh.size();
    }
    
}

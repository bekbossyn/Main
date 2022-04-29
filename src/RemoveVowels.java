public class RemoveVowels {

    public String removeVowels(String s) {
        StringBuilder ss = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (!(c == 'i' || c == 'o' || c == 'e' || c == 'a' || c == 'u')) {
                ss.append(c);
            }
        }
        return ss.toString();
    }

}

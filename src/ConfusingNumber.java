public class ConfusingNumber {

    public boolean confusingNumber(int n) {
        String nn = Integer.toString(n);
        StringBuilder ns = new StringBuilder();
        for (int i = 0; i < nn.length(); i++) {
            if (nn.charAt(i) == '1') {
                ns.append('1');
            } else if (nn.charAt(i) == '8') {
                ns.append('8');
            } else if (nn.charAt(i) == '6') {
                ns.append('9');
            } else if (nn.charAt(i) == '9') {
                ns.append('6');
            } else if (nn.charAt(i) == '0') {
                ns.append('0');
            } else return false;
        }
//        int nq = Integer.parseInt(ns.toString());
        return !ns.reverse().toString().equals(nn);
    }

}

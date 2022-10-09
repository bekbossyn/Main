import java.util.HashMap;

public class OriginalDigits {

    public String originalDigits(String s) {
        char[] b = new char[]{'e', 'g', 'f', 'i', 'h', 'o', 'n', 's', 'r', 'u', 't', 'w', 'v', 'x', 'z'};
        HashMap<Character, Integer> h = new HashMap<>();
        for (char ch : b) h.put(ch, 0);
        for (char ch : s.toCharArray()) h.put(ch, h.get(ch) + 1);
        int[] a = new int[10];

        // SIX [6]
        //'x'
        int cur = h.get('x');
        a[6] = cur;
        h.put('s', h.get('s') - h.get('x'));
        h.put('i', h.get('i') - h.get('x'));
        h.put('x', 0);

        // TWO [2]
        // 'w'
        cur = h.get('w');
        a[2] = cur;
        h.put('t', h.get('t') - h.get('w'));
        h.put('o', h.get('o') - h.get('w'));
        h.put('w', 0);

        // ZERO [0]
        // 'z'
        cur = h.get('z');
        a[0] = cur;
        h.put('e', h.get('e') - h.get('z'));
        h.put('r', h.get('r') - h.get('z'));
        h.put('o', h.get('o') - h.get('z'));
        h.put('z', 0);

        // FOUR [4]
        // 'u'
        cur = h.get('u');
        a[4] = cur;
        h.put('f', h.get('f') - h.get('u'));
        h.put('o', h.get('o') - h.get('u'));
        h.put('r', h.get('r') - h.get('u'));
        h.put('u', 0);

        // EIGHT [8]
        // 'g'
        cur = h.get('g');
        a[8] = cur;
        h.put('e', h.get('e') - h.get('u'));
        h.put('i', h.get('i') - h.get('u'));
        h.put('h', h.get('h') - h.get('u'));
        h.put('t', h.get('t') - h.get('u'));
        h.put('g', 0);

        // SEVEN [7]
        // 's'
        cur = h.get('s');
        a[7] = cur;
        h.put('e', h.get('e') - cur * 2);
        h.put('v', h.get('v') - cur);
        h.put('n', h.get('n') - cur);
        h.put('s', 0);

        // FIVE [5]
        // 'f'
        cur = h.get('f');
        a[5] = cur;
        h.put('i', h.get('i') - cur);
        h.put('v', h.get('v') - cur);
        h.put('e', h.get('e') - cur);
        h.put('f', 0);

        // ONE [1]
        // 'o'
        cur = h.get('o');
        a[1] = cur;
        h.put('n', h.get('n') - cur);
        h.put('e', h.get('e') - cur);
        h.put('o', 0);

        // THREE [3]
        // 'r'
        cur = h.get('r');
        a[3] = cur;
        h.put('t', h.get('t') - cur);
        h.put('h', h.get('h') - cur);
        h.put('e', h.get('e') - cur * 2);

        // NINE [9]
        // 'n'
        cur = h.get('n');
        a[9] = cur / 2;
        StringBuilder ss = new StringBuilder();
        for (int i = 0; i < 10; i++)
            for (int j = 0; j < a[i]; j++)
                ss.append((char) (i + '0'));
        return ss.toString();
    }

}

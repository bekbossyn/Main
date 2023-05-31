import java.util.*;

public class TopKFrequent {

    public int[] topKFrequent(int[] ns, int k) {
        HashMap<Integer, List<Integer>> quantityMap = new HashMap<>();
        int difference = 10000;
        int[] counter = new int[difference * 2 + 1];
        for (int n : ns) {
            counter[n + difference]++;
        }
        for (int i = -difference; i <= difference; i++) {
            if (counter[i + difference] > 0) {
                List<Integer> list = quantityMap.getOrDefault(counter[i + difference], new ArrayList<>());
                list.add(i);
                quantityMap.put(counter[i + difference], list);
            }
//            quantityMap.put(i, quantityMap.getOrDefault(i, 0) + 1);
        }
        int[] answer = new int[k];
        int index = 0;
        for (int i = 100000; i > 0 && index < k; i--) {
            if (quantityMap.containsKey(i)) {
                List<Integer> list = quantityMap.get(i);
                for (int j = 0; j < list.size(); j++)
                    answer[index++] = list.get(j);
            }
        }
        return answer;
    }

    class Pair {
        String word;
        int count;

        Pair(String word) {
            this.word = word;
            this.count = 1;
        }

        void increase() {
            this.count += 1;
        }

        public static int compare(Pair w1, Pair w2) {
            if (w1.count == w2.count) {
                return w1.word.compareTo(w2.word);
            }
            return w2.count - w1.count;
        }
    }

    public List<String> topKFrequent(String[] words, int k) {
        List<String> answer = new ArrayList<>();
        List<Pair> ws = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();
        HashSet<String> set = new HashSet<>();
        int index = 0;
        for (int i = 0; i < words.length; i++) {
            if (set.contains(words[i])) {
                Pair pair = ws.get(map.get(words[i]));
                pair.increase();
            } else {
                set.add(words[i]);
                map.put(words[i], index++);
                ws.add(new Pair(words[i]));
            }
        }

        ws.sort(Pair::compare);
        for (int i = 0; i < k; i++)
            answer.add(ws.get(i).word);
        return answer;
    }

}

import java.util.*;

public class LargestWordCount {

    public String largestWordCount(String[] messages, String[] senders) {
        int maxCount = 0;
        String maxName = "";
        HashMap<String, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < senders.length; i++) {
            int cnt = messages[i].split("\\s+").length;

            hashMap.put(senders[i], hashMap.getOrDefault(senders[i], 0) + cnt);
            cnt = hashMap.get(senders[i]);
            if (cnt >= maxCount) {
                if (cnt > maxCount) {
                    maxName = senders[i];
                    maxCount = cnt;
                } else {
                    if (maxName.compareTo(senders[i]) < 0) {
                        maxName = senders[i];
                    }
                }
            }
        }

        return maxName;
    }

}

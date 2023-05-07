import java.util.HashMap;

class FrequencyTracker {
    HashMap<Integer, Integer> h = new HashMap<>();
    int[] frequency = new int[100005];

    public FrequencyTracker() {
        this.h = new HashMap<>();
        this.frequency = new int[100005];

    }

    public void add(int number) {
        this.h.put(number, h.getOrDefault(number, 0) + 1);
        int freq = h.get(number);
        this.frequency[freq]++;
        this.frequency[freq - 1] = Math.max(this.frequency[freq - 1] - 1, 0);
    }

    public void deleteOne(int number) {
        boolean exists = h.containsKey(number);
        if (exists) {
            int freq = h.get(number);
            this.h.put(number, Math.max(0, h.get(number) - 1));
            this.frequency[freq] = Math.max(this.frequency[freq] - 1, 0);
            if (freq > 0)
                this.frequency[freq - 1]++;
        }
    }

    public boolean hasFrequency(int frequency) {
        return this.frequency[frequency] > 0;
    }
}

/**
 * Your FrequencyTracker object will be instantiated and called as such:
 * FrequencyTracker obj = new FrequencyTracker();
 * obj.add(number);
 * obj.deleteOne(number);
 * boolean param_3 = obj.hasFrequency(frequency);
 */
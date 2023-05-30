import java.util.ArrayList;
import java.util.List;


class Pair {
    int key, value;

    Pair(int key, int value) {
        this.key = key;
        this.value = value;
    }

}

class MyHashSet {


    List<Pair> list;

    public MyHashSet() {
        list = new ArrayList<>();
    }

    public void add(int key) {
        if (contains(key)) {
        } else {
            list.add(new Pair(key, 1));
        }
    }

    public void remove(int key) {
        int index = -1;
        for (int i = 0; i < list.size(); i++) {
            Pair pair = list.get(i);
            if (pair.key == key) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            list.remove(index);
        }
    }

    public boolean contains(int key) {
        for (int i = 0; i < list.size(); i++) {
            Pair pair = list.get(i);
            if (pair.key == key) {
                return true;
            }
        }
        return false;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */
/*
File creation Date and time:
[YYYY:MM:DD]:   2023/05/11
[HH:MM:SS]      16:39:52
*/


public class NextPermutation {

    public void nextPermutation(int[] ns) {
        int first = -1, last = -1, temp, i, j;
        for (i = ns.length - 2; i >= 0; i--)
            if (ns[i] < ns[i + 1]) {
                first = i;
                break;
            }

        if (first == -1) {
            reverse(0, ns);
        } else {
            for (i = ns.length - 1; i >= 0; i--) {
                if (ns[i] > ns[first]) {
                    last = i;
                    break;
                }
            }
            swap(first, last, ns);

            reverse(first + 1, ns);

        }

    }

    void swap(int i, int j, int[] ns) {
        int temp = ns[i];
        ns[i] = ns[j];
        ns[j] = temp;
    }

    void reverse(int i, int[] ns) {
        int j = ns.length - 1;
        while (i < j) {
            swap(i, j, ns);
            i++;
            j--;

        }
    }

}

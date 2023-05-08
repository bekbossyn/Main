public class ColorTheArray {

    public int[] colorTheArray(int n, int[][] qs) {
        int len = qs.length;
        int[] answer = new int[len];
        int[] colors = new int[n];
        int count = 0;
        int counter = 0;
        for (int[] q : qs) {
            int index = q[0];
            int color = q[1];
            if (index > 0 && colors[index - 1] > 0 && colors[index] == colors[index - 1]) count--;
            if (index < n - 1 && colors[index + 1] > 0 && colors[index + 1] == colors[index]) count--;
            colors[index] = color;
            if (index > 0 && colors[index] == colors[index - 1]) count++;
            if (index < n - 1 && colors[index + 1] == colors[index]) count++;
            answer[counter++] = count;
        }
        return answer;
    }
}

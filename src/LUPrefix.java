class LUPrefix {

    private boolean[] used = new boolean[0];
    private int min;

    public LUPrefix(int n) {
        this.used = new boolean[n + 2];
        this.min = -1;
    }

    public void upload(int video) {
        this.used[video] = true;
    }

    public int longest() {
        int i = Math.max(1, this.min);
        int n = used.length;
        while (used[i]) i++;
        this.min = i - 1;
        return i - 1;
    }
}
public class ImageSmoother {

    public int[][] imageSmoother(int[][] img) {
        int[][] res = new int[img.length][img[0].length];
        for (int i = 0; i < img.length; i++)
            for (int j = 0; j < img[0].length; j++)
                res[i][j] = total(img, i, j);
        return res;
    }

    public int total(int[][] img, int i, int j) {
        int sum = img[i][j];
        int cnt = 1;
        if (i - 1 > -1) {
            sum += img[i - 1][j];
            cnt++;
            if (j - 1 > -1) {
                sum += img[i - 1][j - 1];
                cnt++;
            }
            if (j + 1 < img[0].length) {
                sum += img[i - 1][j + 1];
                cnt++;
            }
        }
        if (i + 1 < img.length) {
            sum += img[i + 1][j];
            cnt++;
            if (j - 1 > -1) {
                sum += img[i + 1][j - 1];
                cnt++;
            }
            if (j + 1 < img[0].length) {
                sum += img[i + 1][j + 1];
                cnt++;
            }
        }
        if (j + 1 < img[0].length) {
            sum += img[i][j + 1];
            cnt++;
        }
        if (j - 1 > -1) {
            sum += img[i][j - 1];
            cnt++;
        }
        return sum / cnt;
    }

}

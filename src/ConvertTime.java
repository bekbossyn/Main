public class ConvertTime {

    public int convertTime(String current, String correct) {
        int ch = Integer.parseInt(current.substring(0, 2));
        int cm = Integer.parseInt(current.substring(3));
        int corh = Integer.parseInt(correct.substring(0, 2));
        int corm = Integer.parseInt(correct.substring(3));
        System.out.println(ch + " " + cm);
        int cnt = 0;
        int currentT = 60 * ch + cm;
        int correctT = 60 * corh + corm;
        if (correctT < currentT) {
            correctT += 24 * 60;
        }
        while (correctT != currentT) {
            if (currentT + 60 <= correctT) {
                currentT += 60;
                cnt++;
            } else if (currentT + 15 <= correctT) {
                currentT += 15;
                cnt++;
            } else if (currentT + 5 <= correctT) {
                currentT += 5;
                cnt++;
            } else {
                currentT += 1;
                cnt++;
            }
        }
        return cnt;
    }

}

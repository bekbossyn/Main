public class IsMajorityElement {

    public boolean isMajorityElement(int[] ns, int t) {
        int cnt = 0;
        for (int n : ns) if (n == t) cnt++;
        return cnt > ns.length / 2;
    }

}

public class GetSum {

    public int getSum(int a, int b) {
        // int xor = a ^ b;
        // System.out.println("XOR [a ^ b] :" + xor);
        // int and = a & b;
        // System.out.println("AND [a AND b] :" + and);
        // and <<= 1;
        // System.out.println("AND shift 1 to left [and >> 1] :" + and);
        // int result = xor ^ and;
        // System.out.println("XOR [xor ^ and]:" + result);
        // return result;
        // System.out.println("a: "+a + " b: " + b);
        if (a ==0 || b == 0) return a | b;
        return getSum(a^b, (a&b)<<1);
    }

}

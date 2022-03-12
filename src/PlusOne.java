public class PlusOne {
    public int[] plusOne(int[] digits) {
        int rem = 1;
        for (int i = digits.length - 1; i >=0; i--) {
            rem += digits[i];
            digits[i] = rem % 10;
            rem /= 10;
        }
        if (rem > 0)    {
            int [] new_digits = new int[digits.length + 1];
            new_digits[0] = rem;
            for (int i = 0; i < digits.length; i++) {
                new_digits[i + 1] = digits[i];
            }
            return new_digits;
        } else {
            return digits;
        }
    }
}

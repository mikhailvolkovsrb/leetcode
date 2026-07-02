package SlidingWindow;

/**
 * Example 2: You are given a binary string s (a string containing only "0" and "1").
 * You may choose up to one "0" and flip it to a "1".
 * What is the length of the longest substring achievable that contains only "1"?
 * For example, given s = " 1 1 0 1 1 0 0 1 1 1", the answer is 5.
 * If you perform the flip at index 2, the string becomes 1111100111.
 */
public class Example02 {
    public static void main(String[] args) {
        System.out.println(longest(new int[]{1, 1, 0, 1, 1, 0, 0, 1, 1, 1}));
    }

    static int longest(int[] arr) {
        int l = 0;
        int r = 0;
        int zeroCount = 0;
        int maxLength = 0;

        for (r = 0; r < arr.length; r++) {
            if (arr[r] == 0) {
                zeroCount++;
            }
            while (zeroCount >= 2) {
                if (arr[l] == 0) {
                    zeroCount--;
                }
                l++;
            }
            maxLength = Math.max(maxLength, r - l + 1);
        }
        return maxLength;
    }
}
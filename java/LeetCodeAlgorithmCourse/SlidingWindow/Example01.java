package SlidingWindow;

/**
 * Example 1: Given an array of positive integers nums and an integer k,
 * find the length of the longest subarray whose sum is less than or equal to k.
 * Let's look at an example where nums = [3, 1, 2, 7, 4, 2, 1, 1, 5] and k = 8.
 * The longest subarray we found was [4, 2, 1, 1] which means the answer is 4
 * */

public class Example01 {

    public static void main(String[] args) {
        int [] nums = new int[]{3, 1, 2, 7, 4, 2, 1, 1, 5};
        System.out.println(findLength(nums, 8));

    }
    static int findLength(int[] nums, int k) {
        int result = 0;
        int currentLength = 0;
        int sum = 0;
        int l = 0;

        for (int r = 0; r < nums.length; r++) {
            sum += nums[r];
            if (sum > k) {
                while (sum > k) {
                    sum = sum - nums[l++];
                }
            }

            currentLength = r - l + 1;
            result = Math.max(result, currentLength);
        }

        return currentLength;
    }

}

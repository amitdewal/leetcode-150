/**
 * 
 */
package com.array.maximumConsecutiveOnes;

/**
 * Given a binary array nums, return the maximum number of consecutive 1s in the
 * array.
 * 
 * A binary array is an array that contains only 0s and 1s.
 * 
 * Example 1: Input: nums = [1, 1, 0, 0, 1, 1, 1, 0]
 * 
 * Output: 3
 * 
 * Explanation:
 * 
 * The maximum consecutive 1s are present from index 4 to index 6, amounting to
 * 3 1s
 * 
 * Example 2: Input: nums = [0, 0, 0, 0, 0, 0, 0, 0]
 * 
 * Output: 0
 * 
 * Explanation:
 * 
 * No 1s are present in nums, thus we return 0
 */
public class Main {
	public static void main(String[] args) {

		Main main = new Main();
		int nums[] = { 1, 1, 0, 0, 1, 1, 1, 0 };
		System.out.println(main.findMaxConsecutiveOnes(nums));

		int nums1[] = { 0, 0, 0, 0, 0, 0, 0, 0 };
		System.out.println(main.findMaxConsecutiveOnes(nums1));
	}

	public int findMaxConsecutiveOnes(int[] nums) {

		int count = 0;
		int maxCount = 0;

		for (int i = 0; i < nums.length; i++) {

			if (nums[i] == 1) {
				count++;
				maxCount = Math.max(maxCount, count);
			} else {
				count = 0;// reset the count;
			}
		}

		return maxCount;

	}

}

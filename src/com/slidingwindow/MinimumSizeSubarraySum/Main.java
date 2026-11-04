/**
 * 
 */
package com.slidingwindow.MinimumSizeSubarraySum;

/**
 * 
 */
public class Main {
	public static void main(String[] args) {
		
		int[] nums = { 2, 3, 1, 2, 4, 3 };
		int target = 7;

		Main main = new Main();
		int result = main.minSubArrayLen(target, nums);
		System.out.println(result);

	}

	public int minSubArrayLen(int target, int[] nums) {
		int sum = 0;
		int left = 0;
		int minLength = Integer.MAX_VALUE;

		for (int right = 0; right < nums.length; right++) {

			// expand the window
			sum = sum + nums[right];

			// shrink window while sum >= target
			while (sum >= target) {

				minLength = Math.min(minLength, right - left + 1); // update length

				// remove leftmost element
				sum = sum - nums[left];
				left++;
			}

		}

		return minLength == Integer.MAX_VALUE ? 0 : minLength;

	}
}

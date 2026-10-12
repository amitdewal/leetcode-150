/**
 * 
 */
package com.arraystring.JumpGame;

/**
 * 
 */
public class Main {

	public static void main(String[] args) {
		int nums[] = { 2, 3, 1, 1, 4 };

		boolean result = canJump(nums);
		System.out.println(result);
	}

	public static boolean canJump(int[] nums) {

		int maxJump = 0;

		for (int i = 0; i < nums.length; i++) {

			if (i > maxJump) { // means maxJump cant reach the current index
				return false;
			}

			maxJump = Math.max(maxJump, i + nums[i]);
		}

		return true;

	}
}

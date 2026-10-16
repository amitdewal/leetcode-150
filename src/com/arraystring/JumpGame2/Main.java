/**
 * 
 */
package com.arraystring.JumpGame2;

/**
 * 
 */
public class Main {

	public static void main(String[] args) {
		int nums[] = { 2, 3, 1, 1, 4 };
		System.out.println(jump(nums));
	}

	public static int jump(int[] nums) {

		int maxReach = 0;
		int currReach = 0;
		int jump = 0;
		int destination = nums.length - 1;

		// base case
		if (nums.length == 1) { // array one element so zero jumps;
			return 0;
		}

		for (int i = 0; i < nums.length; i++) {

			maxReach = Math.max(maxReach, i + nums[i]);

			//
			if (i == currReach) {
				
				currReach = maxReach;
				jump++;
				

			}

			if (currReach >= destination) {
				return jump;
			}
		}
		return jump;

	}

}

package com.arraystring.RemoveDuplicatesfromSortedArrayII;

public class Main {
	public static void main(String[] args) {
		int[] nums = { 1, 1, 1, 2, 2, 3 };
		System.out.println(removeDuplicates(nums));

	}

	/**
	 * @param nums
	 * @return
	 */
	public static int removeDuplicates(int[] nums) {
		int l = 2;

		for (int r = 2; r < nums.length; r++) {

			if (nums[r] != nums[l - 2]) {
				nums[l] = nums[r];
				l++;
			}
		}
		return l;
	}

}

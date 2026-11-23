/**
 * 
 */
package com.hashMap.twoSum;

import java.util.HashMap;

/**
 * 
 */
public class Main {

	public static void main(String[] args) {
		
		
		int[] nums = { 2, 7, 11, 15 };
		int target = 9;

		Main main = new Main();
		int[] result = main.twoSum(nums, target);

		System.out.println("Indices: " + result[0] + ", " + result[1]);
     
	}

	public int[] twoSum(int[] nums, int target) {

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>(); // key as number , values index

		for (int i = 0; i < nums.length; i++) {

			int needed = target - nums[i];

			if (map.containsKey(needed)) {

				return new int[] { map.get(needed), i };
			}
			// store
			map.put(nums[i], i);
		}

		return new int[] {};

	}
}

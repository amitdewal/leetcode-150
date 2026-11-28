/**
 * 
 */
package com.hashing.sumofHighestandLowestFrequency;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of n integers, find the sum of the frequencies of the highest
 * occurring number and lowest occurring number.
 * 
 * Example 1: Input: arr = [1, 2, 2, 3, 3, 3]
 * 
 * Output: 4
 * 
 * Explanation: The highest frequency is 3 (element 3), and the lowest frequency
 * is 1 (element 1). Their sum is 3 + 1 = 4.
 * 
 * Example 2: Input: arr = [4, 4, 5, 5, 6]
 * 
 * Output: 3
 * 
 * Explanation: The highest frequency is 2 (elements 4 and 5), and the lowest
 * frequency is 1 (element 6). Their sum is 2 + 1 = 3.
 */
public class Main {

	public static void main(String[] args) {
		
		int[] nums = { 1, 2, 2, 3, 3, 3, 4, 4, 4, 4 };

		Main main = new Main();
		int result = main.sumHighestAndLowestFrequency(nums);
		System.out.println("Sum of highest and lowest frequency: " + result);

	}

	public int sumHighestAndLowestFrequency(int[] nums) {

		Map<Integer, Integer> map = new HashMap<>(); // key as number , value as frequency

		for (int i = 0; i < nums.length; i++) {
			map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
		}

		int maxFreq = 0;
		int minFreq = Integer.MAX_VALUE;
		for (Map.Entry<Integer, Integer> freq : map.entrySet()) {

			Integer currFreq = freq.getValue();

			if (currFreq > maxFreq) {
				maxFreq = currFreq;

			}
			if (currFreq < minFreq) {
				minFreq = currFreq;
			}

		}

		return maxFreq + minFreq;

	}
}

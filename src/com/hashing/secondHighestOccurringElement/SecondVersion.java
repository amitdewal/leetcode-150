/**
 * 
 */
package com.hashing.secondHighestOccurringElement;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 */
public class SecondVersion {
	
	public static void main(String[] args) {
		
		int[] nums = { 1, 2, 2, 3, 3, 3, 4, 4, 4, 4 };

		SecondVersion secondVersion = new SecondVersion();
		int result = secondVersion.secondMostFrequentElement(nums);
		System.out.println("Second most frequent element: " + result);
	}

	public int secondMostFrequentElement(int[] nums) {
		
		

		//
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < nums.length; i++) {
			map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
		}

		// find maxFreq and secondMaxFreq

		int maxFreq = 0;
		int secondMaxFreq = 0;

		for (int freq : map.values()) {

			if (freq > maxFreq) {
				secondMaxFreq = maxFreq;
				maxFreq = freq;
			} else if (freq > secondMaxFreq && freq < maxFreq) {
				secondMaxFreq = freq;
			}
		}

		int result = Integer.MAX_VALUE;

		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

			if (entry.getValue() == secondMaxFreq) {
				result = Math.min(secondMaxFreq, result);

			}

		}

		return result;

	}

}

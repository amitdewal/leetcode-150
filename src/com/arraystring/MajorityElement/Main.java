/**
 * 
 */
package com.arraystring.MajorityElement;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 */
public class Main {

	// hashmap way
	public static int majorityElement(int[] nums) {
		int n = nums.length;

		Map<Integer, Integer> map = new HashMap<>();
		int ans = -1;

		for (int i = 0; i < nums.length; i++) {

			if (map.containsKey(nums[i])) {

				map.put(nums[i], map.get(nums[i]) + 1);

			} else {
				map.put(nums[i], 1);
			}

			// check the final
			if (map.get(nums[i]) > n / 2) {
				ans = nums[i];
			}
		}

		return ans;

	}

	public static int majorityElementMorre(int[] nums) {
//		Code ko logic se match karo

//		count == 0 hone par current number ko candidate bana do. Yeh rule 1 hai.
//		Uske baad num == candidate ho toh count++, warna count--. Yeh rule 2 aur 3 hain.
//		Note: jab naya candidate banta hai, tab num == candidate automatically true hota hai, isliye count 0 se 1 ho jaata hai. Alag se count = 1 likhne ki zaroorat nahi.
		int candidate = 0;
		int count = 0;
//		int[] nums = { 2, 2, 1, 1, 1, 2, 2 };
		for (int i : nums) {

			if (count == 0) {
				candidate = i; // naya candidate

			}
			if (i == candidate) {
				count++; // same mila, jodo

			} else {
				count--; // alag mila, kato
			}

		}
		return candidate;

	}

	public static void main(String[] args) {
		int[] nums = { 2, 2, 1, 1, 1, 2, 2 };
		System.out.println(majorityElement(nums));
		System.out.println(majorityElementMorre(nums));

	}

}

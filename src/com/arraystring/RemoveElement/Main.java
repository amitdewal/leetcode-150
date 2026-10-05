/**
 * 
 */
package com.arraystring.RemoveElement;

/**
 * 
 */
public class Main {

	public static void main(String[] args) {
		int[] nums = { 3, 2, 2, 3 };
		int val = 3;
		int result = removeElement(nums, val);
		System.out.println(result);
	}

	public static int removeElement(int[] nums, int val) {
		
		int k =0; //keep at this location
		int start = 0; // moving pointer
		
		while(start < nums.length) {//0,1,2,3
			 
			if(nums[start] == val ) {
				start++;
				continue;
			}else {
				nums[k]= nums[start];
				k++;
				start++;
			}
		}
		return k;
		

	}
}

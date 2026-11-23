/**
 * 
 */
package com.hashMap.happyNumber;

import java.util.HashSet;

/**
 * 
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Main main = new Main();
		int n = 19;
		System.out.println(main.isHappy(n));

	}
	
	  public boolean isHappy(int n) {
		  
		  HashSet<Integer> seen = new HashSet<Integer>();
		  
		  while(n != 1) {
			  
			  if (seen.contains(n)) {
				  return false;
				
			}
			  seen.add(n);
			  
			  int sum = 0;
			  while(n > 0) {
				  
				  int digit = n % 10; //extract last digit
				  sum+= digit * digit; 
				  n = n /10; //remove the last digit
			  }
			  n = sum ; // for next iteration;
		  }
		return true;
		  
	  }

}

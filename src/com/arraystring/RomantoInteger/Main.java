/**
 * 
 */
package com.arraystring.RomantoInteger;

import java.util.Map;

/**
 * 
 */
public class Main {

	public static void main(String[] args) {
		
		String s = "MCMXCIV";
		int result = romanToInt(s);
		System.out.println(result); // Output: 1994
	}
	
	public static int romanToInt(String s) {

	Map<Character, Integer> romanMap = Map.of('I', 1, 'V', 5, 'X', 10, 'L', 50, 'C', 100, 'D', 500, 'M', 1000);

	int result = 0;

	for (int i = 0; i < s.length(); i++) {

		if (i + 1 < s.length() && romanMap.get(s.charAt(i)) < romanMap.get(s.charAt(i + 1))) {

			result = result - romanMap.get(s.charAt(i));

		} else {
			result = result + romanMap.get(s.charAt(i));
		}

	}
	return result;

}
}

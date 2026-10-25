/**
 * 
 */
package com.arraystring.LongestCommonPrefix;

/**
 * 
 */
public class Main {
	public static void main(String[] args) {
		
		String[] strs = { "flower", "flow", "flight" };
		Main main = new Main();
		String result = main.longestCommonPrefix(strs);
		System.out.println(result);

	}

	public String longestCommonPrefix(String[] strs) {

		if (strs == null || strs.length == 0) {
			return "";
		}
		String first = strs[0];// pick the first word
		for (int i = 0; i < first.length(); i++) {
			char current = first.charAt(i);// pick the character from that index wheater 0,1,2 or so on

			for (int j = 1; j < strs.length; j++) { // this loop for words in arrays starting from 1

				if (i >= strs[j].length() || strs[j].charAt(i) != current) {
					return first.substring(0, i);
				}
			}
		}
		return first;

	}
}

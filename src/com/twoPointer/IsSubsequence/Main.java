/**
 * 
 */
package com.twoPointer.IsSubsequence;

/**
 * 
 */
public class Main {
	public static void main(String[] args) {
		
		Main main = new Main();
		String s = "abc";
		String t = "ahbgdc";
		System.out.println(main.isSubsequence(s, t));
		

	}

	public boolean isSubsequence(String s, String t) {
		int i = 0;
		int j = 0;

		while (i < s.length() && j < t.length()) {

			if (s.charAt(i) == t.charAt(j)) {
				i++;
			}
			j++;
		}

		return i == s.length();

	}

}

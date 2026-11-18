/**
 * 
 */
package com.hashMap.isomorphicStrings;

import java.util.*;

/**
 * 
 */
public class Main {
	public static void main(String[] args) {
		
		Main main = new Main();
		String s = "egg";
		String t = "add";
		System.out.println(main.isIsomorphic(s, t));

	}

	public boolean isIsomorphic(String s, String t) {

		// firsrt check length if not equal return false

		if (s.length() != t.length()) {
			return false;
		}

		Map<Character, Character> map1 = new HashMap<>();
		Map<Character, Character> map2 = new HashMap<>();

		for (int i = 0; i < s.length(); i++) {

			char ch1 = s.charAt(i);
			char ch2 = t.charAt(i);
			if (map1.containsKey(ch1)) {

				if (map1.get(ch1) != ch2) {
					return false;
				}

			} else {
				map1.put(ch1, ch2);
			}

			if (map2.containsKey(ch2)) {
				if (map2.get(ch2) != ch1) {
					return false;
				}
			} else {

				map2.put(ch2, ch1);
			}

		}
		return true;

	}
}

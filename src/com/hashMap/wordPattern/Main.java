/**
 * 
 */
package com.hashMap.wordPattern;

import java.util.HashMap;
import java.util.Iterator;

/**
 * 
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Main main = new Main();
		String pattern = "abba";
		String s = "dog cat cat dog";
		System.out.println(main.wordPattern(pattern, s));// output is true

	}

	public boolean wordPattern(String pattern, String s) {
		String[] words = s.split(" ");
		if (words.length != pattern.length()) {
			return false;

		}

		HashMap<Character, String> map1 = new HashMap<>();
		HashMap<String, Character> map2 = new HashMap<>();

		for (int i = 0; i < pattern.length(); i++) {
			char ch = pattern.charAt(i);
			String word = words[i];
			if (map1.containsKey(ch)) {

				if (!map1.get(ch).equals(word)) {
					return false;
				}

			} else {
				map1.put(ch, word);
			}

			if (map2.containsKey(word)) {

				if (map2.get(word) != ch) {
					return false;
				}
			} else {
				map2.put(word, ch);
			}
		}

		return true;

	}

}

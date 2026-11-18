/**
 * 
 */
package com.hashMap.ransomNote;

import java.util.HashMap;

/**
 * 
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Main main = new Main();
		String ransomNote = "aa";
		String magazine = "aab";
		System.out.println(main.canConstruct(ransomNote, magazine));

	}

	public boolean canConstruct(String ransomNote, String magazine) {

		// first frequency map prepare from magazine

		HashMap<Character, Integer> map = new HashMap<Character, Integer>();

		for (char ch : magazine.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0) + 1);

		}

		// check the required char from randonnote

		for (char ch : ransomNote.toCharArray()) {

			if (!map.containsKey(ch) || map.get(ch) == 0) {
				return false;
			}

			map.put(ch, map.get(ch) - 1);// reduce freqeuncy becuse we consume it
		}
		return true;

	}
}

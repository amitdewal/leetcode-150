/**
 * 
 */
package com.hashMap.groupAnagrams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 
 */
public class Main {

	public static void main(String[] args) {
		
		String[] strs = { "eat", "tea", "tan", "ate", "nat", "bat" };

		Main main = new Main();

		List<List<String>> result = main.groupAnagrams(strs);

		System.out.println(result);

	}

	public List<List<String>> groupAnagrams(String[] strs) {

		Map<String, List<String>> map = new HashMap<>();

		for (String word : strs) {

			// make char array
			char[] ch = word.toCharArray();

			// sort the array
			Arrays.sort(ch);

			// make the key
			String key = new String(ch);

			if (!map.containsKey(key)) {

				map.put(key, new ArrayList<>());
			}
			map.get(key).add(word);

		}
		return new ArrayList<>(map.values());

	}
}

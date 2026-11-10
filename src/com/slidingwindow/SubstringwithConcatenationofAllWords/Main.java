/**
 * 
 */
package com.slidingwindow.SubstringwithConcatenationofAllWords;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * 
 */
public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		String s = "barfoothefoobarman";
		String[] words = { "foo", "bar" };
		List<Integer> result = main.findSubstring(s, words);
		System.out.println(result); // Output: [0, 9]

	}

	public List<Integer> findSubstring(String s, String[] words) {
		List<Integer> result = new ArrayList<>();

		if (s == null || words == null || words.length == 0) {
			return result;// empty list;
		}

		int wordLength = words[0].length();
		int totalWords = words.length;
		int windowSize = wordLength * totalWords;

		if (s.length() < windowSize) {
			return result; // empty list
		}

		HashMap<String, Integer> wordCount = new HashMap<String, Integer>();

		for (String word : words) {

			wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);

		}

		for (int offset = 0; offset < wordLength; offset++) {

			int left = offset;
			int right = offset;
			HashMap<String, Integer> seen = new HashMap<String, Integer>();

			while (right + wordLength <= s.length()) {

				String word = s.substring(right, right + wordLength);

				right = right + wordLength;

				// invalid word
				if (!wordCount.containsKey(word)) {
					seen.clear();
					left = right;
					continue;
				}

				// add word to current window

				seen.put(word, seen.getOrDefault(word, 0) + 1);

//				Shrink if frequency exceeds required

				while (seen.get(word) > wordCount.get(word)) {
					String leftWord = s.substring(left, left + wordLength);

					seen.put(leftWord, seen.get(leftWord) - 1);

					left = left + wordLength;
				}

				if ((right - left) / wordLength == totalWords) {
					result.add(left);

				}

			}

		}
		return result;

	}
}

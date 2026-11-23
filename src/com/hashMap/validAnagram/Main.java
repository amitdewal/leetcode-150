/**
 * 
 */
package com.hashMap.validAnagram;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 */
public class Main {
	
	public static void main(String[] args) {
		
		Main main = new Main();
		System.out.println(main.isAnagram("anagram", "nagaram"));
		System.out.println(main.isAnagram("rat", "car"));
	}
	public boolean isAnagram(String s, String t) {
		
		

        // first length check
        if(s.length() != t.length()){
            return false;
        }

        // create map to count frequency of first string

        Map<Character,Integer> map = new HashMap<>();

        for(char ch : s.toCharArray()){

            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        // check the char of second string if found then decrease the frequcny in map

        for(char ch : t.toCharArray()){

            if(!map.containsKey(ch)){
                return false; // if ch in not in the map means no anagram
            }

            map.put(ch,map.get(ch)-1);
        }

        // check frequrency

        for(int count : map.values()){

            if(count !=0){
                return false; // means there still freqeuncy of ch in map, whihc means no anagram

            }
        }
        return true;
    }
}

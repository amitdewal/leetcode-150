/**
 * 
 */
package com.arraystring.InsertDeleteGetRandom;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

/**
 * 
 */
public class Main {

}

class RandomizedSet {

	private Map<Integer, Integer> map = new HashMap<>();
	private List<Integer> list = new ArrayList<>();
	private Random random = new Random();

	public RandomizedSet() {

	}

	public boolean insert(int val) {
		// first check in the map

		if (map.containsKey(val)) { // map val-index
			return false;
		}

		// store in the map
		map.put(val, list.size());// list.size() give use index where the valurs is going to store in the list

		// add value at the end of list

		list.add(val);

		return true;

	}

	public boolean remove(int val) {
		if (!map.containsKey(val)) {
			return false; // if val is not in the map no need to remove
		}
		Integer index = map.get(val);// this val index value, this is going to be remove
		// get the last index and last index element
		int lastIndex = list.size() - 1;
		Integer lastValue = list.get(lastIndex);

		// now move the last index value to the index where the actualy value need to
		// remove

		list.set(index, lastValue);

		map.put(lastValue, index);

		// rewmove the last elemt
		list.remove(lastIndex);
		map.remove(val);
		return true;

	}

	public int getRandom() {
		int index = random.nextInt(list.size());

		return list.get(index);

	}
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet(); boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val); int param_3 = obj.getRandom();
 */

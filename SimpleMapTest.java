package com.cts.dsa.util.maps.sets;

import java.util.Iterator;

public class SimpleMapTest {
	public static void main(String[] args) {
		SimpleMap<Integer, String> map = new SimpleMap<Integer, String>();
		map.put(12, "Dilip");
		map.put(5, "Raj");
		map.put(15, "Kiran");
		Iterator<MapEntry<Integer, String>> iterator = map.entrySet();
		while(iterator.hasNext()) {
			MapEntry entry = iterator.next();
			System.out.println(entry.getKey() + " -> " + entry.getValue());
		}
	}
}
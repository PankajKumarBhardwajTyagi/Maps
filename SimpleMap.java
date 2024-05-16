package com.cts.dsa.util.maps.sets;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

public class SimpleMap<K, V> implements Map<K, V> {
	private ArrayList<MapEntry<K, V>> table = new ArrayList<MapEntry<K,V>>();

	@Override public int size() { return table.size(); }

	@Override public boolean isEmpty() { return table.isEmpty(); }

	@Override public V get(K key) { return null; }

	private int findIndex(K key) {
		for(int index = 0; index < size(); ++index) if(table.get(index).getKey().equals(key)) return index;
		return -1;
	}
	
	// [(1, Dilip), (2, Kiran), (3, Raj), (4, Rahul)]
	// (4, Rahul)
	@Override public V put(K key, V value) { 
		int index = findIndex(key); // -1										
		if(index == -1) table.add(new MapEntry<K, V>(key, value)); else table.get(index).setValue(value);
		return value;
	}

	@Override public V remove(K key) { 
		int index = findIndex(key);
		if(index == -1) throw new RuntimeException(key + " not found");
		V value = table.get(index).getValue();
		table.remove(index); // has algorithm
		return value;
	}

	@Override public Iterable<K> keySet() { return null; }

	@Override public Iterable<V> values() { return null; }

	@Override public Iterator<MapEntry<K, V>> entrySet() { return table.iterator(); }

}
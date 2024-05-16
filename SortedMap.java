package com.cts.dsa.util.maps.sets;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

public class SortedMap<K, V> {
	private List<MapEntry<K, V>> list = new ArrayList<MapEntry<K,V>>();

	public SortedMap() {}
	
	public int size() { return list.size(); }
	public boolean isEmpty() { return list.size() == 0; }
	
	private int findIndex(K key) {
		for(int index = 0; index < size(); ++index) if(list.get(index).getKey().equals(key)) return index;
		return -1;
	}
	
	public V get(K key) { 
		int index = findIndex(key);
		return index == -1 ? null : list.get(index).getValue();
	}
	
	public V put(K key, V value) {
		int index = findIndex(key);
		if(index == -1) {
			boolean found = false;
			for(MapEntry<K, V> entry : list) {
				K existingKey = entry.getKey();
				if(existingKey instanceof Number) {
					if((Integer) key < (Integer) existingKey) {
						list.add(list.indexOf(entry), new MapEntry<>(key, value));
						found = true;
						break;
					}
				}
				if(existingKey instanceof String) {
					if(((String) key).compareTo((String) existingKey) < 0) {
						list.add(list.indexOf(entry), new MapEntry(key, value));
						found = true;
						break;
					}
				}
			}
			if(!found) list.add(new MapEntry<>(key, value));
			return value;
		}
		return list.get(index).setValue(value);
	}
	
	public V remove(K key) {
		int index = findIndex(key);
		if(index == -1) return null;
		V value = list.get(index).getValue();
		list.remove(index);
		return value;
	}
	
	public Iterator<Entry<K, V>> iterator() {
		return new Iterator<Entry<K, V>>() {
			private int index = 0;
			@Override public boolean hasNext() { return index < list.size(); }
			@Override public Entry<K, V> next() { return list.get(index++); }
		};
	}
}
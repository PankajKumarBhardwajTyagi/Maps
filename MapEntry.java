package com.cts.dsa.util.maps.sets;

import java.util.Map.Entry;

public class MapEntry<K, V> implements Entry<K, V>{
	private K key;
	private V value;
	
	public MapEntry(K key, V value) {
		this.key = key;
		this.value = value;
	}

	@Override public K getKey() { return key; }
	@Override public V getValue() { return value; }

	// public void setKey(K key) { this.key = key; } : Not Recommended coz key is Unique & should not be allowed to Modify
	@Override public V setValue(V value) { 
		this.value = value;
		return value;
	}

}
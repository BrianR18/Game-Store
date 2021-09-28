package model;

public class HashTableNode<K,V>{
	private K key;
	private V value;
	private HashTableNode<K,V> next;
	private HashTableNode<K,V> prev;
	
	public HashTableNode(K key, V value){
		this.key = key;
		this.value = value;
	}//End constructor HashTableNode
	
	public K getKey() {
		return key;
	}

	public void setKey(K key) {
		this.key = key;
	}

	public V getValue() {
		return value;
	}

	public void setValue(V value) {
		this.value = value;
	}

	public HashTableNode<K, V> getNext() {
		return next;
	}

	public void setNext(K key, V value) {
		this.next = new HashTableNode<K,V>(key,value);
	}

	public HashTableNode<K, V> getPrev() {
		return prev;
	}

	public void setPrev(K key, V value) {
		this.prev = new HashTableNode<K,V>(key,value);
	}
	
	
	
}//End HashTableNode

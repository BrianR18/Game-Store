package Collections;

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

	public void setNext(HashTableNode<K,V> next) {
		this.next = next;
	}

	public HashTableNode<K, V> getPrev() {
		return prev;
	}

	public void setPrev(HashTableNode<K,V> prev) {
		this.prev = prev;
	}
	
}//End HashTableNode

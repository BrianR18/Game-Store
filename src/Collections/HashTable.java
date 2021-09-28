package Collections;
import java.util.Arrays;

public class HashTable<K,V> implements IHashTable<K,V>{
	private final int ARR_SIZE = 307;
	private HashTableNode<K,V>[] nodes;

	@SuppressWarnings("unchecked")
	public HashTable(){
		nodes = new HashTableNode[ARR_SIZE];
		Arrays.fill(nodes,null);
	}//End HashTable

	@Override
	public void insert(K key, V value) {
		int hCode = hashFunction(key);
		HashTableNode<K,V> toAdd = new HashTableNode<K,V>(key,value);
		if(nodes[hCode] == null){
			nodes[hCode] = new HashTableNode<K,V>(key,value);
		}else{
			insert(nodes[hCode],toAdd);
		}
	}//End insert
	
	private void insert(HashTableNode<K,V> current,HashTableNode<K,V> toAdd){
		if(current.getNext() == null){
			current.setNext(toAdd);
			toAdd.setPrev(current);
		}else
			insert(current.getNext(),toAdd);
	}//End insert
	
	@Override
	public V search(K key) {
		int hCode = hashFunction(key);
		V toReturn = null;
		if(nodes[hCode] != null ) {
			if( nodes[hCode].getNext() == null)
				toReturn = nodes[hCode].getValue();
			else
				toReturn = search(nodes[hCode],key);
		}
		return toReturn;
	}//End search

	private V search(HashTableNode<K,V> current,K key){
		if(current.getKey() == key){
			return current.getValue(); 
		}else if(current.getNext() != null)
			return search(current.getNext(),key);
		else
			return null;
	}//End search
	
	@Override
	public boolean delete(K key) {
		int hCode = hashFunction(key);
		boolean delete = false;
		if(nodes[hCode] != null && nodes[hCode].getKey() == key){
			nodes[hCode] = nodes[hCode].getNext();
			if(nodes[hCode] != null){
				nodes[hCode].getPrev().setNext(null);
				nodes[hCode].setPrev(null);
			}//End if
			delete = true;
		}else if(nodes[hCode] != null){
			delete = delete(nodes[hCode].getNext(),key);
			}//End else	
		return delete;
	}//End delete
	
	private boolean delete(HashTableNode<K,V> current,K key){
		if(current.getKey() == key){
			HashTableNode<K,V> next = current.getNext();
			HashTableNode<K,V> prev = current.getPrev();
			if(next != null){
				prev.setNext(next);
				next.setPrev(prev);
			}else
				prev.setNext(null);
			current.setNext(null);
			current.setPrev(null);
			return true;
		}else if(current.getNext() != null)
			return delete(current.getNext(),key);
		else
			return false;
	}//End delete
	
	private int hashFunction(K key){
		return (key.hashCode() < 0? key.hashCode()*-1:key.hashCode()) % ARR_SIZE;
	}//End hashFunction

	@Override
	public String[] getKeys() {
		String keys = new String();
		for(int i = 0; i < ARR_SIZE;i++) {
			if(nodes[i] != null){
				keys += String.valueOf(nodes[i].getKey()) + " ";
				if(nodes[i].getNext() != null){
					keys += getKeys(nodes[i]);
				}//End if
			}//End if
		}//End for
		return keys.split(" ");
	}//End getKeys
	
	private String getKeys(HashTableNode<K,V> current){
		String key = new String();
		if(current.getNext()!=null){
			key = String.valueOf(current.getNext().getKey()) + " " + getKeys(current.getNext()); 
		}//End if
		return key;
	}//End getKeys
}

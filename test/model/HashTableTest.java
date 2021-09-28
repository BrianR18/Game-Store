package model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HashTableTest {

	public <K,V> HashTable <K,V> setupStage1(){
		HashTable<K,V> hashTable = new HashTable<>();
		return hashTable;
	}
	
	@Test
	public void testSearch() {
		String key = "K1";
		int value = 800;
		String key2 = "K2";
		int value2 = 900;
		String key3 = "K3";
		
		HashTable<String,Integer> hashTable = setupStage1();
		hashTable.insert(key, value);
		hashTable.insert(key2, value2);
		
		assertEquals(800, hashTable.search(key));
		assertNotNull(hashTable.search(key2));
		assertEquals(900, hashTable.search(key2));
		assertEquals(null,hashTable.search(key3));
	}
	
	
	@Test
	public void testInsert() {
		String key = "K1";
		int value = 800;
		String key2 = "K2";
		int value2 = 900;
		
		HashTable<String,Integer> hashTable = setupStage1();
		hashTable.insert(key, value);
		hashTable.insert(key2, value2);

		assertNotEquals(null, hashTable);
		assertNotNull(hashTable.search(key));
		assertEquals(800, hashTable.search(key));
		assertNotNull(hashTable.search(key2));
		assertEquals(900, hashTable.search(key2));
	}
	
	@Test
	public void testDelete() {
		String key = "K1";
		int value = 800;
		String key2 = "K2";
		int value2 = 900;
		
		HashTable<String,Integer> hashTable = setupStage1();
		hashTable.insert(key, value);
		hashTable.insert(key2, value2);
		
		assertEquals(true, hashTable.delete(key2));
		assertEquals(null,  hashTable.search(key2));
		assertEquals(false, hashTable.delete(key2));
		assertEquals(true, hashTable.delete(key));
		assertEquals(null,  hashTable.search(key));
		assertEquals(false, hashTable.delete(key));
		
	}
	
}

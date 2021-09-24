package model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class QueueTest {
	
	public void setupStage1() {
		
	}

	@Test
	<T> void testIsEmpty() {
		Queue<T> queue = new Queue<>();
		assertNotNull(queue.isEmpty());
	}
	
	@Test
	void testEnqueue() {
		String node = "Hi";
		String node2 = "Hiii";
		Queue<String> queue = new Queue<>();
		
		queue.enqueue(node);
		queue.enqueue(node2);
		
		assertNotNull(queue.isEmpty());
	}
	
	@Test
	 void testFront() {
		
		String node = "Hi";
		String node2 = "Hiii";
		Queue<String> queue = new Queue<>();
		
		queue.enqueue(node);
		queue.enqueue(node2);
		assertEquals(node, queue.front());
		assertNotEquals(node2, queue.front());
	}
	
	@Test
	void testDequeue() {
		
		String node = "Hi1";
		String node2 = "Hiii2";
		String node3 = "Hiiiiii3";
		Queue<String> queue = new Queue<>();
		
		queue.enqueue(node);
		queue.enqueue(node2);
		queue.enqueue(node3);
		
		String deletedString = queue.dequeue();
		
		assertEquals(node2, queue.front());
		assertNotEquals(node, queue.front());
		assertNotNull(deletedString);
	}
	
	
	

}

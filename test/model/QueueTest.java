package model;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import Collections.Queue;

class QueueTest {
	
	public <T> Queue<T> setupScenary1() {
        Queue<T> queue = new Queue<>();
        return queue;
    }

	@Test
	public void testIsEmpty() {
		boolean test = setupScenary1().isEmpty();
		assertEquals(true, test);;
	}
	
	@Test
	public void testEnqueue() {
		ArrayList<String> wishList = new ArrayList<>();
		wishList.add("zula");
		wishList.add("mario bros");
		Customer customerToAdd = new Customer("1",wishList,"Daniel");
		Queue<Customer> testqueue = setupScenary1();
		testqueue.enqueue(customerToAdd);
		boolean test = testqueue.isEmpty();
	    assertEquals(false, test);
	}
	
	@Test
	public void testFront() {
		
		String node = "Hi";
		String node2 = "Hiii";
		Queue<String> queue = new Queue<>();
		
		queue.enqueue(node);
		queue.enqueue(node2);
		assertEquals(node, queue.front());
		assertNotEquals(node2, queue.front());
	}
	
	@Test
	public void testDequeue() {
		
		String customer1 = "c1";
		String customer2 = "c2";
		String customer3 = "c3";
		Queue<String> queue = setupScenary1();
		
		queue.enqueue(customer1);
		queue.enqueue(customer2);
		queue.enqueue(customer3);
		
		String deletedCustomer = queue.dequeue();
		
		assertEquals(customer2, queue.front());
		assertNotEquals(customer1, queue.front());
		assertNotNull(deletedCustomer);
	}
}

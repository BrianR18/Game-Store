package model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StackTest {

	public <T> Stack <T> setupStage1(){
		Stack<T> stack = new Stack<>();
		return stack;
	}
	
	@Test 
	void testTop() {
		String st1 = "A";
		Stack<String> stack = setupStage1();
		assertEquals(null, stack.top());
		stack.push(st1);
		assertEquals(st1, stack.top());
	}
	
	@Test
	void testPush() {
		String st1 = "A";
		String st2 = "B";
		String st3 = "C";
		Stack<String> stack = setupStage1();
		stack.push(st1);
		stack.push(st2);
		stack.push(st3);
		
		assertEquals(3, stack.size());
		assertEquals(st3, stack.top());
	}

	@Test 
	void testPop() {
		
		String st1 = "A";
		String st2 = "B";
		String st3 = "C";
		Stack<String> stack = setupStage1();
		stack.push(st1);
		stack.push(st2);
		stack.push(st3);
		
		assertEquals(st3, stack.pop());
		assertEquals(st2, stack.top());
		assertEquals(2, stack.size());
		
		assertEquals(st2, stack.pop());
		assertEquals(st1, stack.top());
		assertEquals(1, stack.size());
		
		assertEquals(st1, stack.pop());
		assertEquals(null, stack.top());
		assertEquals(0, stack.size());
		
	}
	
	@Test
	void isEmpty() {
		
		String st1 = "A";
		Stack<String> stack = setupStage1();
		stack.push(st1);
		
		assertNotEquals(true, stack.isEmpty());
		stack.pop();
		assertEquals(true, stack.isEmpty());
		
	}
}

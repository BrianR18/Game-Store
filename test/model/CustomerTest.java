package model;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class CustomerTest {
	
	public void setupStage1() {
		
	}

	@Test
	void testCustomer() {
		setupStage1();
		
		ArrayList<String> whisList = new ArrayList<>();
		whisList.add("Fifa21");
		whisList.add("Far Cry");
		Customer customerTest = new Customer ("1237", "Juan", 001, whisList);
		
		assertEquals("1237", customerTest.getId());
		assertEquals("Juan", customerTest.getName());
		assertEquals(001, customerTest.getSpendTime());
		assertNotNull(customerTest.getWhisList());
		assertFalse(customerTest.getWhisList().isEmpty());
		
	}
	
	@Test
	public void testSettersAndGetters() {
		
		ArrayList<String> whisList = new ArrayList<>();
		whisList.add("Fifa21");
		whisList.add("Far Cry");
		Customer customerTest = new Customer (" ", " ", 0 , whisList);
		
		customerTest.setId("1237");
		customerTest.setName("Juan");
		customerTest.setSpendTime(001);
		
		assertEquals("1237", customerTest.getId());
		assertEquals("Juan", customerTest.getName());
		assertEquals(001, customerTest.getSpendTime());
		assertNotNull(customerTest.getWhisList());
		assertFalse(customerTest.getWhisList().isEmpty());
		
	}
	
	@Test
	public void testAddElementToWishList() {
		
		Customer customerTest = new Customer();
		customerTest.addElementToWishList("Fifa21");
		customerTest.addElementToWishList("Far Cry");
		
		assertNotNull(customerTest.getWhisList());
		assertFalse(customerTest.getWhisList().isEmpty());
	}
	
	@Test 
	public void testSortWishListByInsertion() {
		
		ArrayList<String> shelfsId = new ArrayList<>();
		shelfsId.add("B");
		shelfsId.add("C");
		shelfsId.add("F");
		shelfsId.add("A");
		ArrayList<String> shelfsIdWithoutSort = new ArrayList<>();
		shelfsIdWithoutSort.add("B");
		shelfsIdWithoutSort.add("C");
		shelfsIdWithoutSort.add("F");
		shelfsIdWithoutSort.add("A");
		
		Customer customerTest = new Customer();
		
		customerTest.sortWishListByInsertion(shelfsId);
		assertNotEquals(shelfsId, shelfsIdWithoutSort);
		assertNotNull(shelfsId);
		assertFalse(shelfsId.isEmpty());
		assertEquals(shelfsId, shelfsId);
	}
	
	@Test
	public void testSortWishListBySelection() {
		ArrayList<String> testWishList = new ArrayList<>();
		testWishList.add("B -Fifa21");
		testWishList.add("A -Far Cry");
		
		Customer customerTest = new Customer();
		
		customerTest.addElementToWishList("B -Fifa21");
		customerTest.addElementToWishList("A -Far Cry");
		
		customerTest.sortWishListBySelection();
		
		assertNotNull(customerTest.getWhisList());
		assertNotEquals(testWishList, customerTest.getWhisList());
	}

}

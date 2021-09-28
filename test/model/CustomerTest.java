package model;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class CustomerTest {
	
	public Customer setupStage1() {
		Customer customer = new Customer();
		return customer;
	}
	
	public Customer setupStage1(String id, ArrayList<String> wishList, String name) {
		Customer customer = new Customer(id, wishList , name);
		return customer;
	}
	
	public Customer setupStage1(String id, String name, double spendTime, ArrayList<String> whisList) {
		Customer customer = new Customer(id, name,  spendTime, whisList);
		return customer;
	}
	

	@Test
	void testCustomer() {
		
		ArrayList<String> whisList = new ArrayList<>();
		whisList.add("Fifa21");
		whisList.add("Far Cry");
		Customer customerTest = setupStage1("1237", "Juan", 001, whisList);
		
		
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
		Customer customerTest = setupStage1 (" ", " ", 0 , whisList);
		
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
		
		Customer customerTest = setupStage1();
		customerTest.addElementToWishList("Fifa21");
		customerTest.addElementToWishList("Far Cry");
		
		assertNotNull(customerTest.getWhisList());
		assertFalse(customerTest.getWhisList().isEmpty());
	}
	
	@Test 
	public void testSortWishListByInsertion() {
		
		Shelf shelf1 = new Shelf("C");
		Shelf shelf2 = new Shelf("A");
		Shelf shelf3 = new Shelf("D");
		ArrayList<Shelf> shelfs = new ArrayList<>();
		shelfs.add(shelf1);shelfs.add(shelf2);shelfs.add(shelf3);
		ArrayList<Shelf> shelfsWithoutSort = new ArrayList<>();
		shelfsWithoutSort.add(shelf1);shelfsWithoutSort.add(shelf2);shelfsWithoutSort.add(shelf3);

		
		ArrayList<String> wishList = new ArrayList<>();
		wishList.add("Fifa21");
		wishList.add("Far Cry");
		wishList.add("Gris");
		
		
		Customer customerTest =setupStage1("1237", "Juan", 001, wishList);
		
		
		customerTest.sortWishListByInsertion(shelfs);
		assertNotNull(shelfs);
		assertFalse(shelfs.isEmpty());
		assertNotEquals(shelfs, shelfsWithoutSort);
		
	}
	
	@Test
	public void testSortWishListBySelection() {
		
		Shelf shelf1 = new Shelf("C");
		Shelf shelf2 = new Shelf("A");
		Shelf shelf3 = new Shelf("D");
		ArrayList<Shelf> shelfs = new ArrayList<>();
		shelfs.add(shelf1);shelfs.add(shelf2);shelfs.add(shelf3);
		ArrayList<Shelf> shelfsWithoutSort = new ArrayList<>();
		shelfsWithoutSort.add(shelf1);shelfsWithoutSort.add(shelf2);shelfsWithoutSort.add(shelf3);
		ArrayList<Shelf> shelfsWithSort = new ArrayList<>();
		shelfsWithSort.add(shelf2);shelfsWithSort.add(shelf1);shelfsWithSort.add(shelf3);
		
		ArrayList<String> wishList = new ArrayList<>();
		wishList.add("Fifa21");
		wishList.add("Far Cry");
		wishList.add("Gris");
		
		
		Customer customerTest =setupStage1("1237", "Juan", 001, wishList);
		
		
		customerTest.sortWishListBySelection(shelfs);
		assertNotNull(shelfs);
		assertFalse(shelfs.isEmpty());
		assertEquals(shelfs, shelfsWithSort);
		assertNotEquals(shelfs, shelfsWithoutSort);
		
	}

}

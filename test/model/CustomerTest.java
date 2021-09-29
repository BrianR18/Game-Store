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
		
		String stringA = "C";
		String stringB = "A";
		String stringC = "D";
		String[] shelfsWithSort = new String[3];
		shelfsWithSort[0] = stringA;
		shelfsWithSort[1] = stringB;
		shelfsWithSort[2] = stringC;
		String[] shelfsWithoutSort = new String[3];
		shelfsWithSort[0] = stringA;
		shelfsWithSort[1] = stringB;
		shelfsWithSort[2] = stringC;
		String[] shelfsMediumSort = new String[3];
		shelfsWithSort[0] = stringB;
		shelfsWithSort[1] = stringC;
		shelfsWithSort[2] = stringA;
		
		ArrayList<String> wishList = new ArrayList<>();
		wishList.add("Fifa21");
		wishList.add("Far Cry");
		wishList.add("Gris");
		
		
		Customer customerTest =setupStage1("1237", "Juan", 001, wishList);
		
		
		customerTest.sortWishListByInsertion(shelfsWithSort);
		assertNotNull(shelfsWithSort);
		assertNotEquals(shelfsWithSort, shelfsWithoutSort);
		assertNotEquals(shelfsMediumSort, shelfsWithSort);
		
	}
	
	@Test
	public void testSortWishListBySelection() {

		String stringA = "C";
		String stringB = "A";
		String stringC = "D";
		String[] shelfsWithSort = new String[3];
		shelfsWithSort[0] = stringA;
		shelfsWithSort[1] = stringB;
		shelfsWithSort[2] = stringC;
		String[] shelfsWithoutSort = new String[3];
		shelfsWithSort[0] = stringA;
		shelfsWithSort[1] = stringB;
		shelfsWithSort[2] = stringC;
		String[] shelfsMediumSort = new String[3];
		shelfsWithSort[0] = stringB;
		shelfsWithSort[1] = stringC;
		shelfsWithSort[2] = stringA;
		
		ArrayList<String> wishList = new ArrayList<>();
		wishList.add("Fifa21");
		wishList.add("Far Cry");
		wishList.add("Gris");
		
		
		Customer customerTest =setupStage1("1237", "Juan", 001, wishList);
		
		
		customerTest.sortWishListByInsertion(shelfsWithSort);
		assertNotNull(shelfsWithSort);
		assertNotEquals(shelfsWithSort, shelfsWithoutSort);
		assertNotEquals(shelfsMediumSort, shelfsWithSort);
		
	}

}

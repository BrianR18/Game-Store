package model;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class GameStoreTest {

	public GameStore setupStage1() {
		GameStore gameStore = new GameStore();
		return gameStore;
	}
	
	@Test
	public void testAddShelf() {
		GameStore gameStore = setupStage1();
		gameStore.addShelf("A");
		
		assertNotNull(gameStore.getShelf("A"));
	}
	
	@Test
	public void testSettersAndGetters() {
		GameStore gameStore = setupStage1();
		gameStore.addShelf("A");
		gameStore.setAmountCashier(0);
		
		
		assertEquals(0, gameStore.getAmountCashier());
		assertNotNull(gameStore.getShelf("A"));
		
	}
	
	@Test
	public void testSearchCustomer() {
		GameStore gameStore = setupStage1();
		Customer customerToAdd = new Customer("juan");
		
		
		gameStore.addCustomer(customerToAdd);
		assertNotNull(gameStore.searchCustomer("juan"));
	}
	
	@Test
	public void testAddCustomer() {
		GameStore gameStore = setupStage1();
		Customer customerToAdd = new Customer("juan");
		
		gameStore.addCustomer(customerToAdd);
		assertNotNull(gameStore.getCustomers());
	}
	
	@Test
	public void testSortCustomerWishList() {

		GameStore gameStore = setupStage1();

		ArrayList<String> wishList = new ArrayList<>();
		wishList.add("A");
		wishList.add("C");
		wishList.add("B");
		
		Customer customer = new Customer("id","Janna",155,wishList);
		Customer customer2 = new Customer("id","Janna",155,wishList);
		
		String [] idsShelf = new String [3];
		idsShelf[0] = "A";
		idsShelf[1] = "C";
		idsShelf[2] = "B";
		
		gameStore.addShelf("A");
		gameStore.addShelf("C");
		gameStore.addShelf("B");
		gameStore.addCustomer(customer);
		gameStore.addCustomer(customer2);
		assertNotEquals(idsShelf, customer.getWhisList());
	}
	
	@Test
	public void testFillCustomerShoppingBasket() {
		
	}

}

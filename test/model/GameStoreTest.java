package model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GameStoreTest {

	public GameStore setupStage1() {
		GameStore gameStore = new GameStore();
		return gameStore;
	}
	
	@Test
	void testSettersAndGetters() {
		setupStage1();
		GameStore gameStore = setupStage1();
		
		gameStore.setAmountCashier(0);
		
		assertEquals(0, gameStore.getAmountCashier());
		
	}
	
	@Test
	void testSearchCustomer() {
		setupStage1();
		GameStore gameStore = setupStage1();
		Customer customerToAdd = new Customer("juan");
		
		
		gameStore.addCustomer(customerToAdd);
		assertNotNull(gameStore.searchCustomer("juan"));
	}
	
	@Test
	void testAddCustomer() {
		setupStage1();
		GameStore gameStore = setupStage1();
		Customer customerToAdd = new Customer("juan");
		
		gameStore.addCustomer(customerToAdd);
		assertNotNull(gameStore.getCustomers());
	}

}

package model;

import static org.junit.jupiter.api.Assertions.*;

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
		//Invoco clase game
		GameStore gameStore = setupStage1();
		//Añado shelfs a su arreglo
		//Añado clientes con sus listas de juegos
		//Crear un arreglo con ids de shelfs desordenados
		
	}

}

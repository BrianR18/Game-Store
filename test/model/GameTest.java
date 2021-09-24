package model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GameTest {
	
	public void setupStage1() {
		
	}

	@Test
	void testGame() {
		setupStage1();
		
		Game gameToAdd = new Game("Fifa21",45000,2);
		
		assertEquals("Fifa21", gameToAdd.getId());
		assertEquals(45000, gameToAdd.getPrice());
		assertEquals(2, gameToAdd.getAmount());
		
	}
	
	@Test
	void testAddGame() {
		setupStage1();
		
		Game gameToAdd = new Game();
		
		gameToAdd.addGame();
		assertNotNull(gameToAdd.getGameToAdd());
		assertFalse(gameToAdd.getGameToAdd().isEmpty());
	}
	
	@Test 
	void testSettersAndGetters() {
		setupStage1();
		
		Game gameToAdd = new Game(" ", 0 , 0);
		
		gameToAdd.setId("Fifa21");
		gameToAdd.setAmount(2);
		gameToAdd.setPrice(45000);
	}

}

package model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ShelfTest {
	
	public Shelf setupStage1() {
		Shelf shelf = new Shelf();
		return shelf;
	}
	
	@Test
	public void testAddGame() {
		Shelf shelf = setupStage1();
		shelf.addGame("fifa", 64000, 2);
		assertNotNull(shelf.getGame("fifa"));
	}
	
	@Test
	public void testDeleteGame() {
		Shelf shelf = setupStage1();
		shelf.addGame("fifa", 64000, 2);
		shelf.addGame("fifa2", 64000, 2);
		assertNotNull(shelf.getGame("fifa"));
		shelf.deleteGame("fifa2");
		assertNull(shelf.getGame("fifa2"));
	}
	
	@Test
	public void testSettersAndGetters() {
		Game game = new Game("fifa", 64000, 2);
		Shelf shelf = setupStage1();
		shelf.setId("A");
		shelf.addGame("fifa", 64000, 2);
		assertEquals(game.getId(), shelf.getGame("fifa").getId());
	}

}

<<<<<<< HEAD
package model;

public class Game {
	private String id;
	private double price;
	private int amount;
	
	public Game(String id,double price,int amount){
		this.id = id;
		this.price = price;
		this.amount = amount;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
	
}//End Game
=======
package model;

import java.util.ArrayList;

public class Game {
	
	private String id;
	private double price;
	private int amount;
	private ArrayList<Game> gameToAdd = new ArrayList<>();
		
	public Game(String id, double price, int amount) {
		this.id = id;
		this.price = price;
		this.amount = amount;
		gameToAdd = new ArrayList<>();
	}
	
	
	
	
	public Game() {
		id = "";
		price = 0;
		amount = 0;
		gameToAdd = new ArrayList<>();
	}




	public void addGame() {
		Game game1 = new Game("1005",14.50,2);
		Game game2 = new Game("1006",14.80,3);
		gameToAdd.add(game1);
		gameToAdd.add(game2);
	}
	
	public String getId() {return id;}
	public void setId(String id) {this.id = id;}
	
	public double getPrice() {return price;}
	public void setPrice(double price) {this.price = price;}
	
	public int getAmount() {return amount;}
	public void setAmount(int amount) {this.amount = amount;}




	public ArrayList<Game> getGameToAdd() {return gameToAdd;}
	
}
>>>>>>> Customer&Queue

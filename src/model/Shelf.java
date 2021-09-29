package model;
import Collections.*;
import java.util.ArrayList;
public class Shelf {
	private String id;
	private HashTable<String,Game> games;
	
	public Shelf(String id){
		games = new HashTable<String,Game>();
	}//End Shelf{
	
	public Shelf() {
		games = new HashTable<String,Game>();
		id = "";
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public Game getGame(String id){
		return games.search(id);
	}//End getGame
	
	public void addGame(String id,double price, int amount){
		Game toAdd = new Game(id,price,amount);
		games.insert(id, toAdd);
	}//End addGame
	 
	public boolean deleteGame(String id){
		return games.delete(id);
	}//End deleteGame
	
	public ArrayList<Game> getAllGames(){
		String[] keys = games.getKeys();
		ArrayList<Game> gm = new ArrayList<Game>();
		for(int i = 0; i < keys.length;i++){
			gm.add(games.search(keys[i]));
		}//End for
		return gm;
	}//End getAllGames
}//End Shelf

package model;
import Collections.*;
import java.util.ArrayList;

public class GameStore {
	
	private int amountCashier;
	private HashTable<String,Shelf> shelfs; 
	private ArrayList<Customer> customers = new ArrayList<>();
//	private Customer customer;
	
	public GameStore(){
		amountCashier = 1;
		shelfs = new HashTable<String,Shelf>();
		customers = new ArrayList<>();
	}//End GameStore constructor

	public GameStore(int amountCashier){
		this.amountCashier = amountCashier;
		shelfs = new HashTable<String,Shelf>();
	}//End GameStore constructor	
	
	public void addShelf(String id){
		Shelf toAdd = new Shelf(id);
		shelfs.insert(id, toAdd);
	}//End addShelf
	
	public Shelf getShelf(String key){
		return shelfs.search(key);
	}//End getShelf
	
	public boolean deleteShelf(String key){
		return shelfs.delete(key);
	}//End deleteShelf
	
	public int getAmountCashier() {
		return amountCashier;
	}//End getAmountCashier
	
	public void setAmountCashier(int amountCashier) {
		this.amountCashier = amountCashier;
	}//End setAmountCashier
	
	public void sortCustomerWishList(int sortType){
		String[] shelfsKey = shelfs.getKeys();
		String[] customerCodes;
		String[] gamesShelfs;
		for(int i = 0; i < customers.size(); i++){
			//Create a new array with the customer wish list
			customerCodes = new String[customers.get(i).getWhisList().size()];
			customers.get(i).getWhisList().toArray(customerCodes);
			gamesShelfs = new String[customerCodes.length];
			for(int currentGameCode = 0; currentGameCode < customerCodes.length;currentGameCode++){
				gamesShelfs[currentGameCode] = getShelfUbication(currentGameCode,shelfsKey,customerCodes);
			}//End for
			if(sortType == 1)
				customers.get(i).sortWishListByInsertion(null);
			else
				customers.get(i).sortWishListBySelection(null);
		}//End for
	}//End sortCustomerWishList
	
	private String getShelfUbication(int currentGameCode, String[] shelfsKey,String[] customerCodes){
		boolean find = false;
		String shelfId = new String();
		for(int currentShelf = 0; currentShelf < shelfsKey.length && !find;currentShelf++){
			if(shelfs.search(shelfsKey[currentShelf]).getGame(customerCodes[currentGameCode]) != null){
				shelfId = shelfsKey[currentShelf];
				find = true;
			}//End if
		}//End for
		return shelfId;
	}//End getShelfUbication
	
	public Customer searchCustomer(String id) {
		 for (int i = 0; i < customers.size(); i++) {
	            if (customers.get(i).getId().compareTo(id) == 0) {
	                return customers.get(i);
	            }//End if
	        }//End for
	        return null;
	}	
	public void addCustomer(Customer customerToAdd) {
		if(customerToAdd!=null) {
		customers.add(customerToAdd);
		}
	}
	public ArrayList<Customer> getCustomers() {return customers;}
	
}//End GameStore
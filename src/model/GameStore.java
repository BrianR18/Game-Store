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
		String[] customersWishList = new String[2];
		for(int i = 0; i < 1; i++){
			for(int j = 0; j < shelfsKey.length;j++){
				
			}
		}//End
	}//End sortCustomerWishList

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
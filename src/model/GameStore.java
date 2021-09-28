package model;
import Collections.*;

import java.util.ArrayList;

public class GameStore {
	
<<<<<<< HEAD
	private int amountCashier;
	private HashTable<String,Shelf> shelfs; 
	
	public GameStore(){
		amountCashier = 1;
		shelfs = new HashTable<String,Shelf>();
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
=======
	private ArrayList<Customer> customers = new ArrayList<>();
	private ArrayList<Shelf> shelfs = new ArrayList<>();
	private Customer customer;
	private int amountCashier;
	
	


	public GameStore() {
	
		customers = new ArrayList<>();
		amountCashier = 0;
		shelfs = new ArrayList<>();
	}

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
	
	public void sortCustomersWishList(int sortType) {
		if(sortType == 1) {
			customer.sortWishListByInsertion(shelfs);
		}else {
			customer.sortWishListBySelection(shelfs);
		}
		
	}
	
	public int getAmountCashier() {return amountCashier;}
	public void setAmountCashier(int amountCashier) {this.amountCashier = amountCashier;}

	public ArrayList<Customer> getCustomers() {return customers;}

	
>>>>>>> Customer&Queue
	
}//End GameStore
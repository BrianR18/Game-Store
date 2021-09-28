package model;

import java.util.ArrayList;

public class GameStore {
	
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

	
	
}//End GameStore
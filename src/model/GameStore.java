package model;

import java.util.ArrayList;

public class GameStore {
	
	private ArrayList<Customer> customers = new ArrayList<>();
	private int amountCashier;
	
	


	public GameStore() {
	
		customers = new ArrayList<>();
		amountCashier = 0;
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
	
	
	
	public int getAmountCashier() {return amountCashier;}
	public void setAmountCashier(int amountCashier) {this.amountCashier = amountCashier;}

	public ArrayList<Customer> getCustomers() {return customers;}

	
	
}//End GameStore
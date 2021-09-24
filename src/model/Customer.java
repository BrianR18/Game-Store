package model;

import java.util.ArrayList;

public class Customer {
	private String id;
	private ArrayList<String> wishList;
	private double spendTime;
	private String name;
//	private Stack<String> shoppingBasket;
	
	
	public Customer(String id, ArrayList<String> whisList, String name) {
		this.id = id;
		this.wishList = whisList;
		spendTime = 0;
		this.name = name;
	}
	
	public Customer(String id, String name, double spendTime, ArrayList<String> whisList) {
		this.id = id;
		this.wishList = whisList;;
		this.spendTime = spendTime;
		this.name = name;
		
	}
	
	public Customer() {
		id = "";
		spendTime = 0;
		wishList = new ArrayList<String>();
		name = "";
	}
	
	public Customer(String id) {
		id = "";
		spendTime = 0;
		wishList = new ArrayList<String>();
		name = "";
	}

	public void addElementToWishList(String gameId) {
		if(gameId!=null && gameId!="") {
			wishList.add(gameId);
		}
	}
	
	public void sortWishListByInsertion(ArrayList<String> shelfsId) {
		String auxiliar;
		int i = 0;
		int j = 0;
		while ( i < shelfsId.size() ){
		    auxiliar = shelfsId.get(i);
		    for ( j=i ; j>0 && shelfsId.get(j-1).charAt(0) > auxiliar.charAt(0) ; --j ) {
		     shelfsId.set(j, shelfsId.get(j-1));
		    }
		    shelfsId.set(j, auxiliar);
		    ++i;  
		}
	}
	
	public void sortWishListBySelection() {
		for (int i = 0; i < wishList.size()-1; i++)  
        {  
            int index = i;  
            for (int j = i + 1; j < wishList.size(); j++){  
                if (wishList.get(j).charAt(0) < wishList.get(index).charAt(0)){  
                    index = j;//searching for lowest index  
                }  
            }  
            String smallerNumber = wishList.get(index);   
            wishList.set(index, wishList.get(i));
            wishList.set(i, smallerNumber);
        }  
	}
	
	public void fillShoppingBasket() {
		if(wishList!=null) {
			for(int i = 1; i<wishList.size();i++) {
//				shoppingBasket.push(wishList.get(i-1));
			}
		}
		
	}
	
//*****************************************Setters&Getters******************************
	public String getId() {return id;}
	public void setId(String id) {this.id = id;}

	public ArrayList<String> getWhisList() {return wishList;}

	public double getSpendTime() {return spendTime;}
	public void setSpendTime(double spendTime) {this.spendTime = spendTime;}

	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	
	
	
}

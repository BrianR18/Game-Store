package model;

import java.util.ArrayList;

public class Customer {
	private String id;
	private ArrayList<String> whisList;
	private double spendTime;
	
	
	public Customer(String id, ArrayList<String> whisList) {
		this.id = id;
		this.whisList = whisList;
		spendTime = 0;
	}
	
	public Customer() {
		id = "";
		spendTime = 0;
		whisList = new ArrayList<String>();
	}
	
	public Customer(String id) {
		id = "";
		spendTime = 0;
		whisList = new ArrayList<String>();
	}

	public void addElementToWishList(String gameId) {
		if(gameId!=null) {
			whisList.add(gameId);
		}
	}
	
	public static void sortWishListByInsertion(ArrayList<String> shelfsId) {
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
		for (int i = 0; i < whisList.size()-1; i++)  
        {  
            int index = i;  
            for (int j = i + 1; j < whisList.size(); j++){  
                if (whisList.get(j).charAt(0) < whisList.get(index).charAt(0)){  
                    index = j;//searching for lowest index  
                }  
            }  
            String smallerNumber = whisList.get(index);   
            whisList.set(index, whisList.get(i));
            whisList.set(i, smallerNumber);
        }  
	}
	
	public void fillShoppingBasket() {
		
	}
	
//*****************************************Setters&Getters******************************
	public String getId() {return id;}
	public void setId(String id) {this.id = id;}

	public ArrayList<String> getWhisList() {return whisList;}

	public double getSpendTime() {return spendTime;}
	public void setSpendTime(double spendTime) {this.spendTime = spendTime;}
	
}

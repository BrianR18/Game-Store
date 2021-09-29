package model;
import Collections.*;
import java.util.ArrayList;

public class Customer {
	private String id;
	private ArrayList<String> wishList;
	private double spendTime;
	private String name;
	private Stack<Game> shoppingBasket;
	
	public Customer(String id, ArrayList<String> whisList, String name) {
		this.id = id;
		this.wishList = whisList;
		spendTime = 0;
		this.name = name;
		shoppingBasket = new Stack<>();
	}
	
	public Customer(String id, String name, double spendTime, ArrayList<String> whisList) {
		this.id = id;
		this.wishList = whisList;;
		this.spendTime = spendTime;
		this.name = name;
		shoppingBasket = new Stack<>();
	}
	
	public Customer() {
		id = "";
		spendTime = 0;
		wishList = new ArrayList<String>();
		name = "";
		shoppingBasket = new Stack<>();
	}
	
	public Customer(String id) {
		this.id = id;
		spendTime = 0;
		wishList = new ArrayList<String>();
		name = "";
		shoppingBasket = new Stack<>();
	}
	
	public Customer(String name, String id) {
		wishList = new ArrayList<String>();
		shoppingBasket = new Stack<>();
	}

	public void addElementToWishList(String gameId) {
		if(gameId!=null && gameId!="") {
			wishList.add(gameId);
		}
	}
		
	public void sortWishListByInsertion(String[] shelfsId) {
			String auxiliar;
			String auxiliar2;
			int i = 0;
			int j = 0;
			while ( i < shelfsId.length ){
				auxiliar = shelfsId[i];
				auxiliar2 = wishList.get(i);
				for ( j=i ; j>0 && shelfsId[j-1].charAt(0) > auxiliar.charAt(0) ; --j ) {
					shelfsId[j] = shelfsId[j-1];
					wishList.set(j, wishList.get(j-1));
				}
				shelfsId[j] = shelfsId[i];
				wishList.set(j, auxiliar2);
				++i;  
			}
	}

	
	public void sortWishListBySelection(String[] shelfsId) {
		for (int i = 0; i < shelfsId.length-1; i++){  
			int index = i;  
			for (int j = i + 1; j < shelfsId.length; j++){  
				if (shelfsId[j].charAt(0) < shelfsId[index].charAt(0)){  
					index = j;  
				}  
			}  
			String smallerNumber2 = shelfsId[index];
			shelfsId[index] = shelfsId[i];
			shelfsId[i] = smallerNumber2;
			
			String smallerNumber = wishList.get(index); 
			wishList.set(index, wishList.get(i));
			wishList.set(i, smallerNumber);
		}  
	}
	
	public void fillShoppingBasket(Game gameToAdd) {
				shoppingBasket.push(gameToAdd);			
	}
	
	
//	//Metodos de los audios
//	//Ordenamientos Customer
//	public void sortWishListByInsertion() {
//		String auxiliar2;
//		int i = 0;
//		int j = 0;
//		while ( i < wishList.size() ){
//			auxiliar2 = wishList.get(i);
//			for ( j=i ; j>0 && wishList.get(j-1).charAt(0) > auxiliar2.charAt(0) ; --j ) {
//				wishList.set(j, wishList.get(j-1));
//
//			}
//			wishList.set(j, auxiliar2);
//			++i;  
//		}
//	}
//
//	public void sortWishListBySelection() {
//		for (int i = 0; i < wishList.size()-1; i++){  
//			int index = i;  
//			for (int j = i + 1; j < wishList.size(); j++){  
//				if (wishList.get(j).charAt(0) < wishList.get(index).charAt(0)){  
//					index = j;//searching for lowest index  
//				}  
//			}  	
//			String smallerNumber = wishList.get(index); 
//			wishList.set(index, wishList.get(i));
//			wishList.set(i, smallerNumber);
//
//		}  
//	}
//
//	//Ordenamientos Shelf
//	public void sortGamesByInsertion(ArrayList<Game> gamesId) {
//		String auxiliar;
//		int i = 0;
//		int j = 0;
//		while ( i < gamesId.size() ){
//			auxiliar = gamesId.get(i).getId();
//			for ( j=i ; j>0 && gamesId.get(j-1).getId().charAt(0) > auxiliar.charAt(0) ; --j ) {
//				gamesId.set(j, gamesId.get(j-1));
//			}
//			gamesId.set(j,gamesId.get(i));
//			++i;  
//		}
//	}
//	
//	public void sortGamesBySelection(ArrayList<Game> gamessId) {
//		for (int i = 0; i < gamessId.size()-1; i++){  
//			int index = i;  
//			for (int j = i + 1; j < gamessId.size(); j++){  
//				if (gamessId.get(j).getId().charAt(0) < gamessId.get(index).getId().charAt(0)){  
//					index = j;//searching for lowest index  
//				}  
//			}  
//			Game smallerNumber2 = gamessId.get(index);
//			gamessId.set(index,gamessId.get(i));
//			gamessId.set(i, smallerNumber2);
//		}  
//	}
//	
//	//Metodos ordenamiento clase GameStore
//	
//	public void sortShelfsByInsertion(ArrayList<Shelf> shelfsId) {
//		String auxiliar;
//		int i = 0;
//		int j = 0;
//		while ( i < shelfsId.size() ){
//			auxiliar = shelfsId.get(i).getId();
//			for ( j=i ; j>0 && shelfsId.get(j-1).getId().charAt(0) > auxiliar.charAt(0) ; --j ) {
//				shelfsId.set(j, shelfsId.get(j-1));
//			}
//			shelfsId.set(j,shelfsId.get(i));
//			++i;  
//		}
//	}
//
//	public void sortShelfsBySelection(ArrayList<Shelf> shelfsId) {
//		for (int i = 0; i < shelfsId.size()-1; i++){  
//			int index = i;  
//			for (int j = i + 1; j < shelfsId.size(); j++){  
//				if (shelfsId.get(j).getId().charAt(0) < shelfsId.get(index).getId().charAt(0)){  
//					index = j;//searching for lowest index  
//				}  
//			}  
//			Shelf smallerNumber2 = shelfsId.get(index);
//			shelfsId.set(index,shelfsId.get(i));
//			shelfsId.set(i, smallerNumber2);
//		}  
//	}
	
//*****************************************Setters&Getters******************************
	public String getId() {return id;}
	public void setId(String id) {this.id = id;}

	public ArrayList<String> getWhisList() {return wishList;}

	public double getSpendTime() {return spendTime;}
	public void setSpendTime(double spendTime) {this.spendTime = spendTime;}

	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	
	
	
}

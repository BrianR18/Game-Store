package model;
import Collections.*;
public class Main {
	public static void main(String[] args) {
		HashTable<String,Integer> a = new HashTable<String,Integer>();
		a.insert("Brian", 3);
		a.insert("Daniel", 4);
		a.insert("Camilo", 5);
		System.out.println(a.search("santiago"));
	}
}

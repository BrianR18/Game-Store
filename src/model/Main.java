package model;

public class Main {
	public static void main(String[] args) {
		String[] a;
		int size = 5;
		for(int i = 0; i < 5; i++) {
			size += i;
			a = new String[size];
			System.out.println(a.length);
		}
	}
}

package model;

public interface IStack <T>{
	public void push(T object);
	public T top ();
	public T pop();
	public boolean isEmpty();
	public int size();
}

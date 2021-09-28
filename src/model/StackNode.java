package model;

public class StackNode <T>{
	
	private T node;
	private StackNode <T> next;
	
	public StackNode(T node) {
		this.node = node;
	}
	
	public T getNode() {return node;}
	public void setNode(T node) {this.node = node;}
	
	public StackNode<T> getNext() {return next;}
	public void setNext(StackNode<T> next) {this.next = next;}
	
}

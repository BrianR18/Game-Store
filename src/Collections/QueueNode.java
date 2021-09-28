package Collections;

public class QueueNode <T>{
	
	private T node;
	private QueueNode<T> next;
	
	
	public QueueNode(T node) {
		this.node = node;
	}


	public T getNode() {return node;}
	public void setNode(T node) {this.node = node;}

	public QueueNode<T> getNext() {return next;}
	public void setNext(QueueNode<T> next) {this.next = next;}	
	
}

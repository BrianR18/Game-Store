package model;

public class Queue<T> implements IQueue<T> {
	private QueueNode <T> front;
	
	


	@Override
	public void enqueue(T element) {
		QueueNode<T> elementToAdd = new QueueNode<T>(element);
		if(front==null) {
			front = elementToAdd;
		}else {
			enqueue(front,elementToAdd);
		}
	}

	private void enqueue(QueueNode<T> actual, QueueNode<T> elementToAdd) {
		if(actual.getNext()==null) {
			actual.setNext(elementToAdd);
		}else {
			enqueue(actual.getNext(),elementToAdd);
		}
	}

	@Override
	public T dequeue() {
		T element = front.getNode();
		if(isEmpty()!=true) {
			front = front.getNext();
		}
		return element;
	}

	@Override
	public T front() {
		T frontElement = front.getNode();
		return frontElement;
	}

	@Override
	public boolean isEmpty() {
		if(front == null) {
			return true;
		}
		return false;
	}

}

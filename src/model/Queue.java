package model;

public class Queue<T> implements IQueue<T> {
	
	private QueueNode <T> front;
	private T back;
	

	public Queue(){
		back = null;
		front = null;
	}

	@Override
	public void enqueue(T element) {
		QueueNode<T> elementToAdd = new QueueNode<T>(element);
		if(front==null) {
			front = elementToAdd;
			back = element;
		}else {
			enqueue(front,elementToAdd);
		}
	}

	private void enqueue(QueueNode<T> actual, QueueNode<T> elementToAdd) {
		if(actual.getNext()==null) {
			actual.setNext(elementToAdd);
			back = elementToAdd.getNode();
		}else {
			enqueue(actual.getNext(),elementToAdd);
		}
	}

	@Override
	public T dequeue() {
		T element = front.getNode();
		if(isEmpty()!=true) {
			front.setNode(null);
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
	
	@Override
	public boolean contains(T elementToSearch) {
			if(elementToSearch.equals(front.getNode())) {
				return true;
			}else {
				return contains(front,elementToSearch);
			}
	}

	private boolean contains(QueueNode<T> actual, T elementToSearch) {
		if(actual.getNext()!=null) {
			if(actual.getNext().getNode().equals(elementToSearch)) {
				return true;
			}else {
				contains(actual.getNext(),elementToSearch);
			}
		}

		return false;
	}
	
}

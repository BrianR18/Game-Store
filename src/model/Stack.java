package model;

public class Stack<T> implements IStack<T>{
	
	private StackNode<T> top;
	private int size;

	
	public Stack() {
		top = null;
		size = 0;
	}

	@Override
	public void push(T object) {
		StackNode<T> nodeToAdd = new StackNode<T>(object);
		if(top == null) {
			top = nodeToAdd;
			size++;
		}else {
			nodeToAdd.setNext(top);
			top = nodeToAdd;
			size++;
		}
		
	}

//	private void push(StackNode<T> current, StackNode<T> object) {
//			object.setNext(current);
//			top = object;
//			size++;
//	}

	@Override
	public T top() {
			if(top != null) {
				return top.getNode();
			}
		return null;
	}

	@Override
	public T pop() {
			StackNode<T> elementToDelete = top;
				if(isEmpty() != true) {
					top = top.getNext();
					size--;
					elementToDelete.setNext(null);
				}
		return elementToDelete.getNode();
	}

	@Override
	public boolean isEmpty() {
			if(top==null) {
				return true;
			}
		return false;
	}

	@Override
	public int size() {
		return size;
	}

}

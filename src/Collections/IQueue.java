package Collections;

public interface IQueue <T>{
	public void enqueue(T element);
	public T dequeue();
	public T front();
	public boolean isEmpty();
	public boolean contains(T element);
}

package LECTURE13;

public class QueueUsingLL<T> {
	private  QueueNode<T> head;
	private  QueueNode<T> tail;
	private int count;
	
	public QueueUsingLL() {
		count = 0;
	}
	
	public int size() {
		return count;
	}
	
	public boolean isEmpty() {
		if(size() == 0)
			return true;
		else
			return false;
	}
	
    public T front(){
    	return head.data;
    }
	
    
    
    public void enqueue(T element) {
		
		count++;
		QueueNode<T> item = new QueueNode<T>(element);
		//item.data = ;
		if(tail == null) {
			head = item;
			tail = item;
		} else {
			tail.next = item;
			tail = item;
		}
	}
	
	public T dequeue() throws QueueEmptyException {
		if(size() == 0) { 
			QueueEmptyException e = new QueueEmptyException();
			throw e;
		}
		T item = head.data;
		head = head.next;
		if(head == null)
			tail = null;
		count--;
		return item;	
	}
}

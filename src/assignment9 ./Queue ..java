package LECTURE13;

public class Queue {
	private int data[];
	private int nextIndex;
	private int firstIndex;
	private int size;
	
	public Queue(int size) {
		data = new int[size];
		nextIndex = 0;
		firstIndex = -1;
		this.size = 0;
	}
	
	public int getSize() {
		return size;
	}
	
	boolean isEmpty() {
		return size == 0;
	}
	
	public void enqueue(int element) throws QueueFullException {
		if(size == data.length) {
			QueueFullException qq= new QueueFullException();
		
			// Throw queue full exception
		int newData[] = new int[2 * data.length];
			int j = 0;
			for(int i = firstIndex; i < data.length; i++, j++) {
				newData[j] = data[i];
			}
			for(int i = 0; i < firstIndex; i++, j++) {
				newData[j] = data[i];
			}
			data = newData;
			firstIndex = 0;
			nextIndex = size;
		throw qq;	
		}
		data[nextIndex] = element;
		nextIndex = (nextIndex + 1) % data.length;
		size++;
		if(firstIndex == -1) {
			firstIndex = 0;
		}
	}
	
	public int dequeue() {
		if(size == 0) {
			// Queue empty exception
		}
		int ans = data[firstIndex];
		firstIndex = (firstIndex + 1) % data.length;
		size--;
		if(size == 0) {
			firstIndex = -1;
			nextIndex = 0;
		}
		return ans;
	}
	
	public int front() {
		if(size == 0) {
			// Queue empty exception
		}
		return data[firstIndex];
	}
	
	
	
	

}

package Lecture12;

public class StackUsingLL {
     
	private node<Integer> head=null;
	private int size;
	
	
	public int size(){
		
		return size;
	 }
	
	public boolean isEmpty(){
		if(head==null){
			return true;
		}
		return false;
	}
	public int top() throws StackEmpty{
		if(head==null){
			StackEmpty e =new StackEmpty();
		throw e;
		}
		return head.data;
		
		}
	
	public  void push(int element) {
		node<Integer> newnode = new node(element);
		newnode.next=head;
		head=newnode;
		size++;
	}
	
	public int pop() throws StackEmpty{
		if(head==null){
			StackEmpty e =new StackEmpty();
			throw e;
			
			
		}
		int x=head.data;
		head=head.next;
	size--;
		return x;
	}
	
	
}

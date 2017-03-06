package Lecture11;

import java.util.Scanner;

public class linkedList {
   
	public static node<Integer> takeInput(){
		Scanner s = new Scanner(System.in);
		node<Integer> head = null;
		node<Integer> tail=null;
		System.out.println("enter data ");
		int data =s.nextInt();
		while(data!=-1){
			node<Integer> newnode= new node<Integer>(data);
			if(head==null){
				head=newnode;
				tail=newnode;
			}
			else{
				tail.next=newnode;
				tail=newnode;
			}
			System.out.println("enter data ");
			data=s.nextInt();
		}
	return head;
	}
	
	public static void print(node<Integer> head,int i ){
		 
		 for(int count=0;count<i&&head!=null;count++ ){
			 head=head.next;
		 }
		 if(head==null)
			 System.out.println("index not found");
		 else
			 System.out.println("data is"+head.data);
	}
	
	
	/*public static node<Integer> getNodeAt(int index){
		node<Integer> t=head;
		
	}*/
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
	   /*  System.out.println("enter i");
	     int i =s.nextInt();
	     print(head,i);*/
	}

}

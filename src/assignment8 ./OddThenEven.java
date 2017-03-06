package assignment8;

import java.util.Scanner;

import Lecture11.node;

public class OddThenEven {


	public static int geti(node<Integer> head, int data){


		node<Integer> temp= head;
		int m=0;
		while(temp.data!=data){
			m++;
			temp=temp.next;


		}
		return m;
	}
	/*public static node<Integer> oddEven(node<Integer> head){
		node<Integer> temp=head;
		 node<Integer> oddH=null;
		 node<Integer> oddT=null;
		 node<Integer> evenH=null;
		 node<Integer> evenT=null;

	}*/
	 
	public static void deleteAlternate(node<Integer> head){
		node<Integer> temp=head;
		while(temp.next!=null){
			temp.next=temp.next.next;
			temp=temp.next;
		}
	}

	public static node<Integer> rotate(node<Integer> head, int k ,int length){
		node<Integer> temp = head;
		node<Integer> tail= head;
		for(int i =0;i<length-1;i++){
			tail=tail.next;
		}
		for(int i =0;i<length-k-1;i++){
			temp=temp.next;
		}
		node<Integer> y =temp.next;
		temp.next=null;
		tail.next=head;
		head=y;
		return head;
	}

	public static void reverse3(node<Integer> head,int length){
		if(head==null){
			return;
		}
		if(head.next==null){
			System.out.print(head.data +" ");
			
		}
		else{
		reverse3(head.next,length-1);
		System.out.print(head.data +" ");
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub


		node<Integer> head=swap.takeInput();
		int length =reverseNoPointerChange.length1(head);
		/*System.out.println("the length is " + n);
		System.out.println("enter the data to be searched");

		int m=s.nextInt();
		int x=geti(head,m);
		System.out.println("the pos is "+x);*/
		/*deleteAlternate(head);
		 */
	/*	System.out.println("enter k ");
		Scanner s=new Scanner(System.in);
		int k=s.nextInt();
		head=rotate(head, k, length);
		swap.print(head);*/
        System.out.println("the reverse is ");
        reverse3(head,length);


	}

}

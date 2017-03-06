package assignment8;

import java.util.Scanner;

import Lecture11.node;

public class swap1 {

	public static node<Integer> swap1(node<Integer> head, int c1,int c2){
		node<Integer> p1=head;
		node<Integer> p2=head;
		for(int i =0;i<c1-1&&p1!=null;i++){
			p1=p1.next;

		}
		for(int j=0;j<c2-1&&p2!=null;j++){
			p2=p2.next;
		}
		if(p1==null||p2==null) {
			System.out.println("invalid indices");
			return head;
		}
		else if(c1==0&&p1!=p2){
			node<Integer> temp2=p1.next;
			p1.next=p2.next.next;
			node<Integer> temp3=p2.next;
			p2.next=p1;
			p1=temp3;
			temp3.next=temp2;
			return p1;
		}
		else if(p1==p2&&c1==0){
			node<Integer> temp2= head.next;
			p1.next=p1.next.next;
			temp2.next=p1;
			return temp2;
		}
		else if(p1.next==p2.next){
			node<Integer> y= p2.next;
			node<Integer> x=p1.next;
			p2.next=p2.next.next;
			p1.next=y;
			p1.next.next=p2;
			return head;
		}
		else{
			node<Integer> y= p2.next;
			node<Integer> x=p1.next;
			node<Integer> temp=y.next;
			p1.next=y;
			p2.next=x;
			p1.next.next=p2;
			p2.next.next=temp;
			return head;
		}
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s =new Scanner(System.in);
	
		node<Integer> head=swap.takeInput();
		System.out.println("enter the nodes to be swapped");{
			int x=s.nextInt();
			int y =s.nextInt();
		head=swap1(head,x,y);
			System.out.println("the linked list now is ");
			swap.print(head);
		}
	
	
	}

}

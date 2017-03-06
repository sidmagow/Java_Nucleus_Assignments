package assignment8;

import Lecture11.linkedList;
import Lecture11.node;
import Lecture12.LinkedList;

public class evenAfterOdd {

	
	public static  node<Integer> evenafterodd(node<Integer> head ){
   node<Integer> oddh = null;
   node<Integer> oddt=null;
   node<Integer> evenh = null;
   node<Integer> event=null;
    node<Integer> temp= head;
   if(head.data%2==1){
	  oddh=head;
	  oddt=oddh;
	  while(temp!=null){
		  if(temp.data%2==0){
			  evenh=temp;
			  event=evenh;
			  break;
		  }
		  temp=temp.next;
	  }
  }
  else{
	  evenh=head;
	  event=evenh;
	  while(temp!=null){
		  if(temp.data%2==1){
			  oddh=temp;
			  oddt=oddh;
			  break;
		  }
		  temp=temp.next;
	  }
  }
   
   while(head!=null){
	   if(head.data%2==0&&head!=evenh){
		   event.next=head;
		   event=head;
		 
	   }
	   if(head.data%2==1&&head!=oddh){
		   oddt.next=head;
		   oddt=head;
		  
	   }
	   head=head.next;
   }
   event.next=null;
   oddt.next=null;
   oddt.next=evenh;
   return oddh;
   
   
   
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		node<Integer> head=linkedList.takeInput();
		swap.print(head);
		head =evenafterodd(head);
		swap.print(head);
	}

}

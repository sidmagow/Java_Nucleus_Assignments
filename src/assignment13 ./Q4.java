package assignment13;

import java.util.ArrayList;
import java.util.HashMap;

public class Q4 {

	public static void duplicateLinkedList(newNode head){
		HashMap<newNode, ArrayList<newNode>> map = new HashMap<>();
		newNode temp=head;
		while(temp!=null){
			ArrayList<newNode> aa= new ArrayList<>();
			aa.add(temp.next);
			aa.add(temp.random);
			map.put(temp, aa);
			temp=temp.next;
		}
		while(!map.isEmpty()){
			
		}
		int c=0;
		newNode head2= new newNode(head.data);
		for(HashMap.Entry<newNode, ArrayList<newNode>> entry : map.entrySet()){
		   if(c==0){
			   
		   }
		   else{
		   int x=entry.getKey().data;
			newNode new1=new newNode(x);
			
			newNode new2= new newNode(entry.getValue().get(0).data);
			new1.next=new2;
			newNode new3= new newNode(entry.getValue().get(1).data);
		   new1.random=new3;
		   }
		   c++;
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
	}

}

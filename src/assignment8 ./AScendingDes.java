package assignment8;

import Lecture11.node;

public class AScendingDes {

	public static node<Integer> asd(node<Integer> head){
		node<Integer> ascH =head;
		node<Integer> ascT = ascH;
		node<Integer> desH =  head.next;
		node<Integer> desT = desH;
		node<Integer> temp= head.next.next;

		for(int i =0;temp!=null;i++,temp=temp.next){
			if(i%2==0){
				ascT.next=temp;
				ascT=temp;
			}else{
				desT.next=temp;
				desT=temp;
			}
		}
		ascT.next=null;
		desT.next=null;
		node<Integer> temp1=ascH;
		if(desH.data<ascH.data){
			node<Integer> x=desH;
			desH=swap.reverse(desH);
			desT=x;
			desT.next=ascH;
			head=desH;
			return desH;
		}
		if(ascT.data<desT.data){
			desH=swap.reverse(desH);
			ascT.next=desH;
			head=ascH;
			return head;
		}

		while(temp1.next!=null){
			if(desT.data>temp1.data&&desH.data<temp1.next.data){
				node<Integer> x=desH;
				node<Integer> next=temp1.next;
				desH=swap.reverse(desH);
				desT=x;
				temp1.next=desH;
				desT.next=next;
				return ascH;
			}
			if(desT.data<temp1.data&&desH.data<temp1.next.data){
				node<Integer> x=desH;
				node<Integer> next=temp1.next;
				desH=swap.reverse(desH);
				desT=x;
				node<Integer> x2= desH;
                node<Integer> next2=null;
				while(x2.next!=null){

					if(x2.next.data<temp1.data){
						x2=x2.next;
					}
					else{
						 next2=x2.next;
						x2.next=null;
						break;
					}
				}
              x2.next=temp1;
             temp1.next=next2;
             desT.next=next;
              
              head=desH;
              
              
               }
			temp1=temp1.next;
		}
		return head;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		node<Integer> head=swap.takeInput();
		swap.print(head);
		System.out.println("the ans is ");
		head=asd(head);
		swap.print(head);
	}

}

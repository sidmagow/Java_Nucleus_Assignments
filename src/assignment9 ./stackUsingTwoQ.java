package assignment9;

import LECTURE13.Queue;
import LECTURE13.QueueFullException;

public class stackUsingTwoQ {
  private Queue q1;
  private Queue q2;
 

     public stackUsingTwoQ(int size){
	  q1= new Queue(size);
	  q2= new Queue(size);
	 } 
     //push effiecient o(1)
     /*	 
  public void push(int element) throws QueueFullException{
	  q1.enqueue( element);
	  
  }
  public int pop() throws QueueFullException { 
	  while(q1.getSize()>1){
		  q2.enqueue(q1.dequeue());
	  }
	  int ans =q1.dequeue();
	  Queue temp;
	  temp=q2;
	  q2=q1;
	  q1=temp;
	  return ans ;
  }
	  */
	//pop effiecient
     
     public void push(int element) throws QueueFullException{
    	  if(q1.getSize()<1){
    		  q1.enqueue(element);
    		  
    	  }
    	  else{
    		  q1.enqueue(element);
    		  while(q1.getSize()>1){
    			  q2.enqueue(q1.dequeue());
    		  }
    	  while(q2.getSize()!=0){
    		  q1.enqueue(q2.dequeue());
    	  }
    	  }
     }
    
     public int pop(){
    	int ans =q1.dequeue();
    return ans;
    }
    
}

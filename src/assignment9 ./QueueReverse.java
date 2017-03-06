package assignment9;

import LECTURE13.Queue;
import LECTURE13.QueueFullException;

public class QueueReverse {
    public static void queueReverse(Queue q1) throws QueueFullException{
    	if(q1.getSize()<1){
    		return ;
    	}
    //	Queue temp = new Queue(4);
         int x= q1.dequeue();
    	queueReverse(q1);
    	q1.enqueue(x);
    
    }

public static void main(String[] args) throws QueueFullException {
	Queue q2=new Queue(4);
	q2.enqueue(1);
	q2.enqueue(2);
	q2.enqueue(3);
	q2.enqueue(4);
	
	
   
  queueReverse(q2);
     System.out.println("reverse");
     System.out.println(q2.dequeue()+" "+q2.dequeue()+" "+q2.dequeue()+" "+q2.dequeue()+" ");
}


}


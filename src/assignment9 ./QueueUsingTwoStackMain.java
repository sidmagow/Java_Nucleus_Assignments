package assignment9;

import Lecture12.StackEmpty;

public class QueueUsingTwoStackMain {

	public static void main(String[] args) throws StackEmpty {
		// TODO Auto-generated method stub
      QueueUsingTwoStacks q1= new QueueUsingTwoStacks();
     q1.enqueue(1);
   //   System.out.println(q1.dequeue());
     q1.enqueue(2);
    //  System.out.println(q1.dequeue());
      q1.enqueue(3);
   //   System.out.println(q1.dequeue());
      q1.enqueue(4);
   //   System.out.println(q1.dequeue());
 /*      q1.dequeue();
       q1.dequeue();
       q1.dequeue();
       q1.dequeue();
      */
      
      System.out.println(q1.dequeue()+" "+q1.dequeue()+" "+q1.dequeue()+" "+q1.dequeue()+" "); 
   
      
	}

}

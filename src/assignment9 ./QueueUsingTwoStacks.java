package assignment9;

import java.util.Stack;

import Lecture12.StackEmpty;
import Lecture12.StackUsingLL;
import assignment6.reverse;

public class QueueUsingTwoStacks {
   private  static StackUsingLL s1;
    private static StackUsingLL  s2;
    
    public  QueueUsingTwoStacks(){
    	s1=new StackUsingLL() ;
    	s2=new StackUsingLL();
    	
    }
    
    // enqueue effiecient
/*    public static void enqueue(int element){
    	s1.push(element);
    }
    public static int dequeue(){
    	while(s1.size()>1){
    		s2.push(s1.pop());
    	}
      int ans = s1.pop();
      while(s2.size()!=0){
    	  s1.push(s2.pop());
      }
    return ans ;
    } */
    
       //dequeue efficient

    
    public static int dequeue() throws StackEmpty{
    	int ans = s1.pop();
    	return ans;
    }
    
    
    public static void enqueue(int element) throws StackEmpty{
      if(s1.isEmpty()){
    	  s1.push(element);
      }
      else{
    	  while(!s1.isEmpty()) {
    		  s2.push(s1.pop());
    	  }
    	  s1.push(element);
    	  while(!s2.isEmpty()) {
    		  s1.push(s2.pop());
    	  }
    	  
    	  
    	  /*s1.push(element);
    	  while(s1.size()>1){
    		  s2.push(s1.pop());
    	  }
    	  int x = s1.pop();
    	  while(s2.size()!=0){
    		  s1.push(s2.pop());
    	  }
    	  s1.push(x);*/
    	  /*s1.push(element);
    	 s1= stackReverse.reverse(s1);*/
    	 
      }
    }
    
}

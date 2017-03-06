package assignment9;

import LECTURE13.QueueFullException;

public class stackTwoQMAin {

	public static void main(String[] args) throws QueueFullException {
		// TODO Auto-generated method stub
        stackUsingTwoQ s1= new stackUsingTwoQ(5);
        s1.push(0);
        s1.push(1);
        s1.push(2);
        s1.push(3);
        s1.push(4);
       System.out.println(s1.pop()+" "+ s1.pop()+" " +s1.pop()+" " +s1.pop()+" " +s1.pop());
      
	}

}

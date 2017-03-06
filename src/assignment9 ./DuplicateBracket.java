package assignment9;

import LECTURE13.QueueEmptyException;
import LECTURE13.QueueUsingLL;

public class DuplicateBracket {

	public static Boolean dupBrackets(String s) throws QueueEmptyException{
		QueueUsingLL<Character> q1= new QueueUsingLL<Character>();
		int countB=0;
		int countE=0;
		int i =0;
		while(i<s.length()){
			q1.enqueue(s.charAt(i));
		i++;
		}
		while(q1.size()!=0){
			if(q1.front()=='('){
				countB++;
				q1.dequeue();
			}
			else if(q1.front()=='+'||q1.front()=='-'||q1.front()=='*'||q1.front()=='/'){
				countE++;
				q1.dequeue();
			}
			else{
				q1.dequeue();
			}
			
		}
	if(countB>countE){
		return true;
	}
	else
		return false;
	
	}
	
	public static void main(String[] args) throws QueueEmptyException {
		// TODO Auto-generated method stub
      String s1 = "((a+b)+(c+d))";
      boolean ans =dupBrackets(s1);
      System.out.println(ans);
	}

}

package assignment9;

import java.util.Stack;

public class redundantBR {

	public static boolean checkRedundantBrackets(String input) {
		Stack<Character> s= new Stack<Character>();
		int countB=0;
		int countE=0;
		int i =0;
		while(i<input.length()){
			s.push(input.charAt(i));
		i++;
		}
		while(s.size()!=0){
			if(s.peek()==')'){
				countB++;
				s.pop();
			}
			
			else if(s.peek()=='+'||s.peek()=='-'||s.peek()=='*'||s.peek()=='/'){
				countE++;
				s.pop();
			}
			else{
				s.pop();
			}
			
		}
	if(countB>countE){
		return true;
	}
	else
		return false;

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "(a + (b*c)) * (d * ( f * j)) + (a + (b*c)) * (d * ( f * j)) + (a + (b*c)) * (d * ( f * j)) + (a + (b*c)) * (d * ( f * j())) + (a + (b*c)) * (d * ( f * j)) + (a + (b*c)) * (d * ( f * j)) + (a + (b*c)) * (d * ( (f * j))) + (a + (b*c)) * (d * ( f * j)) + (a + (b*c)) * (d * ( f * j)) + (a + (b*c)) * (d * ( f * j)) + (a + (b*c)) * (d * ( f * j)) + (a + (b*c)) * (d * ( f * j)) + (a + (b*c)) + (d * ( f * j)) + () ";
	      boolean ans =checkRedundantBrackets(s1);
	      System.out.println(ans);
	}

}

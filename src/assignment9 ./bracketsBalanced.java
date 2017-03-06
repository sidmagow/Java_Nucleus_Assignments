package assignment9;

import java.util.Scanner;

import Lecture12.StackEmpty;
import Lecture12.StackUsingLL;

public class bracketsBalanced {
   
	
	
	
	public static boolean brackets(String s) throws StackEmpty{
		StackUsingLL stack=new StackUsingLL();
			for(int i =0;i<s.length();i++){
				if(s.charAt(i)=='{')
					stack.push('}');
				else if(s.charAt(i)=='(')
					stack.push(')');
				else if(s.charAt(i)=='[')
					stack.push(']');
				else if(s.charAt(i)=='}'||s.charAt(i)==']'||s.charAt(i)==')'){
					int x=stack.pop();
					if(s.charAt(i)!=x){
						return false;
					}
					
				}
				else
					continue;
			
			}
			if(stack.isEmpty())
				return true;
			else
				return false;
	}
	 
	
	
	
	public static void main(String[] args) throws StackEmpty {
		// TODO Auto-generated method stub
            Scanner s =new Scanner(System.in);
            System.out.println("enter the String");
            String ss=s.nextLine();
            boolean ans = brackets(ss);
            System.out.println(ans);
	}

}

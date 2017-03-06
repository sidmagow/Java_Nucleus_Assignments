package assignment9;

import java.util.Scanner;
import java.util.Stack;

import Lecture12.StackEmpty;
import Lecture12.StackUsingLL;

public class stackReverse {

	
	public static void  reverse(StackUsingLL stack) throws StackEmpty{
		if(stack.size()<=1)
			return ;
		int x = stack.pop();
	     reverse(stack);
		StackUsingLL temp= new StackUsingLL();
		while(stack.size()!=0){
			temp.push(stack.pop());
		}
		stack.push(x);
		while(temp.size()!=0){
			stack.push(temp.pop());
		}
		//Stack<Integer> s1 = new Stack<>();
		
		
		/*
		for(int i =0;i<2 ;i++){
			int x =stack.pop();
		 
		StackUsingLL stack2=new StackUsingLL();
		while(!stack.isEmpty()){
			stack2.push(stack.pop());
		}
		stack.push(x);
		while(!stack2.isEmpty()){
		stack.push(stack2.pop());
	}
		}*/	//stack=reverse(stack);
    
	
	
	}
	
	
	public static void main(String[] args) throws StackEmpty {
		// TODO Auto-generated method stub

		StackUsingLL stack1= new StackUsingLL();
		stack1.push(1);
		stack1.push(2);
		stack1.push(3);
		stack1.push(4);
	    /*while(!stack1.isEmpty()){
			System.out.println(stack1.pop());
		}*/
	
		stack1=reverse(stack1);
		while(!stack1.isEmpty())
		{
			System.out.println(stack1.pop());
		}
	
	
	/*stack2=reverse(stack);
		
		while(!stack2.isEmpty()){
			System.out.println(stack2.pop());
		}*/
	/*	try {
			 stack1=reverse(stack);
				while(!stack1.isEmpty()){
					System.out.println(stack1.pop());
				}
		} catch (StackEmpty e) {
			// TODO Auto-generated catch block
			System.out.println("stack emppty");
		}*/
	
	}

}

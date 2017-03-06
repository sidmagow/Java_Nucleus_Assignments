package Lecture12;

import java.util.Scanner;

public class StackUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int data;
		StackUsingLL object= new StackUsingLL();
		for(int i =0;i<5;i++){
			//System.out.println("enter data");
			//data=s.nextInt();
			object.push(i);
		}
		int top;
	while(!object.isEmpty()){
			try {
				top=object.top();
				System.out.println(top);
			} catch (StackEmpty e) {
				// TODO Auto-generated catch block
				System.out.println("stack empty");
			}
				try {
					object.pop();
				} catch (StackEmpty e) {
					// TODO Auto-generated catch block
					System.out.println("stack empty");
				}
		}
	}

}

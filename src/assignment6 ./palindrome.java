package assignment6;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("enter the string");
Scanner s = new Scanner(System.in);
String input= s.next();
boolean ans= palindrome(input);
System.out.println(ans);
	}								

	public static boolean palindrome(String input){
		int n=input.length()-1;
		int a=0;

		if(input.length()==1)
			return true;

		if(input.charAt(0)!=input.charAt(n))
			return false;
		else
		{String s=input.substring(a+1, n);
		 boolean ans =palindrome(s);
		return ans;
		}


	}
}

package assignment6;

import java.util.Scanner;

public class pi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner s=new Scanner(System.in);
    String str;
    System.out.println("enter the string");
    str=s.next();
    String ans=pi(str);
	System.out.println(ans);
	}
public static String pi(String str ){
	if(str.equals("")||str.length()<2){
		return str;
	}
	if(str.charAt(0)=='p'&& str.charAt(1)=='i')
		return "3.14" + pi(str.substring(2));
	else
		return str.charAt(0) + pi(str.substring(1));
		
}
}

package assignment6;

import java.util.Scanner;

public class nox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the string");

		Scanner s = new Scanner(System.in);
		String str= s.next();
		String ans= nox(str);
		System.out.println(ans);
	}
	
	public static String nox(String str){
		if(str.length()==0)
			return "";
		if(str.charAt(0)=='x') {
			return nox(str.substring(1));
		}
//			return  str.replace("x", "") + nox(str.substring(1));
		else
			return str.charAt(0) + nox(str.substring(1));
 
	}
}

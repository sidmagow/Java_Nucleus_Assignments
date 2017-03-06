package assignment6;

import java.util.Scanner;

public class multiply {

	public static void main(String[] args) {
	int m,n;		
	Scanner s=new Scanner(System.in);
	System.out.println("enter m");
	m=s.nextInt();
	System.out.println("enter n");
	n=s.nextInt();
	int ans = multiply(m,n);
	System.out.println("ans is " + ans);
	}	
	public static int multiply(int m,int n ){
		if(n==1) 
			return m;
		int ans=multiply(m,n-1);
		return m+ans;
	}

}

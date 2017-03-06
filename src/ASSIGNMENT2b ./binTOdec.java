package ASSIGNMENT2b;

import java.util.Scanner;

public class binTOdec {

	public static void main(String[] args) {
		int n;
		int r=0;
		double c=0,d=0;
		System.out.println("enter the binary no");
		Scanner s= new Scanner(System.in);
		n=s.nextInt();
		while(n!=0){
			
			r=n%10;
			d=d+(r*Math.pow(2.0,c));
			c++;
			n=n/10;
			
			
			
		}
//		r=0;
//		while(c>=0){
//			r=n%10;
//			
//			c--;
//		}
		System.out.println("the decimal no is " + d);
	}

}

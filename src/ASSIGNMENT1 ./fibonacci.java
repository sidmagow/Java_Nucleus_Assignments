package ASSIGNMENT1;
import java.util.Scanner;

public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

  int n;
  System.out.println("enter n");
  Scanner s =  new Scanner(System.in);
  n = s.nextInt();
   
  fibonacci(n);

	}
	
	
	public static void fibonacci(int n){
		  int a =0;
		  int b =1;
		  System.out.print(a + " " + b + " ");
		  int c = 0;
		  while(c<n){
			 c=a+b;
			  System.out.print(c + " ");
			  
			  a=b;
			  b=c;
			  
		  }
	}

}

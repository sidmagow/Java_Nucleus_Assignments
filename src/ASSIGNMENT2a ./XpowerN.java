package ASSIGNMENT2a;
import java.util.Scanner;

public class XpowerN {
public static void main(String[] args) {
	int x,n;
	System.out.println("enter x");
	Scanner s= new Scanner(System.in);
	x=s.nextInt();
	System.out.println("enter the power");
	Scanner ss= new Scanner(System.in);
	n=ss.nextInt();
   int p=1,i=0;
   while(i<n){
	   p=p*x;
	   i++;
   }
System.out.println("the answer is " + p);

}
}

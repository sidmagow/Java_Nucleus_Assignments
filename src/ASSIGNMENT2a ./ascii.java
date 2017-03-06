package ASSIGNMENT2a;
import java.util.Scanner;

public class ascii {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   char c;
   int n;
   System.out.println("enter the character");
   Scanner s= new Scanner(System.in);
   c=s.next().charAt(0);
   if(c>='A' && c<='Z')
	   System.out.println("uppercase");
   else if(c>='a'&&c<='z')
System.out.println("lowercase");
   else
	   System.out.println("invalid character ");
	}

}

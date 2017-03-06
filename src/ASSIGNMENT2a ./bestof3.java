package ASSIGNMENT2a;
import java.util.Scanner;

public class bestof3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int n;
     int a;
     int b;
     String name;
     System.out.println("enter the name");
     Scanner ss= new Scanner(System.in);
     name=ss.next();
     System.out.println("enter the numbers out of 100");
     Scanner s = new Scanner(System.in);
     a=s.nextInt();
     int max=a;
     int min=a;
     int i=0;
     int max1=0;
     while(i<2){
    	 Scanner sm = new Scanner(System.in);
    	 b=sm.nextInt();
    	if(b>a)
    		max=b;
    	if(b<a)
    		min=b;
    	if(min<=b&& b<=max)
    		max1=b;
     i=i+1;
     
     }
    int avg=0;
    avg=(max+max1)/2;
    System.out.println("the average of the best two marks is    " + avg);
	
	
	
	}

}

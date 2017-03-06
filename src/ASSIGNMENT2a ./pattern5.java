package ASSIGNMENT2a;
import java.util.Scanner;

public class pattern5 {
public static void main(String[] args) {
	int n;
	Scanner s = new Scanner(System.in);
	n=s.nextInt();
	int row=1,i=1,val=0;
	while(row<=n){
		i=0;
		while(i<row){
			if(i==0||i==row-1)
			System.out.print(val);
		else
			System.out.print("0");
		
	i=i+1;
	
	}
	val=val+1;
	row=row+1;
	System.out.println();
	
	}		
}
}

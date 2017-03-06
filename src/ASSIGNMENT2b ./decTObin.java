package ASSIGNMENT2b;

import java.util.Scanner;

public class decTObin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int c=0;
int b[]= new int[10];
int d=0;
Scanner s = new Scanner(System.in);
System.out.println("enter the no");
d=s.nextInt();
while(d>0){
	b[c++]=d%2;
	d=d/2;
	
}
for(int i=c-1;i>=0;i--){
	System.out.print(b[i]);
}
	}

}

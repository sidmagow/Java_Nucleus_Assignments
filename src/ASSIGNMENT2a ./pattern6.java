package ASSIGNMENT2a;

public class pattern6 {
public static void main(String[] args) {
	int n =9;
	int row=1;
	int i=0;
	while(row<=5){
		i=0;
	if(row%2==0){
		while(i<row){
			if(i%2==0)
				System.out.print(" ");
			else
				System.out.print("*");
			i=i+1;
		}
	}
		else{
			while(i<row){
				if(i%2==0)
					System.out.print("*");
				else
					System.out.print(" ");
				i=i+1;
			}
		}
			
	
	row=row+1;
	
	System.out.println();
	
	
	}
	
}
}

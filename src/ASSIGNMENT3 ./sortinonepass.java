package ASSIGNMENT3;

import java.util.Scanner;

public class sortinonepass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner s =new Scanner(System.in);
	//	n=s.nextInt();
		int a[]={1,0,0,0,1,1};
	    sortInOnePass(a);
	    
	}
//best case o(n)	
	public static void sortInOnePass(int arr[]){
		  for(int i=0,j=arr.length-1;i<j;){
			 if(arr[i]==0)
				 i++;
			 else if(arr[j]==1)
				 j--;
			 //(arr[i]==1&&arr[j]==0)
			 else
			 { int temp=arr[i];
				  arr[i]=arr[j];
				  arr[j]=temp;
			 i++;j--;
			 }
				
		  }
		  for(int k=0;k<arr.length;k++){
				System.out.println(arr[k]);
			}
	
	
	
	}

}

package ASSIGNMENT3;

import java.util.Scanner;

public class sortinoone012 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	// TODO Auto-generated method stub
	int n;
	Scanner s =new Scanner(System.in);
//	n=s.nextInt();
	int a[]={0,1,2,1,2};
    sort012(a);
    
}
//best case o(n)	
public static void sort012(int arr[]){
	int next0 = 0, next2 = arr.length-1;
	  for(int i=0;i<next2;){
		 if(arr[i]==0) {
			 int temp = arr[next0];
			 arr[next0] = arr[i];
			 arr[i] = temp;
			 i++;
			 next0++;
		 }
		 else if(arr[i]==2) {
			 int temp = arr[next2];
			 arr[next2] = arr[i];
			 arr[i] = temp;
			 next2--;
		 }
		 else {
			 i++;
		 }
			
	  }
	  for(int k=0;k<arr.length;k++){
			System.out.println(arr[k]);
		}



}
}

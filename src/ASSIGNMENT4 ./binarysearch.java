package ASSIGNMENT4;

import java.util.Scanner;

public class binarysearch {
	public static void main(String[] args) {
		int a[] = { 1,2,3,4,23};
		int n=a.length;

		Scanner s= new Scanner(System.in);
		System.out.println("enter the element to be searched");
		int m=s.nextInt();
		int  ans=binary(m,a);
		if(ans!=-1)
		System.out.println("element found at" + ans);
		else
			System.out.println("element not found");
	}	

	public static int binary(int num,int[] arr){
		int start =0;
		int last = arr.length-1;
int pos =0;
		int flag=0;
		while(start<=last){
			int mid=(start+last)/2;
			if(num==arr[mid])
			{ 
				flag=1;
				pos =mid;
				break;
			}
			else if(num<arr[mid])
				last=mid-1;
			else
				start=mid+1;
		}
		if(flag==1)
			return pos;
		else
			return -1;
	}
}

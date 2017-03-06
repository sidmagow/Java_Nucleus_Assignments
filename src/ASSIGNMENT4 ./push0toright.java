package ASSIGNMENT4;

import java.util.Scanner;

public class push0toright {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int f;
		
	/*	System.out.println("no of elements");
		Scanner s= new Scanner(System.in);
		f=s.nextInt();
		int a[]=new int[f];
		System.out.println("enter the array");
		for(int i =0;i<a.length;i++){
			a[i]=s.nextInt();
			
		}*/
		
		int a[] = {1,9,8,4,0,0,2,7,0,6,0};
		pushZerosAtEnd(a);
		for(int i =0;i<a.length;i++){
			System.out.print(a[i]);
		}
	}

//o(n2)
	public static void push0(int arr[]){
		int n=arr.length;
		int pos=0;
		int temp;
		for(int i=0;i<n;i++){
			if(arr[i]==0)
			{
				for(int j=i+1;j<n;j++){
					if(arr[j]!=0){
						temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					break;
					}
				
				}
			}
		}
	System.out.println("the array is ");
		for(int i=0;i<n;i++){
		System.out.print(arr[i]);
	}
	

	/*
	public static void push0(int a[]){
	for(int i =0,j=;i;){
		if(a[j]==0)
			j--;
		if(a[i]!=0)
			i++;
		if(a[i]==0&&a[j]!=0)
	}
	
	*/
		
	
	}
	public static void pushZerosAtEnd(int[] arr){
		int n=arr.length;
		int[] array= new int[n];
		int k=0;
		int m=0;
		for(int i=0;i<n;i++){
			if(arr[i]!=0){
				array[k++]=arr[i];
			}
		}
		for(int i =0;i<n;i++){
			arr[m++]=array[i];
		}
	}


}

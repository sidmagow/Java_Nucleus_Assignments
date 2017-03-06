package ASSIGNMENT3;

import java.util.Scanner;

public class triplets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input[]=acceptarray();
		
		Scanner ss=new Scanner(System.in);
		
		int c[]=mergesort(input);
		System.out.println("the sorted array is ");
		printarray(c);
		System.out.println("enter x");
		int x=ss.nextInt();
		tripletSum(c,x);
	}

	public static void printarray(int a[]){
		System.out.println("the array is ");
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
	}
	public static int[] acceptarray(){
		System.out.println("enter size");
		Scanner s =new Scanner(System.in);
		int n=s.nextInt();
		System.out.println("enter the elements");
		int a[] =new int[n];
		for(int i =0;i<a.length;i++){
			a[i]=s.nextInt();
		}
		return a;

	}
	//worst solution o(n3)
	/*	public static void triplet(int a[],int x)
	{
		int pos=0;
		for(int k=0;k<a.length;k++){
			for(int i =0;i<a.length;i++){
				for(int j=i+1;j<a.length;j++){
					if(a[i]+a[j]+a[k]==x)
						System.out.println("("+a[i]+","+a[j]+","+a[k]+")");
				}

			}
		}
	}
}*/

	//better solution o(n2) . first sorting and then pair concept
	public static void tripletSum(int arr[],int num){
		for(int k=0;k<arr.length;k++){
			for(int i=0,j=arr.length-1;i<j;){
				if(arr[i]+arr[j]==num-arr[k])
				{ System.out.println("("+arr[i]+","+arr[j]+","+arr[k]+")");
				   i++;j--;
				}
				else if(arr[i]+arr[j]>num-arr[k])
					j--;
				else
					i++;
			}
		}
	}
//merge sorting 
	public static int[] merge(int[] a,int[] b){
		int i=0,j=0,k=0;

		int c[]=new int[a.length+b.length];
		while( i<a.length && j<b.length){
			if(a[i]<b[j]){
				c[k]=a[i];
				i++;
				k++;
			}
			else{
				c[k]=b[j];
				j++;
				k++;
			}
		}

		if(i==a.length){
			while(j<b.length){
				c[k++]=b[j++];
			}
		}
		if(j==b.length){
			while(i<a.length){
				c[k++]=a[i++];
			}
		}
		return c;
	}

	public static int[] mergesort(int[] input){
		if(input.length<=1){
//			int output[]={};
			return input;

		}
		int a[]=new int[input.length/2];
		int b[]= new int[input.length-a.length];
		for(int i=0;i<a.length;i++){
			a[i]=input[i];

		}
		int k=0;
		for(int j=a.length;j<input.length;j++){
			b[k]=input[j];
			k++;
		}

		int al[]= mergesort(a);
		int bl[]=mergesort(b);

		int cl[]=new int[al.length+bl.length]; 
		cl=merge(al,bl);
		return cl;



	}






}
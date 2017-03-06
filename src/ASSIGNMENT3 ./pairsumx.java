package ASSIGNMENT3;

import java.util.Scanner;

public class pairsumx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input[]=acceptarray();
		printarray(input);
		Scanner ss=new Scanner(System.in);
		System.out.println("enter x");
		int x=ss.nextInt();
		long t1=System.currentTimeMillis();
		pair(input,x);
		long t2=System.currentTimeMillis();
		long time = t2-t1;
		System.out.println("the time taken is :" + time);
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
	
	
	//naive solution o(n2)
	public static void pair(int a[],int x){
		int pos=0;
		for(int i =0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				if(a[i]+a[j]==x)
					System.out.println("("+a[i]+","+a[j]+")");
			}
			
		}
	}
//better case o(nlogn)
/*	public static void pair(int a[],int x){
		for(int i =0,j=a.length-1;i<j;)
		{
			if(a[i]+a[j]==x)
			{
				
				System.out.println("("+a[i]+","+a[j]+")");
				i++;j--;
			}
			else if((a[i]+a[j])>x)
			j--;
			else
				i++;
		}
	}
	
	*/
}

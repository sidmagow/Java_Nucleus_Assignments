package ASSIGNMENT3;

import java.util.Scanner;

public class reversearray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int[] input=acceptarray();
      printarray(input);
      System.out.println("reverse is ");
      reverse(input);
      printarray(input);
	}
  //best case o(n)
	public static void reverse(int a[]){
    	int temp=0;
    	for(int i=0,j=a.length-1;i<a.length/2;i++,j--){
    		temp=a[i];
    		a[i]=a[j];
    		a[j]=temp;
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
    public static void printarray(int a[]){
		System.out.println("the array is ");
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
	}
    
    
}   

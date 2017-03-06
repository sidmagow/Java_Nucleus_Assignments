package ASSIGNMENT3;

import java.util.Arrays;

public class duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={1,1,3,3,2,2,4,4,5};
//	Arrays.sort(a);
/*	for(int i=0;i<a.length;i++){
		
	
		System.out.println(a[i]);
		
	
	}*/
   int x= xxx(a);
	System.out.println(x);
	}
	//o(n2)
	/*public static void xxx(int a[]){
		boolean isdup=false;
		for(int i=0;i<a.length-1;i++){
			if(isdup==false){
				for(int j=i+1;j<=a.length-1;j++){
				if(a[i]==a[j])
				{	isdup=true;
					break;
				}
			}
			if(isdup==true)
				isdup=false;
			else
				{System.out.println(a[i]);
				isdup=true;
				}
			}
		}
	}*/
	//better case o(nlogn)       
	public static int xxx(int arr[]){
		Arrays.sort(arr);
		for(int i =0;i<=arr.length-1;){
			if(i==arr.length-1){
				//System.out.println(arr[i]);
				return arr[i];
			}
			
			else if(arr[i]==arr[i+1]){
				i=i+2;
			}
			else 
			{//System.out.println(arr[i]);
			return arr[i];}
			
				
				
			
		}
		return -1;
	}
	//best case o(n)
	/*public static int xxx(int arr[]){
	    int ans=0;
		for(int i =0;i<arr.length;i++){
		ans = ans^arr[i];	
		}

     return ans;

	}*/
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

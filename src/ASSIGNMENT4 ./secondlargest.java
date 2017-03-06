package ASSIGNMENT4;

import java.util.Arrays;

public class secondlargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={17,17,1,13 ,12,13,15,12,12,3, 1 ,1,5, 7 ,13,1,178,156};
		int x=secondLargestElement(a);
		System.out.println(x);
	}

	public static int secondLargestElement(int[] arr) {
		//write your code here
		int max=arr[0],min=arr[0];
		for(int i=1;i<arr.length;i++){
			if(max<arr[i]||max==arr[i])
				max=arr[i];
			if(min>arr[i])
				min=arr[i];

		}
		int max2=min;
		System.out.println(max+" "+min);
		for(int i=0;i<arr.length;i++){
			if(arr[i]==max){
				continue;
			}
			else
			{
				if(max2<arr[i] )
					max2=arr[i];	
			}
		}
		//System.out.println("the second largest is" +  max2);
		return max2;
	}

	/*public static int secondLargestElement(int[] arr){
		Arrays.sort(arr);
	int n =arr.length;
	for(int i=0;i<n;i++){
		for(int j )
	}


	}
	 */

}

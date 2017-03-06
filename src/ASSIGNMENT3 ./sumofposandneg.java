package ASSIGNMENT3;

public class sumofposandneg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int[] arr={1, 3, -3, 4, -2, 3, -4, -5, 4};
	   sumPositiveNegative(arr);
	}
	public static void sumPositiveNegative(int[] arr){
		//write your code here
		int posSum=0;
		int negSum=0;
		for(int i =0;i<arr.length;i++){
			if(arr[i]>0){
				posSum=posSum+arr[i];
			}
			else
				negSum =negSum+arr[i];
		}
	
		System.out.println(posSum);
		System.out.println(negSum);
		
	}

}

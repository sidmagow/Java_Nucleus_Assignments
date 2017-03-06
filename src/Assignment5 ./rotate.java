package Assignment5;

public class rotate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={5, 6, 1 ,2 ,3 ,4};
System.out.println("the answer is ");
int ans =rotate(arr);
	System.out.println(ans);
	}

	public static int rotate(int[] arr){
		int n=arr.length;
		int start= 0;
		int end = n-1;
		while(start<end){
			int mid = (start+end)/2;
			if(arr[mid]>arr[mid+1])
			{
				return mid+1;

			}
			else if(arr[mid]<arr[start]){
				end=mid-1;
			
			}
			else
				start=mid+1;


		}
	return -1;
	}

}

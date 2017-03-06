package ASSIGNMENT4;

public class rotate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={1,2,3,4,5,6,7};
		 int x=8;
		 arr(arr,x);
		System.out.println("the array is");
       for(int i=0;i<arr.length;i++){
    	   System.out.println(arr[i]);
       }
      
	}
// using an array 	time - o(n) space o(d)
/*	public static int[] arr(int[] arr,int index){
		int n=arr.length;
		int s[]= new int[n];
		for(int i=1;i<=n-index;i++ ){
			s[i-1]=arr[0];
			arr[i-1]=arr[i];
			
			}
	return arr;
	}*/
	//using a single element time o(n*d) space o(1)
	
//best solution time o(n) and space o(1)	
	
	public static void arr(int[] arr,int index){
	 int temp=0;
		for(int i =0,j=arr.length-1;i<j;i++,j--){
		   temp=arr[i];
		   arr[i]=arr[j];
		   arr[j]=temp;
	   }
		int vemp=0;
		for(int k=arr.length-index,l=arr.length-1;k<l;k++,l--){
			vemp=arr[k];
			arr[k]=arr[l];
			arr[l]=vemp;
		}
		int remp=0;
		for(int k=0,l=arr.length-index-1;k<l;k++,l--){
		  remp=arr[k];
			arr[k]=arr[l];
			arr[l]=remp;
		}

		
	
	}
	
}

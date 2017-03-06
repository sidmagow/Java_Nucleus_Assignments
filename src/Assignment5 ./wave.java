package Assignment5;

public class wave {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int [] a ={718, 17, 751, 885, 936, 902, 829, 820, 713, 270};
		 waveSort(a);
     System.out.println("the answer is ");
		/*for(int i =0;i<ans.length;i++){
    	 System.out.println(ans[i]);
     }*/
	}
	
	public static void waveSort(int arr[]){
		int temp=0;
		int t=0;
		for(int i =1;i<arr.length-1;){
			if(arr[i]<arr[i-1]&&arr[i]<arr[i+1]){
				i=i+2;
			}
			else
			{	if(arr[i]>arr[i-1])
			{temp=arr[i];
			arr[i]=arr[i-1];
			arr[i-1]=temp;
			}	
			else{
				t=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=t;
			}
				i=i+2;
			}	
		}
	for(int i =0;i<arr.length;i++){
		System.out.print(arr[i]+" ");
	}
	
	}
	

}

package ASSIGNMENT3;

public class equilibriumIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]={-7 ,1, 5, 2, -4, 3, 0};
	int x=arrayEquilibrium(arr);
	System.out.println(x);
	}
	public static int arrayEquilibrium(int[] arr){  
		//write your code here
		
		for(int i =0;i<arr.length;i++){
			int x=0;
			int y=0;
			if(i==0||i==arr.length-1)
			  continue;
		  
		  for(int j =0;j<i;j++){
			  x=x+arr[j];
		  }
		  for(int k =i+1;k<arr.length;k++){
			  y=y+arr[k];
		  }
		if(x==y){
			return i;
		}
		}
		
	return -1;
	}
}

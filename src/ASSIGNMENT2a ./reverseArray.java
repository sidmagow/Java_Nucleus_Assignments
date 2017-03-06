package ASSIGNMENT2a;

public class reverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int temp;int a[]={1,2,3,4,5};
       for(int i =0;i<(a.length)/2;i++){
    	 int n=a.length;
    	 temp=a[i];
    	 a[i]=a[n-i-1];
    	 a[n-i-1]=temp;
       
       }
	 for(int i=0;i<a.length;i++){
		 System.out.println(a[i]);
	 }
	}

}

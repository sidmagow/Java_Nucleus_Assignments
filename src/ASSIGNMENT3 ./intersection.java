package ASSIGNMENT3;

import java.util.Arrays;

public class intersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a ={1,2,2};
		int[] b = {1,2};
		int[] ans =arr(a,b);
		for(int i =0;i<ans.length;i++){
			System.out.println(ans[i]);
		}
	}
  public static int[] arr(int a[],int b[]){
	  int k=0;
	  int size = 0;
	  if(a.length < b.length) {
		  size = a.length;
	  }
	  else 
		  size = b.length;
	  
	  int c[] =  new int[size];
	  int count = 0;
//best case o(n)	  
	  for(int i =0;i<a.length;i++){
		  for(int j=0;j<b.length;j++){
			  if(a[i]==b[j]) {
			c[k++]=a[i];
			count++;
			  }
		  }
	  }
	  /*System.out.println("the ans is");
	  for(int i=0;i<c.length;i++)
		  System.out.println(c[i]);*/
	  
	  int ans[] = new int[count];
	  for(int i = 0; i < count; i++) {
		  ans[i] = c[i];
	  }
	  return ans;
  }
}

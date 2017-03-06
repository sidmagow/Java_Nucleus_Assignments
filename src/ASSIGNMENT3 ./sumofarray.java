package ASSIGNMENT3;

public class sumofarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int carry =0;
		int a[]={1,2,3,4};
		int b[]={8,6,7,8};
		int[] c=sumOfArray(a, b);
	for(int i=0;i<c.length;i++){
		System.out.println( c[i]);
	}
	}


public static int[] sumOfArray(int a[],int b[]){
	int i=a.length-1;
	int j=b.length-1;
	int n=a.length;
	int c[]=new int[n+1];
	int k=c.length-1;
	int carry =0;
	while(i>=0&&j>=0){
		/*if(i==0||j==0){
			int temp=a[i]+b[j]+carry;
			c[k]=temp%10;
			c[k-1]=temp/10;
		}*/
		if(a.length==b.length)
		{int temp=a[i]+b[j]+carry;
		c[k]=temp%10;
		carry=temp/10;
		k--;
		j--;
		i--;
		}
		else if(a.length>b.length)
		{
			int temp=a[i]+carry;
			c[k]=temp%10;
			carry=temp/10;
			k--;
			i--;
		}
		else{
			int temp=b[j]+carry;
			c[k]=temp%10;
			carry=temp/10;
			k--;
			j--;
		}
			
	}
	return c;
}

}

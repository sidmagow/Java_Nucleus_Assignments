package ASSIGNMENT4;

public class zeroSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={1,3,-1,-2};
		boolean ans =subarray(a);
		System.out.println(ans);
	}
	//since consecutive elements so sorting cannot be done 
	//disturbs the order 
	//o(n2) best
	public static boolean subarray(int a[]){
		int sum =0;
//		int flag=0;
		int s=0;
		for(int i =0;i<a.length;i++){
			s=0;
			s= s+a[i];
			for(int j=i+1;j<a.length;j++){
				sum=sum+a[j]; 
				if(sum==0)
				{
					return true;

				}
			}

		}

		return false;
	}
}

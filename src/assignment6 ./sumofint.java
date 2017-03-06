package assignment6;

public class sumofint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int n=12345;
   int s=sum(n);
   System.out.println("sum is "+ s);
	}
	public static int sum(int n){
		if(n==0)
			return 0;
		int ans =sum(n/10);
		return (n%10)+ans;
	}

}

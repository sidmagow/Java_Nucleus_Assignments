package assignment6;

import java.util.Scanner;

public class countzeroes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println("enter the number");
       Scanner s = new Scanner(System.in);
       int num= s.nextInt();
       int ans = zerocount(num);
       System.out.println(ans);
	}
	
	public static int zerocount(int num){
		if(num==0)
			return 0;
		if(num%10==0){
			int ans=1+zerocount(num/10);
		  return ans;
		}
		else
			{int a ;
		      return zerocount(num/10);
			}
		
	}

}

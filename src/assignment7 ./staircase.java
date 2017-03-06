package assignment7;

import java.util.Scanner;

public class staircase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println("enter no of stairs");
      Scanner s =new Scanner(System.in);
      int m=s.nextInt();
      int ans=findWays(m);
      System.out.println(ans);
	}
	
	public static int findWays(int n){
		if(n==1){
			return 1;
		}
		if(n==2){
			return 2;
			
		}
		if(n==3){
			return 4;
		}
		return findWays(n-1)+findWays(n-2)+findWays(n-3);
		
		
	}

}

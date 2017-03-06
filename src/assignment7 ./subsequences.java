package assignment7;

import java.util.Scanner;

public class subsequences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the string");
		Scanner s=new Scanner(System.in);
		String input=s.next();
		String[] ans=subsequences(input);
	for(int i=0;i<ans.length;i++){
		System.out.println(ans[i]);
	}
	}
	public static String[] subsequences(String input ){
		if(input.length()<1)
		{String[] ans = {""};
		return ans;

		}
		String[] smallans=subsequences(input.substring(1));
		String[] ans =new String[smallans.length*2];
		int j=0;
		for(int i=0;i<smallans.length;i++){
			ans[j]=smallans[i];
			j++;
		}
		for(int i=0;i<smallans.length;i++){
			ans[j]=input.charAt(0)+smallans[i];
			j++;
		}
		return ans;
	}
}

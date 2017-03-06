package assignment7;

import java.util.Scanner;

public class subsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		System.out.println("enter the string");
		Scanner s=new Scanner(System.in);
		String input=s.next();
		printSubsequences(input);
	
	}
	public static void printSubsequences(String input) {
		// Write your code here
        String[] ss = subsequence(input);
        for(int i =0;i<ss.length;i++){
            System.out.println(ss[i]);
        }
	}
    public static String[] subsequence(String d ){
        if(d.length()<1)
		{String[] ans = {""};
		return ans;

		}
		String[] smallans=subsequence(d.substring(1));
		String[] ans =new String[smallans.length*2];
		int j=0;
		for(int i=0;i<smallans.length;i++){
			ans[j]=smallans[i];
			j++;
		}
		for(int i=0;i<smallans.length;i++){
			ans[j]=d.charAt(0)+smallans[i];
			j++;
		}
		return ans;
	}
}

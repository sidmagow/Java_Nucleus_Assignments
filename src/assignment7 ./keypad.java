package assignment7;

import java.util.Scanner;

public class keypad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the number");
		Scanner s =new Scanner(System.in);
		int n=s.nextInt();
		printKeypad(n);
		/*for(int i =0;i<ss.length;i++){
			System.out.println(ss[i]);
		}*/
	}

	public static String[] helper(int a){
		if(a==2){
			String[] s= {"a","b","c"};
			return s;
		}
		if(a==3){

			String[] s ={"d","e","f"};
			return s;
		}
		if(a==4){
			String[] s={"g","h","i"};
			return s;
		}
		if(a==5){
			String[] s={"j","k","l"};
			return s;

		}
		if(a==6){
			String[] s={"m","n","o"};
			return s;
		}
		if(a==7){
			String[] s={"p","q","r","s"};
			return s;}
		if(a==8){
			String[] s ={"t","u","v"};
			return s;}
		if(a==9){
			String[] s={"w","x","y","z"};
			return s;
		}

 return null;
	}
	
	public static void printKeypad(int input){
		// Write your code here
		String[] s=keypad(input);
		for(int i =0;i<s.length;i++){
			System.out.println(s[i]);
		}
	}
	
	public static String[] keypad(int n){
		if(n<10)
		{String[] f = helper(n);
		return f;
		}
		
		String[] str=helper(n%10);
		String[] smallans= keypad(n/10);
		String output[] = new String[smallans.length*str.length];
		int k=0;
		for(int i =0;i<smallans.length;i++){
			for(int j=0;j<str.length;j++){
				output[k++]=smallans[i]+str[j];
			}
		}
	
		return output;
	}
	
	
}


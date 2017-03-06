package assignment6;

import java.util.Scanner;

public class reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println("enter the strings");
      Scanner s=new Scanner(System.in);
      String str,ftr;
      str=s.next();
      ftr=s.next();
      boolean ans = reverse(str,ftr);
      System.out.println(ans);
	}
public static boolean reverse(String str,String ftr){
	int a=0;
	int n=str.length()-1;
	int nf=ftr.length()-1;
	if(str.length()==0||ftr.length()==0)
		return true;
	if(str.charAt(0)!=ftr.charAt(nf))
		return false;
	if(str.length()!=ftr.length())
		return false;
	else
		return reverse(str.substring(1),ftr.substring(0, nf));
}
}

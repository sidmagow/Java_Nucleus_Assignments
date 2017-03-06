package assignment6;

public class towerOfHanoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c=towerOfHanoi(3, "A", "B", "c");
	System.out.println(c);
	}
	public static int towerOfHanoi(int n,String s,String d ,String e){
	int c=0;
		if(n==1) { 
			//System.out.println(s+ " -> " + d);
		
			return 1;
		}
	    c++;
		int f=	towerOfHanoi(n-1,s,e,d)+c;
	//	System.out.println(s + " -> " + d);
		
		int g=towerOfHanoi(n-1, e, d, s)+1;
	return f+g;
	}
}

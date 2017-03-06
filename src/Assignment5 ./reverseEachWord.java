package Assignment5;

public class reverseEachWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String ss = "Welcome to coding ninjas";
			System.out.println("the string is "+ ss);	
		    System.out.println("the ans is");
		     String s = reverseEachWord(ss);
			System.out.println(s);
	}
	public static String reverseEachWord(String s){
	int pos=0;
//		char temp;
		int start = 0;
		String ans = "";
		for(int i=0;i<s.length();i++){
			if(s.charAt(i) != ' ') {
				pos=i;
				continue;
			
			}
			for(int j=i-1;j>=start;j--){
				ans += s.charAt(j);
				
			}
			ans =ans+ " ";
			start = i+1;
	
		
		}
		ans =ans+ " ";
		for(int k =pos;k>=start;k-- ){
			ans +=s.charAt(k);
		}
		
		
	return ans;		
	}

}


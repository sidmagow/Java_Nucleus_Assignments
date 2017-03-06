package Assignment5;

public class reverseFull {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String ss = "Welcome to coding ninjas";
			System.out.println("the string is "+ ss);	
		    System.out.println("the ans is");
		     String s = reverse(ss);
			System.out.println(s);
	}
	
	public static String reverse(String s){
		String ans1 = "";
		for(int i =s.length()-1;i>=0;i--){
			ans1+=s.charAt(i);
			
		}
		
		int pos=0;
//		char temp;
		int start = 0;
		String ans = "";
		for(int i=0;i<ans1.length();i++){
			if(ans1.charAt(i) != ' ') {
				pos=i;
				continue;
			
			}
			for(int j=i-1;j>=start;j--){
				ans += ans1.charAt(j);
				
			}
			ans =ans+ " ";
			start = i+1;
	
		
		}
		ans =ans+ " ";
		for(int k =pos;k>=start;k-- ){
			ans +=ans1.charAt(k);
		}
		
		
	return ans;		
		
		
		
		
		
		
		
     }

}

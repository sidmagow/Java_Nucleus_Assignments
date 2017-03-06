package Assignment5;

public class minimumLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String ss = "Welcome to coding ninjas";
			System.out.println("the string is "+ ss);	
		    System.out.println("the ans is");
		     String s = minlength(ss);
			System.out.println(s);
	}
	
	public static String minlength(String s){
		int count=0;
		int c=0;
		int start=0;
		String ans = "";
		for(int i =0;i<s.length();i++){
			 c++;
			if(s.charAt(i)!=' ')
			  continue;
			else
				for(int j= 0;j<i;j++){
				
		
				}
	   	
			 if(c>count){
				 count=c;
				ans ="";
				 for(int k= start;k<i;k++){
					 ans+=s.charAt(k);
					 start=i+1;
				 } 
			 }
			
		}
	
	return ans;
	}

}

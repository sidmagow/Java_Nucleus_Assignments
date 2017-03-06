package Assignment5;

public class stringcompression {
	public static void main(String[] args) {
		String s= "aaabbccdss";
		System.out.println("start");
		String g=stringcomp(s);
		System.out.println("done");
		
		
		System.out.println("the ans i s"+ " " + g);	
		
	}
	public static String stringcomp(String s){
		for(int i =0;i<s.length()-1;){
			int c=1;
			for(int j=i+1;j<s.length();j++){
				if(s.charAt(i)==s.charAt(j))
				{	c++;
				s=s.substring(0, i+1)+c+s.substring(i+c);
				}else
					
					break;
			}
			
			i=i+2;
		}
		return s;
	}
}

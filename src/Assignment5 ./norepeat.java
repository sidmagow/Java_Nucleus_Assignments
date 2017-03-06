package Assignment5;

public class norepeat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String ss= "aabccba";
    String s =norepeat(ss);
    System.out.println(s);
	}
	//best case o(n)
	public static String norepeat(String s){
	int c=0;
		for(int i =0;i<s.length()-1;){
			if(s.charAt(i)==s.charAt(i+1)){
				c++;
				s= s.substring(0, i+1)+s.substring(i+2);
			  //  System.out.println(s);
			}
			else
				{
						i=i+2;
				 
				}
		}

		
			return s;
	}

}

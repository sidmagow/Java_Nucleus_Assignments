package Assignment5;

public class highestoccurchar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s ="aaabbbbc";
		maxchar(s);
	}
	public static void  maxchar(String s){
		int count =0;
		char temp=' ';
		for(int i =0;i<s.length();i++){
			int c=1;
			temp = s.charAt(i);
			for(int j=0;j<s.length();j++){
				if(i!= j && s.charAt(i)==s.charAt(j))
					c++;
			}
			if(c>count){
				count = c;
				temp = s.charAt(i); 
			}
		}
		System.out.println(temp);
	}
}

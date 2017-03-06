package assignment6;

public class duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String input = "hello";
        String ans=duplicate(input);
        System.out.println(ans);
	}
	
	public static String duplicate(String input){
		if(input.length()==0)
			return "";
		
		
		if(input.charAt(0)==input.charAt(1))
			return input.charAt(0)+"*"+input.charAt(1)+duplicate(input.substring(2));
		else
			return input.charAt(0)+input.charAt(1)+duplicate(input.substring(2));
	}


// best solution 
	//is to create an array of 26 elements and have elements as per their index.initially every value in array is 0,whenever 
// an occurence is found the element in the array for that element(index) is incremented.


}

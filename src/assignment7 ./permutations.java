package assignment7;

public class permutations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s ="abc";
String ss="acbq";
		boolean a=ans(s,ss);
		/*for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}*/
		System.out.println(a);

	}
	public static String[] permutation(String input){
		int n=input.length();
		if(input.length()==0){
			String[] a={""};
			return a;
		}
		int m  = fact(n);
		String[] output = new String[m];
		int k=0;
		for(int j=0;j<n; j++) {
			//String input = s.substring(0, j)+s.substring(j+1);
			String[] temp = permutation(input.substring(0, j)+input.substring(j+1)); 
			
			for(int i =0;i<temp.length;i++){
				output[k++]=input.charAt(j) + temp[i];
			}
			
			
		}
	return output;
	}
	public static boolean ans(String in,String x){
		String[] temp=permutation(in);
		for(int i=0;i<temp.length;i++){
			if(temp[i].equals(x)){
				return true;
			}
		}
		return false;
		
	}

	public static int fact(int n){
		if(n==0)
			return 1;
		int ans =fact(n-1);
		return ans*n;
	}

}

package Assignment5;

public class sortstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a[] = {"ab","bc","cde","efgh","ij"};
		String s[]=sort(a);
		System.out.println("the ans is ");
	for(int i=0;i<s.length;i++){
		System.out.print(s[i]+ "," + " ");
	}
	}
      public static String[] sort(String[] a){
    	  String temp="";
    	  for(int i=1;i<a.length;i++){
    		  for(int j=i;j>0;j--){
    			  if(a[j].length()<a[j-1].length()){
    				  temp=a[j];
    				  a[j]=a[j-1];
    				  a[j-1]=temp;
    			  }
    		  }
    	  }
    	  return a;
      }
}

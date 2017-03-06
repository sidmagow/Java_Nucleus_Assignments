package assignment7;

public class merging {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int input[]={2,3,4,1,22,0,11};
//		int c[] =new int[d.length];
		mergesort(input);
		System.out.println("done");
		for(int i=0;i<input.length;i++){
			System.out.println(input[i]);
		}
	}
	public static int[] merge(int[] a,int[] b){
		int i=0,j=0,k=0;

		int c[]=new int[a.length+b.length];
		while( i<a.length && j<b.length){
			if(a[i]<b[j]){
				c[k]=a[i];
				i++;
				k++;
			}
			else{
				c[k]=b[j];
				j++;
				k++;
			}
		}

		if(i==a.length){
			while(j<b.length){
				c[k++]=b[j++];
			}
		}
		if(j==b.length){
			while(i<a.length){
				c[k++]=a[i++];
			}
		}
		return c;
	}

	public static void mergesort(int[] input){
		if(input.length<=1){
//			int output[]={};
		/*	for(int i =0;i<input.length;i++){
				System.out.println(input.length);
			}
		*/	return ;

		}
		int a[]=new int[input.length/2];
		int b[]= new int[input.length-a.length];
		for(int i=0;i<a.length;i++){
			a[i]=input[i];

		}
		int k=0;
		for(int j=a.length;j<input.length;j++){
			b[k]=input[j];
			k++;
		}

		 mergesort(a);
		mergesort(b);

		int cl[]=new int[a.length+b.length]; 
		cl=merge(a,b);
		int m=0;
		for(int j=0;j<cl.length;j++){
			input[m++]=cl[j];
		}



	}


}

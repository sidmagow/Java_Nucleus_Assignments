package assignment13;

import java.util.HashMap;

public class diff {

	public static void difference(int[] a, int k){
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i =0;i<a.length;i++){
			map.put(a[i], 1);
		}
		for(int i =1;i<a.length;i++){
			int value= a[i]+k;
			if(map.containsKey(value)){
				System.out.println(a[i]+","+ value);
			}
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int a[]={2,1,5,3,11,10,4};
    difference(a,1);
	}

}

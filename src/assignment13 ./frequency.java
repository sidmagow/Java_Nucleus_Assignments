package assignment13;

import java.util.Collections;
import java.util.HashMap;

public class frequency {

	public static void highestFrequency(int[] input){
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i =0;i<input.length;i++){
			if(map.containsKey(input[i])){
				int oldValue=map.get(input[i]);
				map.put(input[i], oldValue+1);
			}
			else{
				map.put(input[i], 1);
			}
			
		}
		Integer max = Collections.max(map.values());
		for(HashMap.Entry<Integer, Integer> entry : map.entrySet()){
			if(entry.getValue()==max)
				System.out.println(entry.getKey());
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,2,2,3,1,3,3,2,1,3,4,5,6};
		highestFrequency(a);
	}

}

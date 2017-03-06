package assignment13;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import LECTURE18.PriorityQueues;

public class longestSequence {

	public static void consecutiveSeq(int input[]){
		HashMap< Integer,ArrayList<Integer>> h1= new HashMap<>();
		PriorityQueues p1= new PriorityQueues();
		for(int i =0;i<input.length;i++){
			p1.insert(input[i]);
		}
		ArrayList<Integer> sequence= new ArrayList<>();
		while(!p1.isEmpty()){
			int x=p1.rempveMin();
			if(sequence.size()==0){
				sequence.add(x);
			}else{
				if(sequence.get(sequence.size()-1)+1==x){
					sequence.add(x);
				}else{
					h1.put(sequence.size(),sequence);
					p1.insert(x);
					sequence.clear();
				}
			}
		}
	    Set<Integer> hs = h1.keySet();
	    Iterator iterator = hs.iterator(); 
        int max=0;
		// check values
		while (iterator.hasNext()){
			System.out.println(iterator.next());  
			
		}
		
		    Iterator it = h1.entrySet().iterator();
		    while (it.hasNext()) {
		        Map.Entry pair = (Map.Entry)it.next();
		        System.out.println(pair.getKey() + " = " + pair.getValue());
		        it.remove(); // avoids a ConcurrentModificationException
		    }
		
	    
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int input[]={2,12,9,16,10,5,3,20,25,11,1,8,6};
     consecutiveSeq(input);
	}

}

package assignment13;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
public class uniqueCharacters {

	public static void uniqueChar(String s){
		HashMap<Character, Integer> m= new HashMap<>();
		for(int i =0;i<s.length();i++){
			if(m.containsKey(s.charAt(i))){
				int oldValue=m.get(s.charAt(i));
				m.put(s.charAt(i), oldValue+1);
			}
			else{
				m.put(s.charAt(i), 1);
			}
		}

		for(int i =0;i<s.length();i++){

			if(m.get(s.charAt(i))>0){
				
				if(m.get(s.charAt(i))==1){

					System.out.println(s.charAt(i));

				}
				int oldValue=m.get(s.charAt(i));
				m.put(s.charAt(i), oldValue-1);

			}
		}
	}

	public static void UniqueChar(String s){
		HashSet<Character> hs = new HashSet<>();
		for(int i =0;i<s.length();i++){


			hs.add(s.charAt(i));
		}
		// create an iterator
		Iterator iterator = hs.iterator(); 

		// check values
		
		while (iterator.hasNext()){
			System.out.println(iterator.next());  
			 
		}


	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UniqueChar("Siddhant");
	}

}

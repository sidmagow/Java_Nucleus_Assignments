package assignment13;

import java.lang.reflect.Array;
import java.util.ArrayList;

import LECTURE18.PriorityQueues;

public class q7 {

	public static ArrayList<Integer> kSortedArray(int[] a,int k){
		ArrayList<Integer> aa= new ArrayList<>();
		PriorityQueues pq= new PriorityQueues();
		for(int i =0;i<k;i++){
			pq.insert(a[i]);
		}
		for(int j =k;j<a.length;j++){
			aa.add(pq.rempveMin());
			pq.insert(a[j]);
		}
		while(!pq.isEmpty()){
			aa.add(pq.rempveMin());
		}
		return aa;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int a[]={6, 2 , 4 , 11 , 9 , 8};
      ArrayList<Integer> n = new ArrayList<>();
      n=kSortedArray(a, 3);
      for(int i =0;i<n.size();i++){
    	  System.out.println(n.get(i));
      }
      
	}

}

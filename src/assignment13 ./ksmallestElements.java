package assignment13;

import java.util.PriorityQueue;

import LECTURE18.PriorityQueues;

public class ksmallestElements {

	public static void kSmallestElements(int a[],int k){
		PriorityQueues pk = new PriorityQueues();
		for(int i =0;i<a.length;i++){
			pk.insert(a[i]);
		}
		for(int i =0;i<k;i++){
			System.out.println(pk.rempveMin());
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int a[]={2,6,5,3,9,8,1,4,7};
      kSmallestElements(a, 3);
	}

}

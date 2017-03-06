package assignment13;

import java.util.PriorityQueue;

import LECTURE18.PriorityQueues;

public class kSortedArrays {

	public static void mergeKsortedArrays(int a[],int b[],int c[],int n ,int k){
		PriorityQueues pq= new PriorityQueues();
		for(int i =0;i<n;i++){
			pq.insert(a[i]);
			pq.insert(b[i]);
			pq.insert(c[i]);
		}
		while(!pq.isEmpty()){
			System.out.println(pq.rempveMin());
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={1,2,3,4};
		int b[]={5,6,7,8};
		int c[]={9,10,11,12};
		mergeKsortedArrays(a,b,c,4,3);
	}

}

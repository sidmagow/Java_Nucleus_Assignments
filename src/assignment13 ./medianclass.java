package assignment13;

import java.util.ArrayList;
import java.util.PriorityQueue;

import LECTURE18.PriorityQueues;

public class medianclass {
     PriorityQueues pq;
     public medianclass(){
    	 pq= new PriorityQueues();
     }
	
     public void Insert(int nextElement){
	 pq.insert(nextElement);
	}
     public int median(){
    	 ArrayList<Integer> newArray= new ArrayList<>();
    	
    	while(!pq.isEmpty()){
    		newArray.add(pq.rempveMin());
    	}
    	 int n=newArray.size();
    	returnCLass obj = new returnCLass();
    	obj=helperfunc(newArray);
    	 if(n%2==0){
    		 return (obj.med1+obj.med2)/2;
    	 }else{
    		 return obj.med;
    	 }
    	 
     }
 
    
     private returnCLass helperfunc(ArrayList<Integer> newArray) {
		// TODO Auto-generated method stub
    	 returnCLass nn= new returnCLass();
    	 int n=newArray.size();
    	 if(n%2==0){
    	     nn.med1=newArray.get(n/2);
    	     nn.med2=newArray.get(n/2-1);
    	     nn.med=0;
    	 }else{
    		 nn.med1=nn.med2=0;
    		 nn.med=newArray.get(n/2);
    	 }
    	 for(int i =0;i<newArray.size();i++){
    		 pq.insert(newArray.get(i));
    	 }
		return nn;
	}

	public void removeMedian(){
    
		ArrayList<Integer> newArray= new ArrayList<>();
    	 while(!pq.isEmpty()){
    		 newArray.add(pq.rempveMin());
    	 }
    	 int n=newArray.size();
    	 if(n%2==0){
    		 newArray.remove(n/2-1);
    		 newArray.remove(n/2);
    	 }else{
    		 newArray.remove(n/2);
    	 }
    	 for(int i =0;i<newArray.size();i++){
    		 pq.insert(newArray.get(i));
    	 }
     }
     
}

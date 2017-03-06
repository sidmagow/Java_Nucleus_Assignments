package asssignment12;

import LECTURE13.QueueEmptyException;
import LECTURE14.BinaryTreeNode;
import LECTURE14.BinaryTreeUse;

public class RootToLeafPathsSumToK {

	public static void rootToLeafPathsSumToK(BinaryTreeNode<Integer> root, int k) {
		// Write your code here
		 int path[] = new int[1000];
		 int pathlen= 0;
		 printrootToLeafPaths(root, path, pathlen,k);	
	}
	
public static void printrootToLeafPaths(BinaryTreeNode<Integer> root,int path[],int pathlen,int sum){
	    
		if(root==null){
			return ;
		}
		path[pathlen]=root.data;
		pathlen++;
	    
		if(root.left==null&&root.right==null){
		printArray(path, pathlen,sum);	
		}
		else{
			printrootToLeafPaths(root.left, path, pathlen,sum);
			printrootToLeafPaths(root.right, path, pathlen,sum);
		}
	}
	
	
	private static void printArray(int ints[], int len,int sum) {
		// TODO Auto-generated method stub
		 int sum1=0;
	     for(int j =0;j<len;j++){
	    	sum1=sum1+ints[j]; 
	     }
	     if(sum1==sum){
		 for (int i = 0; i < len; i++){   
	            System.out.print(ints[i] + " ");
	        }
	        System.out.println("");
	     }
	}
	
	
	public static void main(String[] args) throws QueueEmptyException {
		// TODO Auto-generated method stub
  BinaryTreeNode<Integer> root= BinaryTreeUse.takeInputLevelWise();
 rootToLeafPathsSumToK(root, 13);
	}

}

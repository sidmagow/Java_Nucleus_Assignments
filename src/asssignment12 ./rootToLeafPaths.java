package asssignment12;

import LECTURE13.QueueEmptyException;
import LECTURE14.BinaryTreeNode;
import LECTURE14.BinaryTreeUse;

public class rootToLeafPaths {

	 public static void printPath(BinaryTreeNode<Integer> root){
		 int path[] = new int[1000];
		 int pathlen= 0;
		 printrootToLeafPaths(root, path, pathlen);
	 }
	
	// the next root is not stored in the next place in the array.
	 //since pathlen is also a parameter to recursion and its value is being updated during every recursive call(incremented)
	 // so after printing rootleafpath when it returns back to previous func the value of the parameter gets decremented
	 //so now next value will be overwritten and thus roots not in path will now be not there in the array they will be overwritten.
	 //debug
	public static void printrootToLeafPaths(BinaryTreeNode<Integer> root,int path[],int pathlen ){
	    
		if(root==null){
			return ;
		}
		path[pathlen]=root.data;
		pathlen++;
	    
		if(root.left==null&&root.right==null){
		printArray(path, pathlen);	
		}
		else{
			printrootToLeafPaths(root.left, path, pathlen);
			printrootToLeafPaths(root.right, path, pathlen);
		}
	}
	
	
	private static void printArray(int ints[], int len) {
		// TODO Auto-generated method stub
		 int i;
	        for (i = 0; i < len; i++) 
	        {
	            System.out.print(ints[i] + " ");
	        }
	        System.out.println("");
		
	}


	public static void main(String[] args) throws QueueEmptyException {
		// TODO Auto-generated method stub
       BinaryTreeNode<Integer> root=BinaryTreeUse.takeInputLevelWise();
       printPath(root);
	}

}

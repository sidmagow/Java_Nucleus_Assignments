package asssignment11;

import LECTURE13.QueueEmptyException;
import LECTURE14.BinaryTreeNode;
import LECTURE14.BinaryTreeUse;

public class removeLeaves {
	public static BinaryTreeNode<Integer> removeAllLeaves(BinaryTreeNode<Integer> root){
		
		if(root.left==null&&root.right==null){
			//System.out.println(root.data);
		   return null;
		}
		removeAllLeaves(root.left);
		removeAllLeaves(root.right);
		
	    return root;
		   
	}
	
	public static void main(String[] args) throws QueueEmptyException {
		// TODO Auto-generated method stub
     BinaryTreeNode<Integer> root= BinaryTreeUse.takeInputLevelWise();
     levelorder.printLevelWise(root);
     System.out.println();
     BinaryTreeNode<Integer> ans=removeAllLeaves(root);
    levelorder.printLevelWise(ans);
	}
}


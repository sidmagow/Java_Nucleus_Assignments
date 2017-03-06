package asssignment11;

import LECTURE13.QueueEmptyException;
import LECTURE14.BinaryTreeNode;
import LECTURE14.BinaryTreeUse;

public class siblings {
	public static void printNodesWithoutSibling(BinaryTreeNode<Integer> root){
		if(root==null)
			return;
	    if(root.left==null && root.right==null){
	    	return ;
	    }
		if(root.left == null && root.right != null) {
			System.out.print(root.right.data+ " ");
		}
		if(root.left != null && root.right == null) {
			System.out.print(root.left.data+ " ");
		}
		printNodesWithoutSibling(root.left);
		printNodesWithoutSibling(root.right);
	}
    //1 2 3 4 5 6 7 8 -1 9 -1 10 -1 11 -1 -1 -1 -1 -1 -1 -1 -1 -1 
	public static void main(String[] args) throws QueueEmptyException {
		// TODO Auto-generated method stub
     BinaryTreeNode<Integer> root= BinaryTreeUse.takeInputLevelWise();
    // BinaryTreeUse.printLevelWise(root);
     printNodesWithoutSibling(root);
     //System.out.println(ans);
	}
}

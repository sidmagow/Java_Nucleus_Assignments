package asssignment11;

import LECTURE13.QueueEmptyException;
import LECTURE14.BinaryTreeNode;
import LECTURE14.BinaryTreeUse;

public class balanced {

	public static boolean checkBalanced(BinaryTreeNode<Integer> root){
		if(root==null)
			return true;
		if(root.left==null&&root.right==null){
			return true;
		}
		 int x=BinaryTreeUse.height(root.left);
		 int y=BinaryTreeUse.height(root.right);
		boolean  ans1=checkBalanced(root.left);
		 boolean ans2= checkBalanced(root.right);
		if(ans1==false||ans2==false||Math.abs(x - y) > 1)
			return false;
		else {
			return true;
		}
		
	}
	/*public static boolean balance(BinaryTreeNode<Integer> root){
		if(root==null)
			
	}*/
     //1 2 3 4 5 6 7 8 9 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 
	public static void main(String[] args) throws QueueEmptyException {
		// TODO Auto-generated method stub
     BinaryTreeNode<Integer> root= BinaryTreeUse.takeInputLevelWise();
     boolean ans= checkBalanced(root);
     System.out.println(ans);
	}

}

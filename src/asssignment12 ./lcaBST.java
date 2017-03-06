package asssignment12;

import LECTURE13.QueueEmptyException;
import LECTURE14.BinaryTreeNode;
import LECTURE14.BinaryTreeUse;

public class lcaBST {

	public static int lcaBinaryTree(BinaryTreeNode<Integer> root,int a,int b){
		if(root==null){
			return 0;
			
		}
		if(root.data>a&&root.data>b){
			return lcaBinaryTree(root.left, a, b); // **we need to return in this ques as soon as we find the LCA
		}
		if(root.data<a&&root.data<b){
			return lcaBinaryTree(root.right, a, b);
		}
		return root.data;
	}
	
	// 5 3 8 2 4 7 9 -1 -1 -1 -1 -1 -1 -1 -1 
	public static void main(String[] args) throws QueueEmptyException {
		// TODO Auto-generated method stub
   BinaryTreeNode<Integer> root=BinaryTreeUse.takeInputLevelWise();
  BinaryTreeUse.printLevelWise(root);
  int n1= 2;
  int n2= 4;
  int t=lcaBinaryTree(root, n1, n2);
  System.out.println("LCA is" + t);
	}

}

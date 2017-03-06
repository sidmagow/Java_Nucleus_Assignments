package asssignment12;

import LECTURE13.QueueEmptyException;
import LECTURE14.BinaryTreeNode;
import LECTURE14.BinaryTreeUse;

public class LARGESTbst {
	public static int largestBSTSubtree(BinaryTreeNode<Integer> root) {
		// Write your code here
		int h =0;
		int x=larBSTSubtree( root,h);
		return x;

	}
	
	public static BinaryTreeNode<Integer> largestBST(BinaryTreeNode<Integer> root){
		if(root==null){
			return root;
		}
		BinaryTreeNode<Integer> r1=largestBST(root.left);
		BinaryTreeNode<Integer> r2= largestBST(root.right);
		if(r1==null&&r2==null){
			
		}
		if((r1==root.left&&r2==root.right||r1==root.right&&r2==root.left)&&(root.left.data<root.data&&root.right.data>root.data)){
	
				return root;
		    }
		else{
		   int h1=BinaryTreeUse.height(r1);	
		   int h2 = BinaryTreeUse.height(r2);
		   if(h1>h2)
			   return r1;
		   else
			   return r2;
		 }
		}
	
	private static int larBSTSubtree(BinaryTreeNode<Integer> root, int h) {

		if(root==null){
			return 0;
		}
		if(root.left!=null&&root.right!=null){ 
			if(root.left.data<root.data&&root.right.data>root.data){
				h++;
			}
		}
		larBSTSubtree(root.left, h);
		larBSTSubtree(root.right, h);
		return h;
	}
	//5 10 6 2 3 -1 -1 -1 -1 1 9 -1 -1 -1 -1 
	public static void main(String[] args) throws QueueEmptyException {
		// TODO Auto-generated method stub
		BinaryTreeNode<Integer> root=BinaryTreeUse.takeInputLevelWise();
		BinaryTreeNode<Integer> n= largestBST(root);
		

	}

}

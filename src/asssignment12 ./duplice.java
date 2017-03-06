package asssignment12;

import LECTURE13.QueueEmptyException;
import LECTURE14.BinaryTreeNode;
import LECTURE14.BinaryTreeUse;

public class duplice {

	public static void duplice1(BinaryTreeNode<Integer> root){
		if(root== null){
			return;
		}
		int x=root.data;
		BinaryTreeNode<Integer> node=new BinaryTreeNode<Integer>(x);
		BinaryTreeNode<Integer> temp=root.left;
		root.left=node;
		node.left=temp;   
		duplice1(node.left);   //** as root.left is the same value as root which will cause stackoverflow error.so the next node is node.left
		duplice1(root.right);
		
	}
	//2 1 3 -1 -1 -1 -1 
	public static void main(String[] args) throws QueueEmptyException {
		// TODO Auto-generated method stub
		BinaryTreeNode<Integer> root = BinaryTreeUse.takeInputLevelWise();
		//BinaryTreeUse.printLevelWise(root);
		duplice1(root);
		System.out.println();
		BinaryTreeUse.printLevelWise(root);
	}

}

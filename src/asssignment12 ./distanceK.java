package asssignment12;

import LECTURE13.QueueEmptyException;
import LECTURE14.BinaryTreeNode;
import LECTURE14.BinaryTreeUse;

public class distanceK {

	public static void rootAtDistanceK(BinaryTreeNode<Integer> root,int node,int k){
		int c=0;
	//	BinaryTreeNode<Integer> node1= new  BinaryTreeNode<Integer>(node);
		BinaryTreeNode<Integer> node1=searchNode( root,node);
		rootAtDistanceKHelper(root,node1,k,c);
	}
	
	private static  BinaryTreeNode<Integer> searchNode(BinaryTreeNode<Integer> root,int node) {
		// TODO Auto-generated method stub
		if(root==null)
			return null;
		else{
			if(root.data==node){
			return root;
		}
		searchNode( root.left,node);
		searchNode(root.right, node);
		}
		return root;
	}

	private static void rootAtDistanceKHelper(BinaryTreeNode<Integer> root, BinaryTreeNode<Integer> node, int k, int c) {
		// TODO Auto-generated method stub
		
		if(node==null ){
			return;
		}
		c++;
		if(c==k+1){
			
			System.out.println(node.data);
			return ;
		}
		rootAtDistanceKHelper(root, node.left, k,c);
		rootAtDistanceKHelper(root, node.right, k,c);
		
		
	}
//5 6 10 2 3 -1 -1 -1 -1 -1 9 -1 -1 
	public static void main(String[] args) throws QueueEmptyException {
		// TODO Auto-generated method stub
    BinaryTreeNode<Integer> root= BinaryTreeUse.takeInputLevelWise();
   int k =1;
    rootAtDistanceK(root, 6,k );
    
	}

}

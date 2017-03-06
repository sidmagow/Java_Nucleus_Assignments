package asssignment11;

import LECTURE13.QueueEmptyException;
import LECTURE14.BinaryTreeNode;
import LECTURE14.BinaryTreeUse;

public class sumOfNodes {

public static int sum(BinaryTreeNode<Integer> root){
	if(root==null)
		return 0;
	if(root.left==null&&root.right==null){
		return root.data;
	
	}
	int x=sum(root.left);
	int y=sum(root.right);
	return x+y+root.data;
}
	
	public static void main(String[] args) throws QueueEmptyException {
		// TODO Auto-generated method stub
		BinaryTreeNode<Integer> root=BinaryTreeUse.takeInputLevelWise();
		int ans=sum(root);
		System.out.println("the sum is"+ ans);
	}

}

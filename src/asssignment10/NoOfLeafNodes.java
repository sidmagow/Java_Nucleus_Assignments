package asssignment10;

import LECTURE13.QueueEmptyException;
import LECTURE13.TreeNode;
import LECTURE13.TreeUse;

public class NoOfLeafNodes {

	public static int no(TreeNode<Integer> root){
		if(root==null){
			return 0;
		}
		int c=0;
		for(TreeNode<Integer> child: root.children){
			int ans = no(child);
		c=c+ans;
		}
		if(root.children.size()==0){
			return c+1;
		}
		else
			return c;
	}
	
	
	
	public static void main(String[] args) throws QueueEmptyException {
		// TODO Auto-generated method stub
		TreeNode<Integer> root = TreeUse.takeInputLevelWise();
		int ans = no(root);
		System.out.println("the no of leaf nodes are "+ ans);
	}

}

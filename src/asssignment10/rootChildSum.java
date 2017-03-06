package asssignment10;

import LECTURE13.QueueEmptyException;
import LECTURE14.BinaryTreeNode;
import LECTURE14.BinaryTreeUse;

public class rootChildSum {
	public static ReturnSumNode rootchildsum(BinaryTreeNode<Integer> root){
		if(root==null){
			ReturnSumNode ans=new ReturnSumNode();	
			ans.sum=0;
			ans.node=null;
			return ans;
		}
		int sum=0;
		ReturnSumNode ansleft=rootchildsum(root.left);
		ReturnSumNode ansright=rootchildsum(root.right);
		
		ReturnSumNode ansFinal=new ReturnSumNode();

		if(root.left!=null&&root.right!=null)
			sum =root.data+root.left.data+root.right.data;
		else if(root.left == null && root.right != null) {
			sum = root.data + root.right.data;
		}
		else if(root.left != null && root.right == null) {
			sum = root.data + root.left.data;
		}
       
		ansFinal.sum=Math.max(ansleft.sum, Math.max(ansright.sum, sum));
		
		if(ansFinal.sum==ansleft.sum)
			ansFinal.node=ansleft.node;
		else if(ansFinal.sum==ansright.sum)
			ansFinal.node=ansright.node;
		else
			ansFinal.node=root;
		return ansFinal;
	}
	public static void main(String[] args) throws QueueEmptyException {
		// TODO Auto-generated method stub
		BinaryTreeNode<Integer> root=BinaryTreeUse.takeInputLevelWise();
		BinaryTreeUse.print(root);
		ReturnSumNode ans = rootchildsum(root);
		System.out.println("The node is "+ ans.node.data);
	}

}
//1 2 3 4 5 6 7 -1 -1 -1 -1 -1 -1 -1 -1 
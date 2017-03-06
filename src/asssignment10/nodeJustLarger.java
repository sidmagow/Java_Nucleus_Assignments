package asssignment10;

import java.util.Scanner;

import LECTURE13.QueueEmptyException;
import LECTURE13.TreeNode;
import LECTURE13.TreeUse;
import LECTURE14.BinaryTreeNode;
import LECTURE14.BinaryTreeUse;

public class nodeJustLarger {

	public static TreeNode<Integer> nodeJustGreater(TreeNode<Integer> root,int n){
		if(root==null){
			return null;
		}
	    int min=Integer.MAX_VALUE;
		for(TreeNode<Integer> child: root.children){
	    	TreeNode<Integer> ans=nodeJustGreater(child, n);
	    	if(ans.data < min) {
	    		min = ans.data;
	    	}
	    }
		 if(root.data>n){
			 int x = Math.min(min, root.data);
			 TreeNode<Integer> xc= new TreeNode<Integer>(x);
			 return xc;
		 }else
		 {
			 TreeNode<Integer> xc= new TreeNode<Integer>(min);
			 return xc;
		 }
		
		
	}
	public static int noddd(BinaryTreeNode<Integer> root,int n){
		if(root==null){
			return 0;
		}
	  //  int min=root.data;
		int ans1=noddd(root.left, n);
		int ans2=noddd(root.right, n);
		 if(root.data>n){
			 int x = Math.min(ans1, Math.min(ans2,root.data));
			 return x;
		 }else
		 {
			 return Math.min(ans1, ans2);
		 }
	}
	
	
	//1 2 2 3 2 4 5 2 6 7 0 0 0 0 
	public static void main(String[] args) throws QueueEmptyException {
		// TODO Auto-generated method stub
       TreeNode<Integer> root= TreeUse.takeInputLevelWise();
        Scanner s = new Scanner(System.in);
        int n =s.nextInt();
        TreeNode<Integer> ans=nodeJustGreater(root, n);
        System.out.println(ans.data);
	}

}

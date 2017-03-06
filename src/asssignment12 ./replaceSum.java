package asssignment12;

import java.util.ArrayList;
import java.util.Stack;

import LECTURE13.QueueEmptyException;
import LECTURE14.BinaryTreeNode;
import LECTURE14.BinaryTreeUse;

public class replaceSum {
// inorder in bst is a sorted array 
	public static ArrayList<Integer> reverseInOrderIterative(BinaryTreeNode<Integer> root){
		ArrayList<Integer> in = new ArrayList<>();
		BinaryTreeNode<Integer> temp= root;
		Stack<BinaryTreeNode<Integer>> s = new Stack<>();
		while(temp!=null){
			s.push(temp);
			temp=temp.right;
		}
		while(s.size()>0){
			 temp=s.pop();
			in.add(temp.data);
			if(temp.left!=null){
				temp=temp.left;
				while(temp!=null){
					s.push(temp);
					temp=temp.right;
				}
			}
		}
		
		return in;
	}
	
	public static BinaryTreeNode<Integer> arrayToBst(ArrayList<Integer> a,int start,int end){
		if(start>end){
			return null;
		}
		int mid=(start+end)/2;
		BinaryTreeNode<Integer> root= new BinaryTreeNode<Integer>(a.get(mid));
		root.left=arrayToBst(a, mid+1, end);
		root.right=arrayToBst(a, start, mid-1);
		return root;
	}
	
	public static BinaryTreeNode<Integer> replaceWithLargerNodesSum(BinaryTreeNode<Integer> root) {
		ArrayList<Integer> xx= reverseInOrderIterative(root);
		ArrayList<Integer> temp = new ArrayList<>();
		temp.add(xx.get(0));
		int sum = xx.get(0);
		for(int i =1;i<xx.size();i++){
			sum =sum+xx.get(i);
			temp.add(sum);
		}
		int start=0;
		int end=temp.size()-1;
		
		for(int i = 0;i < temp.size();i++)
			System.out.print(temp.get(i) + " ");
		BinaryTreeNode<Integer> nw=arrayToBst(temp, start, end);
		return nw;
		
		
		
	}
	
	public static void main(String[] args) throws QueueEmptyException {
		// TODO Auto-generated method stub
 BinaryTreeNode<Integer> root = BinaryTreeUse.takeInputLevelWise();
 BinaryTreeUse.printLevelWise(root);
 root= replaceWithLargerNodesSum(root);
 System.out.println("the new tree is");
 BinaryTreeUse.printLevelWise(root);
 
	}

}

package asssignment12;

import java.util.ArrayList;

import LECTURE13.QueueEmptyException;
import LECTURE14.BinaryTreeNode;
import LECTURE14.BinaryTreeUse;
import asssignment11.levelorder;

//implementing BST using binary tree..so adding more functionality to a Binary tree.. just like implementing stack using an array or linked list
public class BST {
	BinaryTreeNode<Integer> root;
	int size;
	public Boolean search(int value){
		return search(value,root);
	}
	private Boolean search(int value, BinaryTreeNode<Integer> root) {
		if(root==null){
			return false;
		}
		if(root.data==value){
			return true;
		}
		if(root.data<value){
			return search(value,root.left);
		}
		else{
			return search(value,root.right);
		}
	}

	public void insert(int value){
		root=insert(value,root);
	}
	private BinaryTreeNode<Integer> insert(int value, BinaryTreeNode<Integer> root) {
		if(root==null){
			BinaryTreeNode<Integer> node= new BinaryTreeNode<Integer>(value);
			return node;
		}
		if(value<root.data){
			root.left=insert(value,root.left);
		}
		else{
			root.right=insert(value,root.right);
		}
		return root;
	}
      
	static ArrayList<Integer> ans = new ArrayList<>();					
	public static ArrayList<Integer> inOrder(BinaryTreeNode<Integer> root)	{	
		if(root == null)	{					
			return ans;
		}
		inOrder(root.left);
		ans.add(root.data);
		inOrder(root.right);
		return ans;
	}
	
	public void remove(int n){
		root=remove(n,ans,root);
	}
	private BinaryTreeNode<Integer> remove(int n, ArrayList<Integer> ans2, BinaryTreeNode<Integer> root) {
		// TODO Auto-generated method stub
		if(root==null){
			return null ;
		}
		for(int i =0;i<ans.size();i++){
			if(n==ans.get(i)){
				ans.set(i, ans.get(i+1));
			}
		}
		return root;
	}
	
	public static void main(String[] args) throws QueueEmptyException {
		BST obj = new BST();
		obj.insert(2);
		obj.insert(1);
		obj.insert(3);
		obj.insert(7);
		//levelorder.printLevelWise(obj.root);
      BinaryTreeUse.print(obj.root);
      obj.remove(7);
      BinaryTreeUse.print(obj.root);
	}
	
}

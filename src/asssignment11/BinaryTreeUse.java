package LECTURE14;

import java.util.Scanner;

import LECTURE13.QueueEmptyException;
import LECTURE13.QueueUsingLL;

public class BinaryTreeUse {

	public static BinaryTreeNode<Integer> takeInput(){
		Scanner s = new Scanner(System.in);
		System.out.println("enter root data : ");
		int data=s.nextInt();
		if(data==-1){
			return null;
		}
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(data);
		root.left=takeInput();
		root.right=takeInput();
		return root;	
	}
	public static BinaryTreeNode<Integer> takeInputLevelWise() throws QueueEmptyException{
		Scanner s = new Scanner(System.in);
		System.out.println("enter the root data : " );
		int data =s.nextInt();
		BinaryTreeNode<Integer> root= new BinaryTreeNode<Integer>(data);
		QueueUsingLL<BinaryTreeNode<Integer>> pendingNodes= new QueueUsingLL<BinaryTreeNode<Integer>>();
		pendingNodes.enqueue(root);
		while(!pendingNodes.isEmpty()){

			BinaryTreeNode<Integer> currentNode= pendingNodes.dequeue();



			System.out.println("enter the 1st child of" + currentNode.data);
			int  m1=s.nextInt();
			if (m1!=-1){
				BinaryTreeNode<Integer> leftChild=new BinaryTreeNode<Integer>(m1);

				pendingNodes.enqueue(leftChild);
				currentNode.left = leftChild;
			}  
			System.out.println("enter the 2nd child of "+currentNode.data );
			int m2=s.nextInt();
			if(m2!=-1){
				BinaryTreeNode<Integer> rightChild=new BinaryTreeNode<Integer>(m2);

				pendingNodes.enqueue(rightChild);
				currentNode.right = rightChild;
			}
		}
		return root;
	}
	public static void printREC(){
		
	}
	
public static void printLevelWise(BinaryTreeNode<Integer> root) throws QueueEmptyException{
	QueueUsingLL<BinaryTreeNode<Integer>> queue = new QueueUsingLL<BinaryTreeNode<Integer>>();
	queue.enqueue(root);
	queue.enqueue(null);
	while(!queue.isEmpty())	{
		BinaryTreeNode<Integer> child = queue.dequeue();
		if(child == null)	{
			if(!queue.isEmpty())	{	//infinite loop because null will be enqueued every time
				queue.enqueue(child);
				System.out.println();
			}
		}
		else	{
			System.out.print(child.data+" ");
			if(child.left != null)	{
				queue.enqueue(child.left);
			}
			if(child.right != null)	{
				queue.enqueue(child.right);
			}
		}
	}
	}
	
	
	//ASSIGNMENT 11
	public static int sumOfAllNodes(BinaryTreeNode<Integer> root){
		if(root==null){
			return 0;
		}
		int s=sumOfAllNodes(root.left);
		int m=sumOfAllNodes(root.right);
		return s+m+root.data;
	}

	public static int count(BinaryTreeNode<Integer> root,int x){
		if(root == null){
			return 0;

		}
		int m=count(root.left,x);
		int n =count(root.right,x);
		if(root.data>x){
			return m+n+1;
		}
		else
			return m+n;

	}

	public static boolean search(BinaryTreeNode<Integer> root,int x){
		if(root == null){
			return false;
		}
		if(root.data==x){
			return true;
		}
		boolean ans1=search(root.left,x);
		boolean ans2=search(root.right,x);
		return ans1||ans2;
	}
//O(n2)
	/*public static int diameter(BinaryTreeNode<Integer> root){
		if(root ==null){
			return 0;
		}
		int diameter1=diameter(root.left);
		int diameter2=diameter(root.right);
		int count1=height(root.left);
		int count2=height(root.right);
		
	}*/
	public static int height(BinaryTreeNode<Integer> root){
		if(root==null){
			return 0;
		}
		int h1=height(root.left);
		int h2=height(root.right);
		if(h1>h2)
			return h1+1;
		else
			return h2+1;
	}

	public static void mirror(BinaryTreeNode<Integer> root){
		if(root==null){
			return;
		}
		mirror(root.left);
		mirror(root.right);
		BinaryTreeNode<Integer> temp=root.right;
		root.right=root.left;
		root.left=temp;

	}

	public static void print(BinaryTreeNode<Integer> root){
		if(root==null){
			return ;
		}

		System.out.print(root.data + " : ");

		if(root.left!=null)
			System.out.print(root.left.data);
		if(root.right!=null)
			System.out.print("," +root.right.data);
		System.out.println();

		print(root.left);
		print(root.right);

	}
	
	

	// 1 2 3 -1 -1 -1 -1
	public static void main(String[] args) throws QueueEmptyException {
		// TODO Auto-generated method stub)

		BinaryTreeNode<Integer> root = takeInputLevelWise();
		/*int s=sumOfAllNodes(root);
		System.out.println(s);*/
		Scanner ss = new Scanner(System.in);
		//	System.out.println("enter x");
		//int x=ss.nextInt();
		/*int m =count(root,x);
		System.out.println("the count is "+ m);*/
		/*
		boolean ans=search(root,x);
		System.out.println(ans);
		 */
		print(root);
		mirror(root);
		System.out.println("the mirror image is");
		print(root);
		
		
	}

}

package LECTURE13;

import java.util.Scanner;

public class TreeUse {
	public static TreeNode<Integer> takeInputLevelWise() throws QueueEmptyException {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter root data : ");
		int data = s.nextInt();
		TreeNode<Integer> root = new TreeNode<Integer>(data);
		QueueUsingLL<TreeNode<Integer>> pendingNodes = new QueueUsingLL<TreeNode<Integer>>();
		pendingNodes.enqueue(root);
		while(!pendingNodes.isEmpty()) {
			TreeNode<Integer> currentNode = pendingNodes.dequeue();
			System.out.println("Enter no. of children of " + currentNode.data + " : ");
			int n = s.nextInt();
			for(int i = 0; i < n; i++) {
				System.out.println("Enter " + i + "th child of " + currentNode.data + " : ");
				int childData = s.nextInt();
				TreeNode<Integer> child = new TreeNode<Integer>(childData);
				pendingNodes.enqueue(child);
				currentNode.children.add(child);
			}
		}
		return root;
	}
	
	public static TreeNode<Integer> takeInput() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter root data : ");
		int data = s.nextInt();
		TreeNode<Integer> root = new TreeNode<Integer>(data);
		System.out.println("Enter no. of childres of " + data + " : ");
		int n = s.nextInt();
		for(TreeNode<Integer> child:root.children) {
			 child = takeInput();
			root.children.add(child);
		}
		return root;
	}
	
	public static void print1(TreeNode<Integer> root) {
		
		if(root == null){
			return;
		}
		System.out.print(root.data+" : ");
		for(TreeNode<Integer> child : root.children) {
			System.out.print(child.data + ", ");
		}
		System.out.println();
		
		for(int i = 0; i < root.children.size(); i++) {
			print1(root.children.get(i));
		}
		return;
	}
	//wrong
	public static void print(TreeNode<Integer> root){
		   System.out.println(root.data);
		  
		   System.out.println();
		   QueueUsingLL<TreeNode<Integer>> q = new QueueUsingLL();
		   q.enqueue(root);
		   while(!q.isEmpty()){
			   for(TreeNode<Integer> child : root.children){
				   System.out.println(child.data + ",");
				   q.enqueue(child);
			   }
			   
		   }
	   }
	
	
//ASSIGNMENT 10	   
	public static int height(TreeNode<Integer> root) {
		if(root == null) {
			return 0;
		}
		int ans = 0;
		for(TreeNode<Integer> child : root.children) {
			int childHeight = height(child);
			if(childHeight > ans) {
				ans = childHeight;
			}
		}
		return ans + 1;
	}
	
	public static int noOfNodes(TreeNode<Integer> root){
		   if(root ==null){
			   return 0;
		   }
		   int ans =0;
		   for(TreeNode<Integer> child:root.children){
			   int n =noOfNodes(child);
			   ans=ans+n;
		   }
	   
	   return ans+1;
	   }
	   
	   public static int sumOfNodes(TreeNode<Integer> root){
		   if(root==null){
			   return 0;
		   }   int sum =0;
			   for(TreeNode<Integer> child:root.children){
				   int s=sumOfNodes(child);
			   sum=sum+s;
			   }
		   
		   return sum+root.data;
		   
	   }
	   
	   public static void depth(TreeNode<Integer> root,int k){
		      if(k==0){
		    	  System.out.println(root.data);
		    	  
		      }
		      for(TreeNode<Integer> a : root.children){
//		      for(int i =0;i<root.children.size();i++){
		    	  depth(a,k-1);
		      }
		      
	   }
	   
	  public static int largest(TreeNode<Integer> root){
		     if(root==null){
		    	 return 0;
		     }
		     int ans =root.data;
		     for(TreeNode a: root.children ){
		    	int b = largest(a);
		    	 if(b>ans){
		    		 ans =b;
		    		 
		    	 }
		     }
		     if(root.data>ans)
		    	 return root.data;
		     else
		    	 return ans;
	   }
	  
	   public static int nodesgreaterthanx(TreeNode<Integer> root,int x){
		   if(root==null)
		   return 0;
		   int ans=0;
		   for(TreeNode<Integer> b: root.children){
			   int v=nodesgreaterthanx(b, x);
		  ans=ans+v;
		   }
		   if(root.data>x)
			  return ans+1;
		   else
			   return ans;
		   
	   }
	   
	   public static boolean ifx(TreeNode<Integer> root,int x){
		   if(root==null){
			   return false;
		   }
		   if(root.data==x){
			   return true;
		   }
		   for(TreeNode<Integer> b: root.children){
			   boolean ans1=ifx(b,x);
		     if(ans1==true){
		    	 return ans1;
		     }
		   }
		   return false;
	   }
	   
		public static int returnSum(TreeNode<Integer> root){
			if(root==null){
				return 0;
			}
			int ans=0;
			for(TreeNode<Integer> e:root.children){
				ans=ans+e.data;
			}
			return ans;
		}
		
		
		
	 
	 

	
	  //1 3 2 5 6 2 3 4  0  1 7 0 0 1 8 0
	  public static void main(String[] args) throws QueueEmptyException {
	TreeNode<Integer> root = takeInputLevelWise();
		/*System.out.println("enter the first tree");

		//print1(root);
		Scanner ss =new Scanner(System.in);
		/*System.out.println("enter x");
	    int x=ss.nextInt();*/
		
		//depth(root,k);
		print1(root);
		int f=largest(root);
		System.out.println("the largest no is "+ f);
		
	/*	int j=nodesgreaterthanx(root, x);
		System.out.println(j+" numbers are greater than " + x);*/
		
	/*	int y=returnSum(root);
		System.out.println("sum is "+y);
		*/
		/*boolean ans=ifx(root,x);
		System.out.println(ans);*/
		
		
		
		
		/*boolean ans1=sameTree(root1, root2);
		System.out.println(ans1);*/
		
		/*ArrayList<Integer> a = new ArrayList<Integer>();
		 
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		
		for(int i : a) {
			System.out.println(i);
		}*/
	/*	Scanner s =new Scanner(System.in);
		int k =s.nextInt();
		trees.depth(root1, k);
		*/
		
	}
}

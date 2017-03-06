package asssignment10;

import LECTURE13.QueueEmptyException;
import LECTURE13.QueueUsingLL;
import LECTURE13.TreeNode;
import LECTURE13.TreeUse;

public class trees {
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
//	      for(int i =0;i<root.children.size();i++){
	    	  depth(a,k-1);
	      }
	      
   }
   
   public static void  replace(TreeNode<Integer> root,int depth){
	  
	   if(root==null)
		   return ;
	   
	   
	 /*  
	   for(int i=0 ; i<root.children.size(); i++)
	   {
		   replace(root.children.get(i),depth+1);
	   }*/
	   root.data=depth;
	  for(TreeNode<Integer> w: root.children){
		   replace(w,depth+1);
		 
	   }
	  
	   
   }
/*
   public static TreeNode<Double> takeInputLevelWise() throws QueueEmptyException {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter root data : ");
		Double data = s.nextDouble();
		TreeNode<Double> root = new TreeNode<Double>(data);
		QueueUsingLL<TreeNode<Double>> pendingNodes = new QueueUsingLL<TreeNode<Double>>();
		pendingNodes.enqueue(root);
		while(!pendingNodes.isEmpty()) {
			TreeNode<Double> currentNode = pendingNodes.dequeue();
			System.out.println("Enter no. of children of " + currentNode.data + " : ");
			Double n = s.nextDouble();
			for(int i = 0; i < n; i++) {
				System.out.println("Enter " + i + "th child of " + currentNode.data + " : ");
				Double childData = s.nextDouble();
				TreeNode<Double> child = new TreeNode<Double>(childData);
				pendingNodes.enqueue(child);
				currentNode.children.add(child);
			}
		} 
		return root;
	}
   
   public static void print1(TreeNode<Double> root) {
		
		if(root == null){
			return;
		}
		System.out.print(root.data+" : ");
		for(TreeNode<Double> child : root.children) {
			System.out.print(child.data + ", ");
		}
		System.out.println();
		
		for(int i = 0; i < root.children.size(); i++) {
			print1(root.children.get(i));
		}
		return; 
	}*/
   /*
   public static TreeNode<Integer> secondLargest(TreeNode<Integer> root){
	    if(root==null){
	    	return null;
	    }
	    if(root.children==null){
	    	return null;
	    }
	    TreeNode<Integer> l=root;
	   TreeNode<Integer> sl =root;
	   TreeNode<Integer> x=null;
	   TreeNode<Integer> xl=null;
	   
	   for(TreeNode<Integer> s: root.children){
		   x=
	   }
   }
   */

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
	

//ASSIGNMENT 10	   

	
	  
	   
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
		
		
   
   public static void main(String[] args) throws QueueEmptyException {
	  System.out.println("enter the tree");
	  TreeNode<Integer> root=TreeUse.takeInputLevelWise();
	  TreeUse.print1(root);
	 /*replace(root,0);
	 TreeUse.print1(root);*/
	  
}
   
}

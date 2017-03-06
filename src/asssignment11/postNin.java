package asssignment11;

import java.util.Scanner;

import LECTURE14.BinaryTreeNode;
import LECTURE14.BinaryTreeUse;

public class postNin {

	public static BinaryTreeNode<Integer> postIn(int post[],int in[],int postS,int postE,int inS,int inE){
       if(postS>postE){
			return null;
		}
		int k=0;
		int x=post[post.length-1];
		 
		for(int i =inS;i<=in.length;i++){
			if(in[i]==x)
			{	k=i;
			   break;}
		}
		BinaryTreeNode<Integer> root= new BinaryTreeNode<Integer>(x);
		root.left=postIn(post,in,postS,k-inS+postS  ,inS,k-1);
		root.right=postIn(post,in,k-inS+postS+1 ,postE-1 ,k+1,inE);
         return root;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner s = new Scanner(System.in);
		    int[] post={4,6,5,2,8,7,3,1};
		    int[] in={4,2,6,5,1,7,8,3};
		   int inS=0,postS=0,inE=in.length-1,postE=post.length-1;
		    BinaryTreeNode<Integer> root=postIn(in, post, inS, inE, postS, postE);
		    BinaryTreeUse.print(root);
	}

}

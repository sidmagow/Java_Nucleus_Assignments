package asssignment11;

import java.util.Scanner;

import LECTURE14.BinaryTreeNode;
import LECTURE14.BinaryTreeUse;

public class preNin {
  public static BinaryTreeNode<Integer> preIn(int in[],int pre[],int inS,int inE,int preS,int preE){
	if(preS>preE){
		return null;
	}
	
	int x =pre[preS];
	int k=0;
	 
	for(int i =inS;i<=in.length;i++){
		if(in[i]==x)
		{	k=i;
		   break;}
	}
	
	BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(x);
   root.left=preIn(in, pre, inS, k-1, preS+1, k-inS+preS);
   root.right=preIn(in, pre, k+1, inE, k-inS+preS+1, preE);
   return root;
   
}


public static void main(String[] args) {
	// TODO Auto-generated method stub
  Scanner s = new Scanner(System.in);
    int[] pre={1,2,4,5,6,3,7,8};
    int[] in={4,2,6,5,1,7,8,3};
   int inS=0,preS=0,inE=in.length-1,preE=pre.length-1;
    BinaryTreeNode<Integer> root=preIn(in, pre, inS, inE, preS, preE);
    BinaryTreeUse.print(root);
}

}

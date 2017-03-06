package asssignment12;

import java.util.ArrayList;

import LECTURE13.QueueEmptyException;
import LECTURE14.BinaryTreeNode;
import LECTURE14.BinaryTreeUse;

public class pairSum {

	public static ArrayList<Integer> preOrder(BinaryTreeNode<Integer> root,ArrayList<Integer> in){
		if(root==null)
			return null;
	
		preOrder(root.left,in);
		in.add(root.data);
		preOrder(root.right,in);
		return in;
	}
	
	public static void nodesSumToS(BinaryTreeNode<Integer> root,int sum){
		ArrayList<Integer> n= new ArrayList<>();
		ArrayList<Integer> in= preOrder(root,n);
	
		 
		
		for(int i =0;i<in.size();i++){
			for(int j =i+1;j<in.size();j++){
				if(in.get(i)+in.get(j)==sum)
					if(in.get(i)<in.get(j)){
						System.out.print(in.get(i)+ " "+ in.get(j));
					}else{
						System.out.println(in.get(j)+" "+ in.get(i));
					}
			}
			//System.out.print(in.get(i)+" ");
		}
	
	}
	//1 2 3 4 5 6 7 -1 -1 -1 -1 -1 -1 -1 -1 
	public static void main(String[] args) throws QueueEmptyException {
		// TODO Auto-generated method stub
		BinaryTreeNode<Integer> root = BinaryTreeUse.takeInputLevelWise();
		//BinaryTreeUse.printLevelWise(root);
		nodesSumToS(root,15);
	//	System.out.println(ans);
	}

}

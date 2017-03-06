package asssignment10;

import LECTURE13.QueueEmptyException;
import LECTURE13.TreeNode;
import LECTURE13.TreeUse;

public class compareTrees {

	public static boolean sameTree(TreeNode<Integer> root1,TreeNode<Integer> root2){

		if(root1==null&&root2==null){
			return true;
		}
		if(root1==null||root2==null){
			return false;

		}
		if(root1.data!=root2.data || root1.children.size() != root2.children.size()){
			return false;
		}
		boolean ans =false;
		for(int i =0;i<root1.children.size();i++){
			ans = sameTree(root1.children.get(i), root2.children.get(i));
			if(!ans) {
				return false;
			}
		}
		return true;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode<Integer> root1 = null;
		try {
			root1 = TreeUse.takeInputLevelWise();
		} catch (QueueEmptyException e) {
			System.out.println("Empty");
			return;
		}

		System.out.println("enter the second tree");
		TreeNode<Integer> root2 = null;
		try {
			root2 = TreeUse.takeInputLevelWise();
		} catch (QueueEmptyException e) {
			System.out.println("Empty");
			return;
		}


		boolean ans = sameTree(root1, root2);
		System.out.println(ans);
	}

}

package asssignment11;

import LECTURE13.QueueEmptyException;
import LECTURE13.QueueFullException;
import LECTURE13.QueueUsingLL;
import LECTURE14.BinaryTreeNode;
import LECTURE14.BinaryTreeUse;
import assignment9.QueueReverseBinaryTreeNode;

public class zigZag {

	public static void zigzag(BinaryTreeNode<Integer> root) throws QueueEmptyException, QueueFullException{
		QueueUsingLL<BinaryTreeNode<Integer>> queue= new QueueUsingLL<BinaryTreeNode<Integer>>();
		queue.enqueue(root);
		queue.enqueue(null);
		int c=1;
		while(!queue.isEmpty()){
			BinaryTreeNode<Integer> child= queue.dequeue();
			if(child==null){
				if(!queue.isEmpty()){
				
							System.out.println();
							queue=QueueReverseBinaryTreeNode .queueReverse1(queue);
							queue.enqueue(null);
					 
				
				c++;
				}
			}
			else{
				if(c%2==0){
					System.out.print(child.data + " ");

					if(child.right!=null){
						queue.enqueue(child.right);
					}	
					
					if(child.left!=null){
						queue.enqueue(child.left);
					}
					
				}else{
					System.out.print(child.data + " ");
					if(child.left!=null){
						queue.enqueue(child.left);
					}
					
					if(child.right!=null){
						queue.enqueue(child.right);
					}
					
					
				}
				
			}
		}
	}
	// 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 
	public static void main(String[] args) throws QueueEmptyException, QueueFullException {
		// TODO Auto-generated method stub
		BinaryTreeNode<Integer> root = BinaryTreeUse.takeInputLevelWise();
		zigzag(root);
	}

}

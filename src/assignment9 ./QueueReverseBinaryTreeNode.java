package assignment9;

import LECTURE13.Queue;
import LECTURE13.QueueEmptyException;
import LECTURE13.QueueFullException;
import LECTURE13.QueueUsingLL;
import LECTURE14.BinaryTreeNode;

public class QueueReverseBinaryTreeNode {

	 public static QueueUsingLL<BinaryTreeNode<Integer>> queueReverse1(QueueUsingLL<BinaryTreeNode<Integer>> q1) throws QueueFullException, QueueEmptyException{
	    	if(q1.size()<1){
	    		return q1;
	    	}
	    	Queue temp = new Queue(4);
	    	BinaryTreeNode<Integer> x = q1.dequeue();
	         QueueUsingLL<BinaryTreeNode<Integer>> ans =queueReverse1(q1);
	    	ans.enqueue(x);
	    	return ans;
	    }

	public static void main(String[] args) throws QueueFullException {
		
	}

}

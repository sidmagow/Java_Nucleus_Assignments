package asssignment11;

import LECTURE13.QueueEmptyException;
import LECTURE13.QueueUsingLL;
import LECTURE14.BinaryTreeNode;
import LECTURE14.BinaryTreeUse;

public class levelorder {

	/*public static void printLevelWise(BinaryTreeNode<Integer> root) throws QueueEmptyException{
		
		System.out.println(root.data);
		QueueUsingLL<BinaryTreeNode<Integer>> q=  new QueueUsingLL();
		q.enqueue(root);
		while(!q.isEmpty()){
			BinaryTreeNode<Integer> temp=q.dequeue();
				
			System.out.print(temp.left.data+" "+temp.right.data);
			System.out.println();
			q.enqueue(temp.left);
			q.enqueue(temp.right);
		}

	}
	//1 2 3 4 5 6 7 8 -1 9 -1 10 -1 11 -1 -1 -1 -1 -1 -1 -1 -1 -1 
	public static void main(String[] args) throws QueueEmptyException {
		// TODO Auto-generated method stub
		 BinaryTreeNode<Integer> root= BinaryTreeUse.takeInputLevelWise();
		 printLevelWise(root);
		 
	}*/

	public static void printLevelWise(BinaryTreeNode<Integer> root) throws QueueEmptyException	{

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

	public static void main(String[] args) throws QueueEmptyException {
		BinaryTreeNode<Integer> root = BinaryTreeUse.takeInputLevelWise();
		printLevelWise(root);
	}
}

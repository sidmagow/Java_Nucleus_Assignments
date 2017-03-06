package LECTURE13;

import java.util.ArrayList;

public class TreeNode<T>{
	public T data;
	public ArrayList<TreeNode<T>> children;
	
	public TreeNode(T data) {
		children = new ArrayList<TreeNode<T>>();
		this.data = data;
	}

}

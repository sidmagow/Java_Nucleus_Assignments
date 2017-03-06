package LECTURE18;

import java.util.ArrayList;

public class PriorityQueues {
	ArrayList<Integer> heap;
	//	int nextIndex;

	public PriorityQueues() {
		heap = new ArrayList<Integer>();
		heap.add(null);
		//		nextIndex = 1;
	}

	public int size() {
		return heap.size() - 1;
	}

	public boolean isEmpty() {
		return size() == 0;
	}

	public int min() {
		if(size() == 0) {
			// TODO throe exception
			return 0;
		}
		return heap.get(1);
	}

	public void insert(int value) {
		heap.add(value);

		// up Heapify
		// need to know the parent of the children
		int childIndex = heap.size() - 1;
		int parentIndex = childIndex / 2;
		while(childIndex > 1) {
			if(heap.get(parentIndex) < heap.get(childIndex)) {
				return;
			}
			else {
				int temp = heap.get(childIndex);
				heap.set(childIndex, heap.get(parentIndex));
				heap.set(parentIndex, temp);
			//updation
			childIndex = parentIndex;
				parentIndex = childIndex / 2;
			}
		}
	}

	public int rempveMin() {
		if(size() == 0) {
			// TODO throe exception
			return 0;
		}
		int minAns = heap.get(1);
		heap.set(1, heap.get(heap.size()-1));
		heap.remove(heap.size()-1);

		// Down heapify
		int parentIndex = 1;
		//need to know the children
		int leftChildIndex = 2 * parentIndex;
		int rightChildIndex = leftChildIndex + 1;
		while(parentIndex < heap.size()-1) {
			//			int min = Math.min(heap.get(parentIndex), 
			//					Math.min(heap.get(leftChildIndex), 
			//							heap.get(rightChildIndex)));

			int minIndex = parentIndex;
			if(leftChildIndex < heap.size()) {
				if(heap.get(minIndex) > heap.get(leftChildIndex)) {
					minIndex = leftChildIndex;
				}
			}

			if(rightChildIndex < heap.size()) {
				if(heap.get(minIndex) > heap.get(rightChildIndex)) {
					minIndex = rightChildIndex;
				}
			}
			if(parentIndex == minIndex) {
				return minAns;
			}

			int temp = heap.get(parentIndex);
			heap.set(parentIndex, heap.get(minIndex));
			heap.set(minIndex, temp);
//updation
			parentIndex = minIndex;
			leftChildIndex = 2 * parentIndex;
			rightChildIndex = leftChildIndex + 1;
		}
		return minAns;
	}







}

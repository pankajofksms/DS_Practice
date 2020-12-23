package com.practice.prepBytes.queue;

import java.util.*;

class GFG {

	public static Queue<Integer> reverse(Queue<Integer> q) {

		Queue<Integer> result = new LinkedList<>();
		int size = q.size();

		for (int i = 0; i < size; i++) {

			for (int j = 0; j < q.size() - 1; j++) {
				q.add(q.poll());
			}
			result.add(q.poll());
		}
		return result;
	}

	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<>();

		// Insert elements
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		q.add(5);

		q = reverse(q);

		// Print the queue
		while (!q.isEmpty()) {
			System.out.print(q.peek() + " ");
			q.remove();
		}
	}
}


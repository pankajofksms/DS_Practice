package com.practice.iteration;

public class LinkedList {

	Node head;

	static class Node {
		int value;
		Node next;

		Node(int data) {
			this.value = data;
		}
	}

	public static LinkedList insert(LinkedList list, int data) {
		Node newNode = new Node(data);
		newNode.next = null;
		if (list.head == null)
			list.head = newNode;
		else {
			Node last = list.head;
			while (last.next != null) {
				last = last.next;
			}
			last.next = newNode;
		}
		return list;

	}

	public static void printList(Node head) {
		Node current = head;
		while (current != null) {
			System.out.println(current.value);
			current = current.next;
		}
	}

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		insert(list, 1);
		insert(list, 2);
		insert(list, 3);
		insert(list, 4);
		insert(list, 5);
		insert(list, 6);
		insert(list, 7);
		insert(list, 8);
		insert(list, 9);

		printList(list.head);
	}
}

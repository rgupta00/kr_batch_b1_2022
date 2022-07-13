package com.a.inner_classes.ll;



class LinkList {
	class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	Node head, tail = null;

	public void addNode(int data) {
		Node temp = new Node(data);
		if (head == null) {
			head = temp;
			tail = temp;
		} else {
			tail.next = temp;
			tail = temp;
		}
	}

	public void display() {
		Node currNode = head;
		if (currNode == null)
			System.out.println("no node to display");
		else {
			while (currNode != null) {
				System.out.println(currNode.data + " -> ");
				currNode = currNode.next;
			}
		}
	}
}

public class DemoLL {

	public static void main(String[] args) {
		LinkList ll=new LinkList();
		ll.addNode(55);
		ll.addNode(5);
		ll.addNode(505);
		ll.addNode(35);
		
		ll.addNode(95);
		
		ll.addNode(9);
		
		ll.display();
	}

}

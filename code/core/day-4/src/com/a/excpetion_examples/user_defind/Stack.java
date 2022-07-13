package com.a.excpetion_examples.user_defind;

public class Stack {

	private Emp arr[];
	private int SIZE;
	private int top;

	public Stack() {
		SIZE = 5;
		arr = new Emp[5];
		top = -1;
	}

	public void push(Emp emp) {
		// let assume he is using LL(Link list)
		if (top == SIZE - 1)
			System.out.println("cant insert");
		else
			arr[++top] = emp;
	}

	public Emp pop() {
		if (top == -1) {
			System.out.println("stack is empty");
			throw new IllegalStateException();
		}
		Emp emp=arr[top];
		arr[top]=null;
		top--;
		return emp;
	}
}

package com.f.generics.stack;

import java.lang.reflect.Array;

//if your logic is same but datatype is changing then u can go for template / generic class

public class Stack<E> {
	private E arr[];
	private int SIZE;
	private int top;

	public Stack(Class<E> clazz) {
		SIZE = 5;
		arr = (E[]) Array.newInstance(clazz,SIZE );	//java reflection*
		top = -1;
	}

	public void push(E data) {
		if (top == SIZE - 1)
			System.out.println("cant insert");
		else
			arr[++top] = data;
	}

	public E pop() {
		if (top == -1) {
			System.out.println("stack is empty");
			throw new StackEmptyException();
		}
		return arr[top--];
	}
}

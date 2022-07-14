package com.c.collections.queue;

import java.util.*;

public class B_QueuePriorityQue2 {

	public static void main(String[] args) {
		// how to use it ?
		PriorityQueue<Job> priorityQueue = new PriorityQueue<>();

		priorityQueue.offer(new Job(12, 65));

		priorityQueue.offer(new Job(2, 85));
		priorityQueue.offer(new Job(177, 95));
		priorityQueue.offer(new Job(2, 680));

		// correct way to print it
		while (!priorityQueue.isEmpty()) {
			System.out.println(priorityQueue.poll());
		}

	}

}

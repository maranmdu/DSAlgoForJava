package com.maran.queue;

public class QueueApp {

	public static void main(String[] args) throws Exception {
		QueueImplWithStack qu = new QueueImplWithStack();
		qu.enqueue("Murugan");
		qu.enqueue("senthil");
		qu.enqueue("Hari");
		qu.enqueue("Haran");
		qu.enqueue("Harini");
		
		
		System.out.println("Initial Size of enqueue " + qu.enqueue.size());
		System.out.println("Initial size of dequeue " + qu.dequeue.size());
		System.out.println(qu.dequeue());
		qu.enqueue("Harini2");
		
		System.out.println(qu.dequeue());
		System.out.println(qu.dequeue());
		System.out.println(qu.dequeue());
		System.out.println(qu.dequeue());
		System.out.println(qu.enqueue.size());
		System.out.println(qu.dequeue.size());
		System.out.println(qu.dequeue());

	}

}

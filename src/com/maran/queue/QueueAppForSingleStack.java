package com.maran.queue;

public class QueueAppForSingleStack {

	public static void main(String[] args) throws Exception {
		QueueImplWithStack qu = new QueueImplWithStack();
		qu.enqueue("Murugan");
		qu.enqueue("senthil");
		qu.enqueue("Hari");
		qu.enqueue("Haran");
		qu.enqueue("Harini");
		System.out.println(qu.dequeue());
		System.out.println(qu.dequeue());
		qu.enqueue("Harini2");
		System.out.println(qu.dequeue());
		System.out.println(qu.dequeue());
		
	}

}

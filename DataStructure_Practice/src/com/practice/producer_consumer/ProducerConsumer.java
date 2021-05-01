package com.practice.producer_consumer;

import java.util.LinkedList;

public class ProducerConsumer {
	static final int CAPACITY = 2;
	int value = 0;
	LinkedList<Integer> list = new LinkedList<>();

	public static void main(String[] args) {
		Thread producer = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					new ProducerConsumer().produce();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});

		Thread consumer = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					new ProducerConsumer().consume();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});

		producer.start();
		consumer.start();

		try {
			producer.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		try {
			consumer.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	public void produce() throws InterruptedException {

		while (true) {
			synchronized (this) {
				if (list.size() == CAPACITY)
					wait();
				System.out.println("Producer producing -->" + value);
				list.add(value++);
				notify();
				Thread.sleep(1000);
			}
		}

	}

	public void consume() throws InterruptedException {

		while (true) {
			synchronized (this) {
				if (list.size() == 0)
					wait();
				System.out.println("Consumer consuming -->" + value);
				list.remove(value);
				notify();
				Thread.sleep(1000);
			}
		}

	}

}

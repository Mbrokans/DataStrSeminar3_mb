package service;

import Datastr.MyHeap;

public class Mainservice {
	public static void main( String[]args) {
	MyHeap<Integer> heapForInt = new MyHeap<Integer>();
	try {
		heapForInt.add(10);
		heapForInt.add(20);
		heapForInt.add(30);
		heapForInt.print();
	}
	catch (Exception e) {
		System.out.println(e.getMessage());
	}
	}
}

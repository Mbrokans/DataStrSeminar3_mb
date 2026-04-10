package service;

public class RecursiveService {
	public static void main(String[] args) {
		function1(1);
	}
	public static void function1(int N) {
		if(N < 10) {
			System.out.println("N vertiba: " +N);
			function1(N+1);
		}
	}
}

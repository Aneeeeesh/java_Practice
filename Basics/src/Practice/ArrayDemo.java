package Practice;

import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] Array = new int[3];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i<Array.length;i++) {
			Array[i] = sc.nextInt();
		}
		for (int i : Array) System.out.print(i + " ");
	}

}
package Practice;

import java.util.Scanner;

public class Binary_2_Int {
	
	static int bin2int(String s) {
		String reverse = "";
		int bin = 0;
		for (int i = s.length()-1; i>=0 ; i--) {
			reverse += s.charAt(i);	
		}
		for (int i=0; i<reverse.length();i++) {
			if (reverse.charAt(i)=='1') bin += Math.pow(2, i);
		}
		return bin;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println(bin2int(sc.nextLine()));
	}

}

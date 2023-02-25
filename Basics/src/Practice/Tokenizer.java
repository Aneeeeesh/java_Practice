package Practice;

import java.util.StringTokenizer;

public class Tokenizer {

	public static void main(String[] args) {
		
		String s = "hello#there#beautiful";
		StringTokenizer st = new StringTokenizer(s,"#");
		System.out.println(st.nextToken());
		System.out.println(st.nextToken());

	}

}

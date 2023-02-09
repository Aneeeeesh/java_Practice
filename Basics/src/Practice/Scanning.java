package Practice;
import java.util.*;

public class Scanning {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
        scan.nextLine();			//code after reading double will read the 
        							//next empty line and terminate so for the 
        							//code to proceed and accept new input we 
        							//are adding one more scan.nextLine(); this 
        							//way after reading the empty line code will move 
        							//to next like where we would provide valid value
        String s = scan.nextLine();

        // Write your code here.

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}

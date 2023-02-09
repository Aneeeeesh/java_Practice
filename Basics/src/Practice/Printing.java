package Practice;
import java.util.*;

public class Printing {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String s1=sc.next();
            int x=sc.nextInt();

            System.out.printf("%-15s%03d%n",s1,x); //"%-15s%03d\n", s1, x : here % prints
            									   //the string, -15s gives 15 white 
            										//spaces in left side if it is +15 it
            										//will give right side 15 spaces and 
            										//%03d print the read integer in 3 
            										//digits (even though you read 2 or 1
            										//or 5 it makes it 3 digits and print)
            										//and \n will help to print in next 
            										//line, S1 is the string input, "x" 
            										//is integer input.
        }
        System.out.println("================================");
	}

}

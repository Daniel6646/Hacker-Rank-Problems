package Hackerrank;

import java.util.Scanner;

public class Int_to_String {

		 public static void main(String[] args) {

		  try {
		   Scanner in = new Scanner(System.in);
		   int n = in .nextInt();
		   in.close();
		   //String s=???; Complete this line below

		   String s = String.valueOf(n);
		   //String s = Integer.toString(n);
		   //

		   
		   if (n == Integer.parseInt(s)) {
		    System.out.println("Good job");
		   } else {
		    System.out.println("Wrong answer.");
		   }
		  } catch (DoNotTerminate.ExitTrappedException e) {
		   System.out.println("Unsuccessful Termination!!");
		  }
		 }
}




/*
 * You are given an integer , you have to convert it into a string.
 * 
 * Please complete the partially completed code in the editor. If your code
 * successfully converts into a string the code will print "Good job". Otherwise
 * it will print "Wrong answer".
 * 
 * can range between to inclusive.
 * 
 * Sample Input 0
 * 
 * 100 Sample Output 0
 * 
 * Good job
 */

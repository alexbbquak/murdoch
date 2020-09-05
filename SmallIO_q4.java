//File name: SmallIO.java

import java.util.Scanner;

public class SmallIO_q4{

	public static void main(String[] args){

		Scanner keyboard = new Scanner (System.in);

		int a;
		int i; // variable for loop

		for (i=0;i<5;i++) { // loop 5 times

			System.out.println("Enter a line:");

			a = keyboard.nextInt();

			System.out.println("Your line: " + a);

			System.out.println();
		}

	}//end of main

}//end of class



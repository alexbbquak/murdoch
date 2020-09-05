//File name: SmallIO.java

import java.util.Scanner;

public class SmallIO_q5{

	public static void main(String[] args){

		Scanner keyboard = new Scanner (System.in);

		int a = 0;   // initialise to integer so that while loop can run


		while (a != -999){
			
			System.out.println("Enter a line:");

			a = keyboard.nextInt();

			System.out.println("Your line: " + a);

			System.out.println();

			System.out.println("Enter -999 to quit or any other number to continue.");
		
			if (a == -999){
				System.out.println("Quitting...");
				break;
			}
		}//end of while

		keyboard.close();

	}//end of main

}//end of class



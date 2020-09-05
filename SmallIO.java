//File name: SmallIO.java

import java.util.Scanner;

public class SmallIO{

	public static void main(String[] args){

		Scanner keyboard = new Scanner (System.in);

		String a = "";   // initialise to empty string

		while (true){
			//an infinite loop, use Ctrl-C (from command prompt) to quit

			System.out.println("Enter a line:");

			a = keyboard.nextLine();

			System.out.println("Your line: " + a);

			System.out.println();
		}//end of while

	}//end of main

}//end of class
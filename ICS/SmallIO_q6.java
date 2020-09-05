//File name: SmallIO.java

import java.util.Scanner;

public class SmallIO_q6{

	public static void main(String[] args){

		Scanner keyboard = new Scanner (System.in);

		//declare variables
		int totalSum = 0;
		float avg = 0.0f;
		int largestNum = 0, smallestNum = 0;

		int count = 0; //count for numbers entered

		String a = "";   // initialise to empty string

		while (true){
			//an infinite loop, use Ctrl-C (from command prompt) to quit

			System.out.println("Enter a line of numbers:");

			a = keyboard.nextLine();

			System.out.println("Your line: " + a);

			System.out.println();

			String array[] = a.split(" ");

			for (int i = 0; i < array.length; i++) {
				int num = Integer.parseInt(array[i]);
          		count++; //increase count
				  totalSum += num;
				  
				  if (i == 0) {
					  largestNum = smallestNum = num; //1st input
				  }
				  else if (num > largestNum) {
					largestNum = num; // store largest num
				  }
				  else {
					  if (smallestNum < num) {
					  smallestNum = num; //store smallest num
				  }
				}
				avg = totalSum / count;
			}
			
			System.out.println("Total Sum: " + totalSum);
      		System.out.println("Average so far: " + avg);
      		System.out.println("Smallest Number: " + smallestNum);
      		System.out.println("Largest Number: " + largestNum);
			
		}//end of while

	}//end of main

}//end of class
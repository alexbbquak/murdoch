package ICS;
import java.util.*;

/*
Game algorithm
==============
generate seedNumber from 1-100 (inclusive)
int seedNumber = (int)(Math.random()*100)+1;

loop
  let user enter a guess
  check if guess in valid range
    if no, show warning, back to loop let user re-enter
  
  if yes, check guess
    if guess is corret, print congrats msg
    if guess > seedNumber, print "too high"
    if guess < seedNumber , print "too low"

*/

public class Main {
    public static void main(String[] args) {
      // generate seedNumber from 1-100 (inclusive)
      int seedNumber = (int)(Math.random()*100)+1;
      System.out.println(seedNumber);
  
      while (true) {
              System.out.print("Enter a guess: ");
              int guess = keyboard.nextInt(); 
  
        // check if guess in valid range
        if (guess > 100 || guess < 1) {
          System.out.print("Your guess is not within range(1,100), please re-enter");
          continue;   // go back to start of while (line 25)
        }
        
        // if guess is corret, print congrats msg
        if (guess == seedNumber) {
          System.out.print("You got it!!");
          break; // get out of this endless loop
        }
        else if (guess > seedNumber)   // print clues
          System.out.print("Your guess is too high!!");
        else
          System.out.print("Your guess is too low!!");
  
        
              
          }//end of while
      
    }
  }

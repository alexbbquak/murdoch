import java.util.Scanner;

public class SmallIO_test
{
 public static void main(String[] args) {
  Scanner keyboard = new Scanner(System.in);
  
  //declare and initialize the totalSum with 0
  float totalSum = 0.0f;
  
  //declaring and initialize the Integer variable
  int largestNum = 0, smallestNum = 0;

        int count = 0;//count numbers entered till now
        
  //empty String
  String a = "";
  
  //infinite loop
  while(true)
  {
      //an infinite loop, use Ctrl-C (from command prompt) to quit
      System.out.println("Enter a line: ");
      
      a = keyboard.nextLine();//read the line
      
      System.out.println("Your line: "+a);
      
      //remove the extra spaces if present on any sides of string
      a= a.trim();
      
      //split the String based on space
      String arr[] = a.split(" ");
      
      //loop the array
      for(int i = 0; i < arr.length; i++)
      {
          //parsing the string at index i
          int num = Integer.parseInt(arr[i]);
          count++; //increment the numbers count
          totalSum += num;
          
          if(i == 0)
          {
              //update largestNum and smallestNum with first value
              largestNum  = smallestNum = num;
          }
          else if(num > largestNum) //if num is the more than largestNum variable
          {
              largestNum = num;
          }
          else
          {//check if num is less than smallestNum
              if(num < smallestNum)
                  smallestNum = num;
          }
      }//end of for loop
      
      //showing the numbers on the console
      System.out.println("Sum of all Numbers entered till now: "+totalSum);
      System.out.println("Average of all Numbers entered till now: "+(totalSum / count));
      System.out.println("Smallest Number till now: "+smallestNum);
      System.out.println("Largest Number till now: "+largestNum+"\n");
      
  }//end of while 
  
 }//end of main
 
}//end of class
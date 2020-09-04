import java.util.Scanner;

public class SandySmith {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        int homeNum;
        double homeCharge = 200.0;
        double squareFeetoffloor;
        double costPersquarefoot = 1.25;
        double homeRev, floorRev, totalRev;

        System.out.println("This program computes the monthly revenue of Sandy.");
        System.out.println("Please enter the number of homes worked on:");
        homeNum = keyboard.nextInt();

        System.out.println("Please enter the number of square feet of floor:");
        squareFeetoffloor = keyboard.nextDouble();

        homeRev = homeNum * homeCharge;
        floorRev = squareFeetoffloor * costPersquarefoot;

        totalRev = homeRev + floorRev;

        System.out.printf("Sandy earned a total of: $%.2f this month.", totalRev);
    }
}
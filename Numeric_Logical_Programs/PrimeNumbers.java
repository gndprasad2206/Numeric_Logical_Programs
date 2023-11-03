/* JFM1T4_Assignment3:
   Write a program to print all the prime numbers between 2 numbers.
   Prompt the user to enter the 2 numbers.
   
   Sample Input:
   Enter starting Number: 20
   Enter ending Number: 30

   Expected Output:
   Prime numbers between 20 and 30 are : 
   23
   29

*/

//import statements for java program to read inputs using Scanner class 
import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {// Add main method here
        int starting_Number, ending_Number, count = 0;// Declare variables num1, num2, i, count and initialize count as
                                                      // zero
        Scanner sc = new Scanner(System.in);
        // Use the scanner class to provide input at execution time using scanner object
        // Scanner s= new Scanner(System.in);
        System.out.println("Enter the Starting number");
        starting_Number = sc.nextInt();
        System.out.println("Enter the ending number");
        ending_Number = sc.nextInt();

        int duplicate = starting_Number;
        int i = 1;
        while (duplicate <= ending_Number) {

            while (i <= duplicate) {
                if (duplicate % i == 0) {
                    count++;
                }
                i++;

            }

            if (count == 2) {
                System.out.println(duplicate);
            }
            duplicate++;
        }
    }
}
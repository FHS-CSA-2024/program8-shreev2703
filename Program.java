import java.util.Scanner;
import java.lang.Math;

class Program {
    public static void main(String[] args) {
        // Create a scanner object to take input from the user
        Scanner myScanner = new Scanner(System.in); 

        // Prompt the user to input the first integer
        System.out.println("Enter number 1: ");
        int numA = myScanner.nextInt(); 

        // Prompt the user to input the second integer
        System.out.println("Enter number 2: ");
        int numB = myScanner.nextInt(); 

        // Print out the original numbers
        System.out.println("Original numbers are " + numA + " and " + numB); 

        // Calculate the sum of the two numbers
        int sum = numA + numB; 
        System.out.println("Sum = " + sum);

        // Calculate the difference between the two numbers
        int diff = numA - numB; 
        System.out.println("Difference = " + diff); 

        // Calculate the product of the two numbers
        int prod = numA * numB; 
        System.out.println("Product = " + prod); 

        // Calculate the average of the two numbers
        double avg = (double)(numA + numB) / 2.0; 
        System.out.println("Average = " + avg); 

        // Calculate the absolute value of the difference between the two numbers
        int dist = Math.abs(numA - numB);
        System.out.println("Absolute value = " + dist); 

        // Calculate the maximum using the formula (a + b + |a - b|) / 2
        int max = (numA + numB + Math.abs(numA - numB)) / 2; 
        System.out.println("Maximum = " + max); 

        // Calculate the minimum using the formula (a + b - |a - b|) / 2
        int min = (numA + numB - Math.abs(numA - numB)) / 2; 
        System.out.println("Minimum = " + min); 
    }
}

import java.util.Scanner;

public class Backwards {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter 5 digits: ");
        String input = sc.nextLine();  // This code and above initializes the scanner
        int length = input.length(); // this makes the length of the of the string = length
        int i = 0, j = length - 1; // starts count i at counter and makes j = length-1 to go through elements of the array
        if(length != 5){  // This checks if the input is not equal to a length of 5
            System.out.println("Try Again");
            main(args);  // This calls the main method to restart the program
        } else {
            while (i < j) {
                if (input.charAt(i) != input.charAt(j)) { // comparing index i to index j
                    System.out.println("Not a Palindrome");
                } else {
                    System.out.println(input + " is a Palindrome");

                }
                i++; // increments through the length of i
                j--; // decrements through the length of j
            }
        }
    }
}

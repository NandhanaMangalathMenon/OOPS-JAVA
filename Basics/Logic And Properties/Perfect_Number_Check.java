// Program to check whether a given number is a Perfect number

//A Perfect number is a number whose sum of its proper divisors is equal to the number itself.

import java.util.Scanner;
public class Perfect_Number_Check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        int number = sc.nextInt();

	        int sum = 0;

	        // Find sum of proper divisors
	        for (int i = 1; i <= number / 2; i++) {
	            if (number % i == 0) {
	                sum = sum + i;
	            }
	        }

	        if (sum == number && number != 0) {
	            System.out.println(number + " is a Perfect number");
	        } else {
	            System.out.println("Not perfect.");
	        }

	        sc.close();

	}

}

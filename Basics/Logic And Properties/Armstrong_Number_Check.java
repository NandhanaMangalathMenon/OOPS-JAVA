// Program to check whether a given number is an Armstrong number

import java.util.Scanner;
public class Armstrong_Number_Check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        int number = sc.nextInt();

	        int originalNumber = number;
	        int temp = number;
	        int digits = 0;
	        int sum = 0;

	        // Count number of digits
	        while (temp > 0) {
	            digits++;
	            temp = temp / 10;
	        }

	        temp = number;

	        // Calculate Armstrong sum
	        while (temp > 0) {
	            int remainder = temp % 10;
	            int powerValue = 1;

	            for (int i = 1; i <= digits; i++) {
	                powerValue = powerValue * remainder;
	            }

	            sum = sum + powerValue;
	            temp = temp / 10;
	        }

	        if (sum == originalNumber) {
	            System.out.println(originalNumber + " is an Armstrong number");
	        } else {
	            System.out.println(originalNumber + " is not an Armstrong number");
	        }

	        sc.close();

	}

}

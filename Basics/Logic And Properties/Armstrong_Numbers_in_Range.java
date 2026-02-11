// Program to display Armstrong numbers within a given range

//An Armstrong number is a number where:
//Sum of each digit raised to the power of total number of digits = the number itself

import java.util.Scanner;
public class Armstrong_Numbers_in_Range {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter starting number: ");
        int start = sc.nextInt();

        System.out.print("Enter ending number: ");
        int end = sc.nextInt();

        for (int num = start; num <= end; num++) {

            int originalNumber = num;
            int sum = 0;
            int digits = 0;
            int temp = num;
//The variable temp is used to preserve the original number while extracting digits for calculation.
            
            // Count number of digits
            while (temp > 0) {
                digits++;
                temp = temp / 10;
            }

            temp = num;

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
                System.out.print(originalNumber + " ");
            }
        }

        sc.close();

	}

}

// Program to check whether a given number is prime

import java.util.Scanner;
public class Prime_Number_Check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        boolean prime = true;

        if (number <= 1) {
            prime = false;
        } else {
            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    prime = false;
                    break;
                }
            }
        }

        if (prime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }

        sc.close();

	}

}

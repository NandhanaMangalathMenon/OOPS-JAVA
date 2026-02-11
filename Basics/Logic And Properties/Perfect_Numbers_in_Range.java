// Program to display Perfect numbers within a given range

//A Perfect number is a number whose sum of its proper divisors (excluding the number itself) is equal to the number.

import java.util.Scanner;
public class Perfect_Numbers_in_Range {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter starting number: ");
        int start = sc.nextInt();

        System.out.print("Enter ending number: ");
        int end = sc.nextInt();

        for (int num = start; num <= end; num++) {

            int sum = 0;

            // Find proper divisors and add them
            for (int i = 1; i <= num / 2; i++) {
                if (num % i == 0) {
                    sum = sum + i;
                }
            }

            if (sum == num && num != 0) {
                System.out.print(num + " ");
            }
        }

        sc.close();

	}

}

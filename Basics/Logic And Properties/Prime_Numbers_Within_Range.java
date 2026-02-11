// Program to display all prime numbers within a given range

import java.util.Scanner;
public class Prime_Numbers_Within_Range {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  Scanner sc = new Scanner(System.in);

	        System.out.print("Enter starting number: ");
	        int start = sc.nextInt();

	        System.out.print("Enter ending number: ");
	        int end = sc.nextInt();

	        for (int num = start; num <= end; num++) {

	            if (num < 2) {
	                continue;
	            }

	            boolean isPrime = true;

	            for (int i = 2; i <= num / 2; i++) {
	                if (num % i == 0) {
	                    isPrime = false;
	                    break;
	                }
	            }

	            if (isPrime) {
	                System.out.print(num + " ");
	            }
	        }

	        sc.close();

	}

}

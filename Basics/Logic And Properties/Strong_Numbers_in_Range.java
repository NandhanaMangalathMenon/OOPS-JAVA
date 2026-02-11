// Program to find all Strong Numbers within a given range.

//A Strong Number is a number where:
//sum of factorial of each digit = the number itself

import java.util.Scanner;
public class Strong_Numbers_in_Range {
	
	 // method to find factorial of a digit
    static int factorial(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;
    }

    // method to check strong number
    static boolean isStrong(int num) {
        int temp = num;
        int sum = 0;

        while (temp > 0) {
            int digit = temp % 10;
            sum = sum + factorial(digit);
            temp = temp / 10;
        }

        return sum == num;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner sc = new Scanner(System.in);

	        System.out.print("Enter starting number: ");
	        int start = sc.nextInt();

	        System.out.print("Enter ending number: ");
	        int end = sc.nextInt();

	        System.out.println("Strong numbers in the range:");

	        for (int i = start; i <= end; i++) {
	            if (isStrong(i)) {
	                System.out.print(i + " ");
	            }
	        }

	        sc.close();

	}

}

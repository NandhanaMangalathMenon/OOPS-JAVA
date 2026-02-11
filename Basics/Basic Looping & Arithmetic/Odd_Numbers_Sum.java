// Program to display n odd numbers and find their sum

import java.util.Scanner;
public class Odd_Numbers_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  Scanner sc = new Scanner(System.in);

	        System.out.print("Enter the number of terms: ");
	        int n = sc.nextInt();

	        int sum = 0;
	        int count = 0;
	        int number = 1;

	        System.out.print("The odd numbers are: ");

	        while (count < n) {
	            System.out.print(number + " ");
	            sum = sum + number;

	            number = number + 2; // move to next odd number
	            count++;
	        }

	        System.out.println();
	        System.out.println("Sum = " + sum);

	        sc.close();

	}

}

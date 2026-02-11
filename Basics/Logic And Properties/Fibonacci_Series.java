// Program to display the first n terms of the Fibonacci series

import java.util.Scanner;
public class Fibonacci_Series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner sc = new Scanner(System.in);

	        System.out.print("Enter the number of terms: ");
	        int n = sc.nextInt();

	        int first = 0;
	        int second = 1;
	        int i = 0;

	        while (i < n) {
	            System.out.print(first + " ");

	            int nextNumber = first + second;
	            first = second;
	            second = nextNumber;

	            i++;
	        }

	        sc.close();

	}

}

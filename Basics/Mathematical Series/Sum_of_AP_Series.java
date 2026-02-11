// Program to find the sum of an Arithmetic Progression series.
//An Arithmetic Progression is a series where the difference between terms is constant.

import java.util.Scanner;
public class Sum_of_AP_Series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner sc = new Scanner(System.in);

	        System.out.print("Enter the first term: ");
	        int a = sc.nextInt();

	        System.out.print("Enter the number of terms: ");
	        int n = sc.nextInt();

	        System.out.print("Enter the common difference: ");
	        int d = sc.nextInt();

	        int sum;

	        sum = (n * (2 * a + (n - 1) * d)) / 2;

	        System.out.println("Sum of A.P. series = " + sum);
	        sc.close();

	}

}

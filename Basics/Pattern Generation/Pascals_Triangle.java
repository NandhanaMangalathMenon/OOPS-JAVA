// Program to display Pascal’s Triangle using a 2D array

import java.util.Scanner;

public class Pascals_Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner sc = new Scanner(System.in);

	        System.out.print("Enter number of rows: ");
	        int n = sc.nextInt();

	        int[][] triangle = new int[n][n];

	        for (int i = 0; i < n; i++) {

	            // First and last value of every row is 1
	            triangle[i][0] = 1;
	            triangle[i][i] = 1;

	            // Fill remaining values
	            for (int j = 1; j < i; j++) {
	                triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
	            }
	        }

	        // Print Pascal's Triangle
	        for (int i = 0; i < n; i++) {

	            // Space control for triangle shape
	            for (int space = 1; space <= n - i; space++) {
	                System.out.print(" ");
	            }

	            for (int j = 0; j <= i; j++) {
	                System.out.print(triangle[i][j] + " ");
	            }

	            System.out.println();
	        }

	        sc.close();

	}

}

// Program to display square natural numbers and find their sum.

import java.util.Scanner;
public class Square_Natural_Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner sc = new Scanner(System.in);

	        System.out.print("Enter number of terms: ");
	        int n = sc.nextInt();

	        int sum = 0;

	        for (int i = 1; i <= n; i++) {
	            int square = i * i;
	            System.out.print(square + " ");
	            sum = sum + square;
	        }

	        System.out.println(", Sum: " + sum);
	        sc.close();

	}

}

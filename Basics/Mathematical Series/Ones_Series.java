// Program to find the sum of the series 1 + 11 + 111 + ... up to n terms.


import java.util.Scanner;
public class Ones_Series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner sc = new Scanner(System.in);

	        System.out.print("Enter number of terms: ");
	        int n = sc.nextInt();

	        int term = 0;
	        int sum = 0;

	        for (int i = 1; i <= n; i++) {
	            term = term * 10 + 1;   // forms 1, 11, 111, ...
	            sum = sum + term;
	        }

	        System.out.println("Sum of series = " + sum);
	        sc.close();

	}

}

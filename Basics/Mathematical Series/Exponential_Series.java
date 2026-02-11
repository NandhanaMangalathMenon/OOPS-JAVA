// Program to find the sum of the exponential series 1 + x + x^2/2! + x^3/3! + ...


import java.util.Scanner;
public class Exponential_Series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner sc = new Scanner(System.in);

	        System.out.print("Enter value of x: ");
	        int x = sc.nextInt();

	        System.out.print("Enter number of terms: ");
	        int n = sc.nextInt();

	        double sum = 1.0;   // first term is 1
	        double term = 1.0;  // stores x^i / i!
	        
//	        next term = previous term × x / i


	        for (int i = 1; i < n; i++) {
	            term = term * x / i;   // builds next term
	            sum = sum + term;
	        }

	        System.out.printf("Sum of series = %.6f", sum);
	        sc.close();

	}

}

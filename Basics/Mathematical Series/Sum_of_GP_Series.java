// Program to find the sum of a Geometric Progression series.
//A Geometric Progression is a series where each term is multiplied by a fixed number

import java.util.Scanner;
public class Sum_of_GP_Series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner sc = new Scanner(System.in);

	        double a = sc.nextDouble();   // first term
	        int n = sc.nextInt();         // number of terms
	        double r = sc.nextDouble();   // common ratio

	        double sum;

	        sum = a * (Math.pow(r, n) - 1) / (r - 1);

	        System.out.printf("%.6f", sum);
	        //Print a floating-point number with exactly 6 digits after the decimal point
	        sc.close();

	}

}

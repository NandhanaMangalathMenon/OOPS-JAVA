// Program to find the sum of the series x − x^3 + x^5 − ... up to n terms.

import java.util.Scanner;
public class Alternate_Sum_Series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of x: ");
        int x = sc.nextInt();

        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();

        int sum = 0;
        int sign = 1;   // +1 for plus, -1 for minus

        for (int i = 0; i < n; i++) {
            int power = 2 * i + 1;   // 1, 3, 5, 7, ...
            sum = sum + sign * (int)Math.pow(x, power);
            sign = -sign;            // change sign
        }

        System.out.println("Sum of series = " + sum);
        sc.close();

	}

}

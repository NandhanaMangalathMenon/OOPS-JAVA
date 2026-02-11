// Program to display a given number in reverse order.

import java.util.Scanner;
public class Reverse_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        int num = sc.nextInt();

	        int rev = 0;

	        while (num > 0) {
	            rev = rev * 10 + (num % 10);
	            num = num / 10;
	        }

	        System.out.println("Reversed number: " + rev);
	        sc.close();

	}

}

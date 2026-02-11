// Program to check whether a given number is a Strong Number.

import java.util.Scanner;
public class Strong_Number_Check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        int num = sc.nextInt();
//temp is used to protect the original number while extracting digits.
	        int temp = num;
	        int sum = 0;

	        while (temp > 0) {
	            int digit = temp % 10;

	            int fact = 1;
	            for (int i = 1; i <= digit; i++) {
	                fact = fact * i;
	            }

	            sum = sum + fact;
	            temp = temp / 10;
	        }

	        if (sum == num) {
	            System.out.println(num + " is a Strong number.");
	        } else {
	            System.out.println(num + " is not a Strong number.");
	        }

	        sc.close();

	}

}

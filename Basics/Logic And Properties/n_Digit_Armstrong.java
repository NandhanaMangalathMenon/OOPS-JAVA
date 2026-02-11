// Program to check whether a given number is an n-digit Armstrong number.

//A number is an Armstrong number if:
//(sum of each digit raised to power of total digits) = number itself

import java.util.Scanner;
public class n_Digit_Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		 System.out.print("Enter a number: ");
	        int num = sc.nextInt();

	        int original = num;
	        int digits = 0;
	        int temp = num;
	        
//temp is a temporary copy of the number that we use for calculations without destroying the original number.
//	        the value of num keeps changing and finally becomes 0.
//	        But we still need:
//	        the original number for comparison
//	        the original number to print at the end
//	        So we never directly change num.
//	        Instead, we copy it into temp.
	        
	        
	        //  count digits
	        while (temp != 0) {
	            digits++;
	            temp = temp / 10;
	        }

	        int sum = 0;
	        temp = num;

	        //  Calculate Armstrong sum
	        while (temp != 0) {
	            int rem = temp % 10;
	            int power = 1;

	            for (int i = 1; i <= digits; i++) {
	                power = power * rem;
	            }

	            sum = sum + power;
	            temp = temp / 10;
	        }

	        // Check result
	        if (sum == original) {
	            System.out.println(original + " is an Armstrong number.");
	        } else {
	            System.out.println(original + " is not an Armstrong number.");
	        }

	        sc.close();

	}

}

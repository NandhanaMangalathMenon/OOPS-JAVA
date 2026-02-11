// Program to check whether a given number is a palindrome.


import java.util.Scanner;
public class Palindrome_Number_Check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();
//Usage of temp:
//So we can reverse the number without changing the original value.
        int temp = num;
        int rev = 0;

        while (temp > 0) {
            int digit = temp % 10;
            rev = rev * 10 + digit;
            temp = temp / 10;
        }

        if (rev == num) {
            System.out.println(num + " is a palindrome.");
        } else {
            System.out.println(num + " is not a palindrome.");
        }

        sc.close();

	}

}

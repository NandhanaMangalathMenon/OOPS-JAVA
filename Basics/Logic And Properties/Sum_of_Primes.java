//// Program to check whether a number can be expressed as the sum of two prime numbers.


import java.util.Scanner;
public class Sum_of_Primes {
	
	//Note: This is a method definition, not execution.
	
//	Inside class but outside main()
//	Things that:
//	are reusable
//	define behavior
//	are not execution steps
	
	 static boolean isPrime(int n) {
	        if (n < 2)
	            return false;

	        for (int i = 2; i <= n / 2; i++) {
	            if (n % i == 0)
	                return false;
	        }
	        return true;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        int num = sc.nextInt();

	        boolean found = false;

	        for (int i = 2; i <= num / 2; i++) {

	            if (isPrime(i) && isPrime(num - i)) {
	                System.out.println(num + "=" + i + "+" + (num - i));
	                found = true;
	            }
	        }

	        if (!found) {
	            System.out.println("No prime sum possible.");
	        }

	        sc.close();

	}

}

// This program calculates the factorial of a given number using a for loop
public class Factorial_Calculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		   int number = 5;      // given test data
	        int result = 1;      // factorial starts from 1

	        // loop multiplies numbers from 1 to the given number
	        for (int i = 1; i <= number; i++) {
	            result = result * i;
	        }

	        System.out.println(result);   // prints 120

	}

}

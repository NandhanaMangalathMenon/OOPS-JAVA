// This program calculates the sum of the cosine series using power and factorial functions
public class Cosine_Series_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

        int x = 2;          // given value of x
        int terms = 5;      // number of terms
        double sum = 0.0;   // to store the final result
        int sign = 1;       // to alternate + and -

        for (int i = 0; i < terms; i++) {
            int power = 2 * i;
            sum = sum + sign * (power(x, power) / factorial(power));
            sign = -sign;   // changes sign for next term
        }

        System.out.println(sum);   // prints approximately -0.415873
    }

    // function to calculate power
    static double power(int x, int p) {
        double result = 1;
        for (int i = 1; i <= p; i++) {
            result = result * x;
        }
        return result;
    }

    // function to calculate factorial
    static double factorial(int n) {
        double fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;

	}

}

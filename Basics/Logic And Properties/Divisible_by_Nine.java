//// Program to find numbers between 100 and 200 divisible by 9 and their sum.

public class Divisible_by_Nine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum = 0;

        System.out.println("Numbers between 100 and 200 divisible by 9:");

        for (int i = 100; i <= 200; i++) {
            if (i % 9 == 0) {
                System.out.print(i + " ");
                sum = sum + i;
            }
        }

        System.out.println("\nSum: " + sum);

	}

}

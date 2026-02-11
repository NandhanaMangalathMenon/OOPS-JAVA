import java.util.Scanner;

public class n_terms_Sum {

    public static void main(String[] args) {

        int n, sum = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        n = sc.nextInt();

        System.out.println("First " + n + " natural numbers are:");

        for (int i = 1; i <= n; i++) {
            System.out.println(i);
            sum = sum + i;
        }

        System.out.println("Sum of first " + n + " natural numbers = " + sum);

        sc.close();
    }
}




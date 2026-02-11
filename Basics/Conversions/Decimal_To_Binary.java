// Program to convert a decimal number into binary without using an array.


import java.util.Scanner;
public class Decimal_To_Binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  //Takes decimal number

        String binary = "";

        while (n > 0) {
            int rem = n % 2;
            binary = rem + binary;   // prepend remainder
            n = n / 2;
        }

        System.out.println(binary);
        sc.close();

	}

}

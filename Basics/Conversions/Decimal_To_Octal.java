// Program to convert a decimal number into octal without using an array.
//An octal number is a number written using base 8.

import java.util.Scanner;
public class Decimal_To_Octal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        int octal = 0;
        int place = 1;

        for (; num > 0; num = num / 8) {
            int r = num % 8;
            octal = octal + r * place;
            place = place * 10;
        }

        System.out.println(octal);
        in.close();

	}

}

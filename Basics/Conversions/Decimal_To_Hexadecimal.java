// Program to convert a decimal number into hexadecimal.



//Hexadecimal is a number system with base 16.
//Base 16 means:
//It uses 16 different symbols
//Those symbols are:
// 0 1 2 3 4 5 6 7 8 9 A B C D E F


//Need of A-F
//In decimal (base 10), we only have digits 0 to 9.
//But hexadecimal needs 16 symbols, so after 9 we continue with letters:

// So,  A = 10
//      F = 15


import java.util.Scanner;
public class Decimal_To_Hexadecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();   // decimal input

        String hex = "";

        for (; num > 0; num = num / 16) {
            int rem = num % 16;

            if (rem < 10) {
                hex = rem + hex;           // 0–9
            } else {
                hex = (char)(rem + 55) + hex;  // Used when rem is 10–15 → A–F
            }
        }

        System.out.println(hex);
        sc.close();

	}

}


//Usage of ASCII Values

//In Java, characters are stored as numbers (ASCII values):

//| Character | ASCII value |
//| --------- | ----------- |
//| 'A'       | 65          |
//| 'B'       | 66          |
//| 'C'       | 67          |
//| 'D'       | 68          |
//| 'E'       | 69          |
//| 'F'       | 70          |

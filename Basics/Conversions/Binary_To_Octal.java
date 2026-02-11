// Program to convert a binary number into octal.


import java.util.Scanner;
public class Binary_To_Octal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner sc = new Scanner(System.in);
	        int bin = sc.nextInt();   // binary input

	        int decimal = 0;
	        int power = 0;

	        //  Binary to Decimal
	        
	        // 1)Takes last digit using %10
	        // 2)Multiply by 2^power
	        // 3)Add to decimal value
	        
	      
	        for (; bin > 0; bin = bin / 10) {
	            int digit = bin % 10;
	            decimal = decimal + digit * (int)Math.pow(2, power);
	            power++;
	        }

	        int octal = 0;
	        int place = 1;

	        //  Decimal to Octal
	        
	        //1) Divide decimal by 8
	        //2) Collect remainders
	        //3) Build octal number using place values
	        for (; decimal > 0; decimal = decimal / 8) {
	            int r = decimal % 8;
	            octal = octal + r * place;
	            place = place * 10;
	        }

	        System.out.println(octal);
	        sc.close();

	}

}

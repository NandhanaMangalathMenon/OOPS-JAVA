// Program to convert an octal number into decimal without using an array.


import java.util.Scanner;
public class Octal_To_Decimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
        int oct = sc.nextInt();   // octal input

        int dec = 0;
        int power = 0;
        //Loop until number becomes 0 and remove last digit each time
        for (; oct > 0; oct = oct / 10) 
        
        {
            int digit = oct % 10; //Gets the last digit
            dec = dec + digit * (int)Math.pow(8, power);
            power++;
        }

        System.out.println(dec);
        sc.close();

	}

}

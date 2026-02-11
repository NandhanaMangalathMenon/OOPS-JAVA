import java.util.Scanner;
public class Octal_To_Binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

        Scanner sc = new Scanner(System.in);
        int oct = sc.nextInt();   // octal input

        int decimal = 0;
        int p = 0;

        //  Octal to Decimal
        for (; oct > 0; oct = oct / 10) {
            int d = oct % 10;
            decimal = decimal + d * (int)Math.pow(8, p);
            p++;
        }

        int binary = 0;
        int place = 1;

        //  Decimal to Binary
        for (; decimal > 0; decimal = decimal / 2) {
            int r = decimal % 2;
            binary = binary + r * place;
            place = place * 10;
        }

        System.out.println(binary);
        sc.close();

	}

}

// Program to display multiplication tables vertically from 1 to n
import java.util.Scanner;
public class Vertical_Multiplier_Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);

	        System.out.print("Enter the value of n: ");
	        int n = sc.nextInt();

	        // Outer loop for multiplier (1 to 10)
	        for (int i = 1; i <= 10; i++) {

	            // Inner loop for tables (1 to n)
	            for (int j = 1; j <= n; j++) {
	                System.out.print(j + " x " + i + " = " + (j * i) + "\t");
	            }

	            System.out.println(); // move to next row
	        }

	        sc.close();
		

	}

}

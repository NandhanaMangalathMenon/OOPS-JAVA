// Program to calculate electricity bill based on slab rates using nested if-else

import java.util.Scanner;
public class Electricity_Billing_System {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  Scanner sc = new Scanner(System.in);

	        System.out.print("Enter units consumed: ");
	        int units = sc.nextInt();

	        System.out.print("Late payment? (1 for Yes, 0 for No): ");
	        int latePayment = sc.nextInt();

	        double billAmount = 10.0; // Base charge

	        if (units <= 100) {
	            billAmount = billAmount + (units * 0.5);

	        } else if (units <= 300) {
	            billAmount = billAmount + (100 * 0.5)
	                                       + ((units - 100) * 0.75);

	        } else {
	            billAmount = billAmount + (100 * 0.5)
	                                       + (200 * 0.75)
	                                       + ((units - 300) * 1.2);
	        }

	        // Apply late fee if applicable
	        if (latePayment == 1) {
	            billAmount = billAmount + (billAmount * 0.05);
	        }

	        System.out.println("Total Bill: $" + billAmount);

	        sc.close();

	}

}

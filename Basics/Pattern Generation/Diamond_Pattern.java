// Program to display a diamond pattern using asterisks
public class Diamond_Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  int rows = 4;

	        // Upper half of the diamond
	        for (int i = 1; i <= rows; i++) {

	            // Print spaces
	            for (int space = 1; space <= rows - i; space++) {
	                System.out.print(" ");
	            }

	            // Print asterisks
	            for (int star = 1; star <= (2 * i - 1); star++) {
	                System.out.print("*");
	            }

	            System.out.println();
	        }
	        
	        // Lower half of the diamond
	        for (int i = rows - 1; i >= 1; i--) {

	            // Print spaces
	            for (int space = 1; space <= rows - i; space++) {
	                System.out.print(" ");
	            }

	            // Print asterisks
	            for (int star = 1; star <= (2 * i - 1); star++) {
	                System.out.print("*");
	            }

	            System.out.println();
	        }

	}

}

// Program to display an asterisk pyramid using space padding and nested loops
public class Asterisk_Pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		   int rows = 4;

	        for (int i = 1; i <= rows; i++) {

	            // Print spaces for center alignment
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

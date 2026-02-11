// Program to display a number pyramid with numbers increased by 1
public class Number_Pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  int rows = 4;
	        int number = 1;   // external counter variable

	        for (int i = 1; i <= rows; i++) {

	            // Print spaces for center alignment
	            for (int space = 1; space <= rows - i; space++) {
	                System.out.print(" ");
	            }

	            // Print increasing numbers
	            for (int j = 1; j <= i; j++) {
	                System.out.print(number + " ");
	                number++;
	            }

	            System.out.println();
	        }

	}

}

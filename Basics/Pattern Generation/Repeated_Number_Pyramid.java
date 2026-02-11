// Program to display a repeated number pyramid using nested loops and spaces
public class Repeated_Number_Pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int rows = 3;

        for (int i = 1; i <= rows; i++) {

            // Print spaces for pyramid alignment
            for (int space = 1; space <= rows - i; space++) {
                System.out.print(" ");
            }

            // Print repeated numbers in the same row
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }

            System.out.println();
        }

	}

}

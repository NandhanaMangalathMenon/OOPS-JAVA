// Program to display a palindrome number pattern starting and ending with 1
public class Palindrome_Number_Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int rows = 3;

	        for (int i = 1; i <= rows; i++) {

	            // Ascending numbers
	            for (int j = 1; j <= i; j++) {
	                System.out.print(j);
	            }

	            // Descending numbers
	            for (int j = i - 1; j >= 1; j--) {
	                System.out.print(j);
	            }

	            System.out.println();
	        }

	}

}

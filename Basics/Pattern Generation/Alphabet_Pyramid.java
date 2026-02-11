// Program to display an alphabet pyramid using character increments
public class Alphabet_Pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  int rows = 3;

	        for (int i = 0; i < rows; i++) {

	            char ch = 'A';

	            // Print increasing characters
	            for (int j = 0; j <= i; j++) {
	                System.out.print(ch);
	                ch++;
	            }

	            // Print decreasing characters
	            ch -= 2;
	            for (int j = 0; j < i; j++) {
	                System.out.print(ch);
	                ch--;
	            }

	            System.out.println();
	        }

	}

}

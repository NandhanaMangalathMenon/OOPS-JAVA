// Program to display a right angle triangle with numbers increased by 1
public class Increased_Number_Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  int rows = 3;
	        int number = 1;   // external counter variable

	        for (int i = 1; i <= rows; i++) {

	            for (int j = 1; j <= i; j++) {
	                System.out.print(number + " ");
	                number++;
	            }

	            System.out.println();
	        }

	}

}

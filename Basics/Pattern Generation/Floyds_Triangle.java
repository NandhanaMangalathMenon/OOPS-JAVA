// Program to display Floyd’s Triangle using 0 and 1
public class Floyds_Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int rows = 3;

	        for (int i = 1; i <= rows; i++) {

	            for (int j = 1; j <= i; j++) {

	                if ((i + j) % 2 == 0) {
	                    System.out.print("1");
	                } else {
	                    System.out.print("0");
	                }
	            }

	            System.out.println();
	        }

	}

}

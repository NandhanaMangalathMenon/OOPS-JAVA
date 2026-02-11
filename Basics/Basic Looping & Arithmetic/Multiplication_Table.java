import java.util.Scanner;
public class Multiplication_Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n=sc.nextInt();
		
		
		for(int j=1;j<=10;j++){
			int table=n*j;
			
			System.out.println(n+"X"+j+"="+table);
		}

	}

}

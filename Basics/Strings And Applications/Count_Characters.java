//Program to count the characters
//EOF Program(End Of File)
//EOF tells the program: stop reading input

import java.util.Scanner;
public class Count_Characters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		int count=0;
		
		while(sc.hasNext()) {
			
			String s=sc.next(); //Reads one word from input;Stops at space or newline
			count+= s.length();
			
		}
		
		System.out.println(count);
		sc.close();

	}

}

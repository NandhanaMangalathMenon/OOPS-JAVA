// Program to classify and count uppercase, lowercase, and other characters.


import java.util.Scanner;
public class Character_Classifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

        int upper = 0;
        int lower = 0;
        int other = 0;

        String s = sc.nextLine();   // Reads entire input line (including spaces)

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isUpperCase(ch)) {
                upper++;
            } else if (Character.isLowerCase(ch)) {
                lower++;
            } else {
                other++;
            }
        }

        System.out.println("Uppercase: " + upper);
        System.out.println("Lowercase: " + lower);
        System.out.println("Other: " + other);

        sc.close();

	}

}

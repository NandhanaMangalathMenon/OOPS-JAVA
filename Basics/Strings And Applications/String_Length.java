// This program finds the length of a string without using any library length function
public class String_Length {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

        String text = "welcome";   // given test data
        int count = 0;             // variable to count characters

        // converting string to character array
        char[] letters = text.toCharArray();

        // counting characters manually
        for (char c : letters) {
            count++;
        }

        System.out.println(count);   // prints 7

	}

}

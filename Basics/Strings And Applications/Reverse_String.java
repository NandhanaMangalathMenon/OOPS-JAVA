// This program reverses a given string using charAt() and a reverse for loop
public class Reverse_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 String word = "Welcome";   // given test data
	        String reversed = "";      // empty string to store result

	        // loop runs from last character to first
	        for (int i = word.length() - 1; i >= 0; i--) {
	            reversed = reversed + word.charAt(i);
	        }

	        System.out.println(reversed);   // prints emocleW

	}

}

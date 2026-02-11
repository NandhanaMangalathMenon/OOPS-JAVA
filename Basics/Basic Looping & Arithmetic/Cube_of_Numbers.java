import java.util.Scanner;

public class Cube_of_Numbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        int cube = n * n * n;

        System.out.println("The cube of the given number is " + cube);

        sc.close();
    }
}

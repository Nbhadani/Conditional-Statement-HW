
import java.util.Scanner; // Scanner Class gets the user input

public class OddEven {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in); // Creates an instance of the Scanner and reads the input

        System.out.print("Number Naakho: ");
        int n = reader.nextInt(); // Reads the input number and stores it in variable num
        String OE = ( n % 2 == 0) ? "Beki Number" : "Ekki Number"; // Replaced if else with Turnery operator ( ? : )

        System.out.println( n + " is a " + OE);

    }

}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OddEven {
    public static void main(String[] args) throws IOException {
        // Create a BufferedReader to read input from the user
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Ask the user to input the number of elements
        System.out.println("Enter the number of input elements:");
        // Parse the input as an integer
        int size = Integer.parseInt(br.readLine());

        // Declare arrays to store input, even numbers, and odd numbers
        double[] inputArray = new double[size];
        double[] even = new double[size];
        double[] odd = new double[size];

        // Ask the user to input the elements separated by space
        System.out.println("Enter the elements separated by space:");

        // Read the input line, trim leading/trailing spaces, and split it into an array of strings
        String[] input = br.readLine().trim().split("\\s+");

        // Process input and populate arrays
        for (int i = 0; i < size; i++) {
            // Convert each element to a double and store it in the inputArray
            inputArray[i] = Double.parseDouble(input[i]);

            // Check if the number is even or odd and move it to the respective array
            if (inputArray[i] % 2 == 0) {
                even[i] = inputArray[i];
            } else {
                odd[i] = inputArray[i];
            }
        }

        // Print the even numbers
        System.out.println("\nEven numbers:");
        for (double value : even) {
            // Print the value if it is not 0 (avoid printing uninitialized elements)
            if (value != 0) {
                System.out.print(value + " ");
            }
        }

        // Print the odd numbers
        System.out.println("\nOdd numbers:");
        for (double value : odd) {
            // Print the value if it is not 0 (avoid printing uninitialized elements)
            if (value != 0) {
                System.out.print(value + " ");
            }
        }
    }
}

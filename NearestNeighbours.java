
public class NearestNeighbours {

        // Function to find the index of the first number among two neighboring numbers with the smallest distance
        public static int findNearestNeighboursIndex(int[] array) {
            // Check if the array has at least two elements
            if (array == null || array.length < 2) {
                throw new IllegalArgumentException("Array must have at least two elements");
            }

            // Initialize variables to store the minimum distance and the corresponding index
            int minDistance = Integer.MAX_VALUE;
            int minIndex = -1;

            // Iterate through the array to find the minimum distance between neighboring numbers
            for (int i = 0; i < array.length - 1; i++) {
                // Calculate the distance between neighboring numbers
                int distance = Math.abs(array[i] - array[i + 1]);

                // Check if the current distance is smaller than the minimum distance
                if (distance < minDistance) {
                    // Update the minimum distance and corresponding index
                    minDistance = distance;
                    minIndex = i;
                }
            }

            // Return the index of the first number among the two neighboring numbers with the smallest distance
            return minIndex;
        }

        public static void main(String[] args) {
            // Example usage
            int[] numbers = {5, 9, 2, 15, 7, 10};
            int resultIndex = findNearestNeighboursIndex(numbers);

            // Display the result
            System.out.println("Index of the first number among the nearest neighbors: " + resultIndex);
        }
    }



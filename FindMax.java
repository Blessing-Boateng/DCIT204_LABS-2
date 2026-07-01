import java.util.Scanner;

public class FindMaximum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Get the number of elements
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        // Step 2: Create the array
        int[] array = new int[n];

        // Step 3: Prompt for each element
        System.out.println("Enter " + n + " integer values:");
        for (int i = 0; i < n; i++) {
            System.out.print("Element [" + i + "]: ");
            array[i] = scanner.nextInt();
        }

        // Step 4: Search for the maximum value and its index
        int maxValue = array[0];
        int maxIndex = 0;

        for (int i = 1; i < n; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
                maxIndex = i;
            }
        }

        // Step 5: Display results
        System.out.println("\n--- Results ---");
        System.out.println("Array entered: " + java.util.Arrays.toString(array));
        System.out.println("Maximum value: " + maxValue);
        System.out.println("Found at index: " + maxIndex);

        scanner.close();
    }
}

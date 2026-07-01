import java.util.Scanner;

public class PairSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Get array size
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        // Step 2: Create and fill the array
        int[] array = new int[n];
        System.out.println("Enter " + n + " integer values:");
        for (int i = 0; i < n; i++) {
            System.out.print("Element [" + i + "]: ");
            array[i] = scanner.nextInt();
        }

        // Step 3: Get the target sum
        System.out.print("Enter the Target Sum: ");
        int target = scanner.nextInt();

        // Step 4: Brute force nested loop search
        boolean found = false;

        for (int i = 0; i < n && !found; i++) {
            for (int j = i + 1; j < n; j++) {
                if (array[i] + array[j] == target) {
                    // Step 5: Display the result
                    System.out.println("\n--- Result ---");
                    System.out.println("Pair found at indices [" + i + "] and [" + j + "]");
                    System.out.println("Values: " + array[i] + " and " + array[j]);
                    System.out.println("Equation: " + array[i] + " + " + array[j] + " = " + target);
                    found = true;
                    break;
                }
            }
        }

        // Step 6: No pair found
        if (!found) {
            System.out.println("\nNo pair found that sums to " + target + ".");
        }

        scanner.close();
    }
}

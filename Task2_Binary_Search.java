/*
Description: Modified recursive Binary Search program that accepts
user input for the number of elements, array elements, and target.
The array is sorted in ascending order before searching. The program
also displays the recursive execution trace and returns the target
index or -1 if the target is not found.

Programmed by: Jeremie C. Cullo IT CN: 48086 Data Structures and Algorithms

Last Modified: September 11, 2026

Version: 1.0

Acknowledgements: OpenAI ChatGPT was used as a learning and assistance
 tool to understand and modify the professor-provided recursive Binary
 Search program. The output format was adjusted to match the required
 laboratory output format.
*/

import java.util.Arrays;
import java.util.Scanner;

public class Task2_Binary_Search {

    public static int bSearch(int[] arr, int target, int low, int high) {

        // Display every recursive call
        System.out.println("bSearch(" + low + ", " + high + ", " + target + ")");

        // Base case: target is not found
        if (low > high) {
            return -1;
        }

        // Find the middle index
        int mid = low + (high - low) / 2;

        // Base case: target is found at the middle
        if (arr[mid] == target) {
            return mid;
        }

        // If target is smaller, search the left half
        if (target < arr[mid]) {
            return bSearch(arr, target, low, mid - 1);
        }

        // Otherwise, search the right half
        return bSearch(arr, target, mid + 1, high);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Number of elements: ");
        int n = input.nextInt();

        int[] numbers = new int[n];

        System.out.println("Array:");
        for (int i = 0; i < n; i++) {
            numbers[i] = input.nextInt();
        }

        System.out.print("Target: ");
        int target = input.nextInt();

        // Binary Search requires ascending order
        Arrays.sort(numbers);

        System.out.print("Sorted array: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
            if (i < numbers.length - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();

        System.out.println();
        System.out.println("--- Execution Trace ---");

        int result = bSearch(numbers, target, 0, numbers.length - 1);

        System.out.println();
        System.out.println("--- Result ---");

        if (result == -1) {
            System.out.println("Target not found.");
            System.out.println("Index: -1");
        } else {
            System.out.println("Target found at index: " + result);
        }

        input.close();
    }
}

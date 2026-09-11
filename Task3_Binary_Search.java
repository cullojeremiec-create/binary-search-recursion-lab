/*
Description: Task 3 version of the modified recursive Binary Search program.
It accepts user input, sorts the array in ascending order, and displays
low, high, mid, and array[mid] during every recursive call.

Programmed by: Jeremie C. Cullo IT CN: 48086 Data Structures and Algorithms

Last Modified: September 11, 2026

Version: 1.0

Acknowledgements: OpenAI ChatGPT was used as a learning and assistance
tool to understand and modify the professor-provided recursive Binary
Search program and prepare the search trace.
*/

import java.util.Arrays;
import java.util.Scanner;

public class Task3_Binary_Search {

    public static int bSearch(int[] arr, int target, int low, int high) {

        System.out.println("bSearch(" + low + ", " + high + ", " + target + ")");

        if (low > high) {
            return -1;
        }

        int mid = low + (high - low) / 2;

        System.out.println("low = " + low
                + ", high = " + high
                + ", mid = " + mid
                + ", array[mid] = " + arr[mid]);

        if (arr[mid] == target) {
            return mid;
        }

        if (target < arr[mid]) {
            return bSearch(arr, target, low, mid - 1);
        }

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

        int result = bSearch(
                numbers,
                target,
                0,
                numbers.length - 1
        );

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

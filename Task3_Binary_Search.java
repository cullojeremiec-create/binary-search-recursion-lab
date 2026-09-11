/*
Description: Recursive Binary Search program with a search trace that
displays low, high, and mid during every recursive call.

Programmed by: Jeremie C. Cullo IT CN: 48086 Data Structures and Algorithms

Last Modified: September 11, 2026

Version: 1.0

Acknowledgements: OpenAI ChatGPT was used as a learning and assistance
tool to understand and modify the professor-provided recursive Binary
Search program.
*/

import java.util.Arrays;
import java.util.Scanner;

public class Task3_Binary_Search {

    public static int bSearch(int[] arr, int target, int low, int high) {

        System.out.println("binarySearch(" + low + ", " + high + ", " + target + ")");

        if (low > high) {
            return -1;
        }

        int mid = low + (high - low) / 2;

        System.out.println("low = " + low
                + ", high = " + high
                + ", mid = " + mid);

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

        System.out.print("Enter number of elements: ");
        int n = input.nextInt();

        int[] numbers = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            numbers[i] = input.nextInt();
        }

        Arrays.sort(numbers);

        System.out.println("Sorted array: " + Arrays.toString(numbers));

        System.out.print("Enter target value: ");
        int target = input.nextInt();

        int result = bSearch(numbers, target, 0, numbers.length - 1);

        if (result == -1) {
            System.out.println("Element not found.");
            System.out.println("Index: -1");
        } else {
            System.out.println("Element found at index: " + result);
        }

        input.close();
    }
}

# Laboratory Activity: Recursion

## Binary Search

This repository contains the modified Java programs for Tasks 2, 3, and 4 of the Recursion laboratory activity. The programs are based on the professor-provided recursive Binary Search program.

## Files

### Task2_Binary_Search.java
Modified to accept:
1. Number of elements
2. Array elements
3. Target value

The array is sorted in ascending order before recursive Binary Search is performed. The program displays the target index if found, or `-1` if not found.

### Task3_Binary_Search.java
Contains the Task 2 modifications and adds a search trace. During every recursive call, the program displays:
- `low`
- `high`
- `mid`

This shows how the search interval becomes smaller.

Example:
```text
binarySearch(0, 6, 50)
low = 0, high = 6, mid = 3
binarySearch(4, 6, 50)
low = 4, high = 6, mid = 5
binarySearch(4, 4, 50)
low = 4, high = 4, mid = 4
```

### Task4_Binary_Search.java
This is the final version demonstrating the recursive return logic.

When the target is found:
```java
if (arr[mid] == target) {
    return mid;
}
```

When the search range becomes invalid:
```java
if (low > high) {
    return -1;
}
```

The recursive calls use `return`, which passes the result from the deeper recursive call back to the previous call until the result reaches `main()`.

## Programming Language

Java

## How to Run

1. Open an online Java compiler.
2. Copy one task file into the editor.
3. Make sure the class name matches the file name.
4. Run the program.
5. Enter the number of elements.
6. Enter the array elements.
7. Enter the target value.
8. View the search result and trace.

## Sample Input

```text
Enter number of elements: 7
Enter 7 elements:
10
20
30
40
50
60
70
Enter target value: 50
```

## Sample Output

```text
Sorted array: [10, 20, 30, 40, 50, 60, 70]
binarySearch(0, 6, 50)
low = 0, high = 6, mid = 3
binarySearch(4, 6, 50)
low = 4, high = 6, mid = 5
binarySearch(4, 4, 50)
low = 4, high = 4, mid = 4
Element found at index: 4
```

## Not Found Example

If the target is `25`:

```text
Element not found.
Index: -1
```

## AI Disclosure

Generative AI (OpenAI ChatGPT) was used as a learning and assistance tool to understand and modify the professor-provided recursive Binary Search program, including user input, recursion tracing, return values, and documentation.

The student is responsible for reviewing, testing, understanding, and being able to explain the submitted source code.

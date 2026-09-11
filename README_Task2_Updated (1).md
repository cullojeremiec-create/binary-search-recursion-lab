# Task 2 – Modified Binary Search Program

## Description

This program is the Task 2 modification of the professor-provided recursive Binary Search program.

The program accepts:
1. The number of elements in the array.
2. The elements of the array.
3. The target value.

The array is sorted in ascending order before the recursive Binary Search is performed. The program displays each recursive call and then displays the target index if the target is found. If the target is not found, it displays `-1`.

## Programming Language

Java

## Source Code

`Task2_Binary_Search.java`

## How to Run

1. Open an online Java compiler.
2. Copy `Task2_Binary_Search.java` into the editor.
3. Make sure the class name matches the file name.
4. Run the program.
5. Enter the number of elements.
6. Enter the array elements.
7. Enter the target value.
8. The program sorts the array in ascending order.
9. The program displays the recursive search calls.
10. The program displays the search result and index.

## Sample Input

The following sample follows the output format used for Task 2:

```text
Number of elements: 5
Array:
10
20
30
40
50
Target: 25
```

## Sample Output

```text
Sorted array: 10 20 30 40 50

--- Execution Trace ---
bSearch(0, 4, 25)
bSearch(0, 1, 25)
bSearch(1, 1, 25)
bSearch(2, 1, 25)

--- Result ---
Target not found.
Index: -1
```

## Successful Search Example

For target `30`, the result would be:

```text
--- Result ---
Target found at index: 2
```

## AI Disclosure

Generative AI (OpenAI ChatGPT) was used as a learning and assistance tool to understand and modify the professor-provided recursive Binary Search program, including user input, recursive search behavior, output formatting, and documentation. The student reviewed and understood the submitted source code.

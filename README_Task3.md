# Task 3 – Recursive Binary Search Search Trace

## Description

This program is the Task 3 modification of the recursive Binary Search program.

It includes the Task 2 requirements and additionally displays the values of `low`, `high`, and `mid` during every recursive call. The trace shows how the search interval becomes smaller after each recursive call.

## Programming Language

Java

## Source Code

`Task3_Binary_Search.java`

## How It Works

For every recursive call, the program displays:

- `low` – beginning of the current search range
- `high` – end of the current search range
- `mid` – middle index of the current search range

Example:

```text
binarySearch(0, 6, 50)
low = 0, high = 6, mid = 3

binarySearch(4, 6, 50)
low = 4, high = 6, mid = 5

binarySearch(4, 4, 50)
low = 4, high = 4, mid = 4
```

This demonstrates the shrinking search interval required for recursive Binary Search.

## How to Run

1. Open an online Java compiler.
2. Copy `Task3_Binary_Search.java` into the editor.
3. Make sure the class name matches the file name.
4. Run the program.
5. Enter the number of elements.
6. Enter the array elements.
7. Enter the target value.
8. Observe the recursive search trace and result.

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

## AI Disclosure

Generative AI (OpenAI ChatGPT) was used as a learning and assistance tool to understand and modify the professor-provided recursive Binary Search program and to understand recursion tracing.

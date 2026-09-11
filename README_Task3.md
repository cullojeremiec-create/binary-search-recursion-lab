# Task 3 – Search Trace

## Description

This program is based on the updated Task 2 Binary Search program.

For Task 3, the program displays the recursive search trace during every
call. It shows `low`, `high`, `mid`, and `array[mid]` so the shrinking
search interval can be observed.

## Programming Language

Java

## Source Code

`Task3_Binary_Search.java`

## How to Run

1. Open an online Java compiler.
2. Copy `Task3_Binary_Search.java` into the editor.
3. Make sure the class name matches the file name.
4. Run the program.
5. Enter the number of elements.
6. Enter the array elements.
7. Enter the target value.
8. Observe the recursive search trace.
9. Check the final result.

## Sample Input

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
low = 0, high = 4, mid = 2, array[mid] = 30
bSearch(0, 1, 25)
low = 0, high = 1, mid = 0, array[mid] = 10
bSearch(1, 1, 25)
low = 1, high = 1, mid = 1, array[mid] = 20
bSearch(2, 1, 25)

--- Result ---
Target not found.
Index: -1
```

## AI Disclosure

Generative AI (OpenAI ChatGPT) was used as a learning and assistance
tool to understand and modify the professor-provided recursive Binary
Search program and prepare the search trace. The student reviewed and
understood the submitted source code.

# Task 4 – Recursive Binary Search Return Logic

## Description

This program is based on the updated Task 2 Binary Search program.

Task 4 demonstrates how recursive Binary Search returns the target index
when the target is found and `-1` when the target is not found.

## Programming Language

Java

## Source Code

`Task4_Binary_Search.java`

## How to Run

1. Open an online Java compiler.
2. Copy `Task4_Binary_Search.java` into the editor.
3. Make sure the class name matches the file name.
4. Run the program.
5. Enter the number of elements.
6. Enter the array elements.
7. Enter the target value.
8. Check the final result.

## Return Logic

### 1. Base case when the target is found

```java
if (arr[mid] == target) {
    return mid;
}
```

This returns the index where the target was found.

### 2. Base case when the target is not found

```java
if (low > high) {
    return -1;
}
```

This happens when there are no elements left to search.

### 3. Recursive call passes the result back

```java
return bSearch(arr, target, low, mid - 1);
```

or:

```java
return bSearch(arr, target, mid + 1, high);
```

The recursive call returns either the found index or `-1`. The `return`
statement passes that value back through the previous recursive calls
until it reaches `main`.

## Sample Input

```text
Number of elements: 5
Array:
10
20
30
40
50
Target: 30
```

## Sample Output

```text
Sorted array: 10 20 30 40 50

--- Execution Trace ---
bSearch(0, 4, 30)
low = 0, high = 4, mid = 2, array[mid] = 30

--- Result ---
Target found at index: 2
```

## If the Target Is Not Found

For target `25`, the program displays:

```text
--- Result ---
Target not found.
Index: -1
```

## AI Disclosure

Generative AI (OpenAI ChatGPT) was used as a learning and assistance
tool to understand and explain the recursive return logic of the
professor-provided Binary Search program. The student reviewed and
understood the submitted source code.

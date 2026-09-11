# Task 4 – Recursive Binary Search Return Logic

## Description

This program is the Task 4 final modification of the recursive Binary Search program. It demonstrates how the recursive function returns the target index when the target is found and returns `-1` when the target is not found.

## Programming Language

Java

## Source Code

`Task4_Binary_Search.java`

## Return Logic

### 1. Base Case – Target Found

```java
if (arr[mid] == target) {
    return mid;
}
```

The function returns `mid`, which is the index where the target was found.

### 2. Base Case – Target Not Found

```java
if (low > high) {
    return -1;
}
```

When `low` becomes greater than `high`, there are no more elements to search, so the function returns `-1`.

### 3. Passing the Result Back

The recursive calls use `return`:

```java
return bSearch(arr, target, low, mid - 1);
```

or:

```java
return bSearch(arr, target, mid + 1, high);
```

The result from the deeper recursive call is passed back through the previous calls until it reaches the `main()` method.

## How to Run

1. Open an online Java compiler.
2. Copy `Task4_Binary_Search.java` into the editor.
3. Make sure the class name matches the file name.
4. Run the program.
5. Enter the number of elements.
6. Enter the array elements.
7. Enter the target value.
8. Check the returned index.

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

For target `25`:

```text
Element not found.
Index: -1
```

## AI Disclosure

Generative AI (OpenAI ChatGPT) was used as a learning and assistance tool to understand and modify the professor-provided recursive Binary Search program, including return values and recursive search logic.

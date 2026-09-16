# Number Search Demo

This Java program demonstrates the search functionality for numbers using both the Binary Search and Sequential Search algorithms. The program reads numbers from a file, sorts them using the Bubble Sort algorithm, and then allows users to search for a specific number using either search method.

## ControllerDemo Class

### User Interaction

The `ControllerDemo` class is responsible for user interaction. It prompts the user to enter a number for both Binary Search and Sequential Search. It then invokes the respective search methods from the `NumberController` class and displays whether the number is found or not.

### Sample Usage

```java
Enter a number to search with Binary Search algorithm: 25
Number 25 is searching with Binary Search algorithm...
Binary Search result: Found

Enter another number to search with Sequential Search algorithm: 42
Number 42 is searching with Sequential Search algorithm...
Binary Search result: Not Found
```

## NumberController Class ##

### Constructor
The NumberController class initializes an array of 20 integers by reading them from a file specified in the constructor. It uses the Bubble Sort algorithm to ensure the numbers are sorted in ascending order.

### Bubble Sort
The bubbleSort method is a static method that implements the Bubble Sort algorithm to sort an array of integers.

### Binary Search
The searchBinary method searches for a specified number in the sorted array using the Binary Search algorithm. It returns true if the number is found and false otherwise.

### Sequential Search
The searchSequential method searches for a specified number in the array using the Sequential Search algorithm. It returns true if the number is found and false otherwise.


## How to Use

1-Compile both classes (ControllerDemo and NumberController).
2-Run the compiled ControllerDemo class.
3-Enter a number for Binary Search and Sequential Search when prompted.
4-Observe the results of each search.
5-Feel free to explore and adapt this code for your own projects or educational purposes!

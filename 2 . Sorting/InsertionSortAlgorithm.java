import java.util.*;
public class InsertionSortAlgorithm {

    public static void insertionSort(int[] arr) {
        int n = arr.length;
        
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            
            // Move elements of arr[0..i-1] that are greater than key
            // to one position ahead of their current position
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            
            // Place the key at its correct position
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("Original Array:");
        printArray(arr);

        insertionSort(arr);

        System.out.println("\nSorted Array:");
        printArray(arr);
    }

    public static void printArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

/*
Explanation:

insertionSort Method:

The insertionSort method takes an integer array arr as input and sorts it in-place using the Insertion Sort algorithm.
It starts by initializing a variable n with the length of the input array arr.
The outer loop, with i starting from 1, iterates through the elements of the array.
Inside the loop, the current element arr[i] is stored in the key variable.
The inner loop, with j initially set to i - 1, moves elements greater than the key to one position ahead of their current position.
The while loop continues as long as j is greater than or equal to 0 and the element at arr[j] is greater than the key. During each iteration, it shifts elements to the right.
Finally, the key is placed in its correct sorted position in the array.
main Method:

In the main method, an example integer array arr is created with unsorted values.
The original array is printed using the printArray method.
The insertionSort method is called to sort the array.
The sorted array is printed again using the printArray method to display the result.
printArray Method:

The printArray method takes an integer array arr as input and prints its elements on a single line, separated by spaces.
When you run the program, it will output the original unsorted array, perform the Insertion Sort algorithm on it, and then display the sorted array as the final result. Insertion Sort builds the sorted array one element at a time by inserting each unsorted element into its correct position among the sorted elements. 
*/
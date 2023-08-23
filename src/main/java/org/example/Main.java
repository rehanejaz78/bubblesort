package org.example;

public class Main {
    public static void printArray ( int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
//11 12 22 25 34 64 90

    public static void bubbleSort ( int[] arr){
        int length = arr.length;
        boolean swapped = false;
        for (int i = 0; i < length; i++)
        {
            for (int j = i + 1; j < length; j++)
            {
                if (arr[j] < arr[i])
                {

                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    swapped = true;
                }
            }
            // If no two elements were swapped in the inner loop, the array is already sorted
            if (!swapped) {
                break;
            }
        }
    }

    public static void main(String[] args) {




        int[] unsortedArray = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("Unsorted array: ");
        printArray(unsortedArray);

        // Sort the array in ascending order using Bubble Sort
        bubbleSort(unsortedArray);

        System.out.println("Sorted array: ");
        printArray(unsortedArray);




    }

}


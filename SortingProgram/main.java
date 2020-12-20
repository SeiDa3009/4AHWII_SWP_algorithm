import models.*;

import java.util.Arrays;

//Ausgabe
public class main {
    public static void main(String[] args) {
        createArrays arr = new createArrays();
        sortMethods s1 = new sortMethods();
        arr.createArray(arr.getLength());
        System.out.println("\nInsertionsort:");
        System.out.print("Ordered Array: ");
        s1.insertionSort(arr.getOrderedArray());
        System.out.print("Reverse Array: ");
        s1.insertionSort(arr.getReverseArray());
        System.out.print("Random Array: ");
        s1.insertionSort(arr.getRandomArray());
        System.out.println("\nBubblesort: ");
        System.out.print("Ordered Array: ");
        s1.bubbleSort(arr.getOrderedArray());
        System.out.print("Reverse Array: ");
        s1.bubbleSort(arr.getReverseArray());
        System.out.print("Random Array: ");
        s1.bubbleSort(arr.getRandomArray());
    }
}

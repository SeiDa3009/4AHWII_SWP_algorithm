package models;

import java.util.ArrayList;

public class Sorter {
    public static ArrayList<Long> countCompareBubble = new ArrayList<>();
    public static ArrayList<Long> countMoveBubble = new ArrayList<>();
    public static ArrayList<Long> countTimeBubble = new ArrayList<>();
    public static ArrayList<Long> countCompareSelection = new ArrayList<>();
    public static ArrayList<Long> countMoveSelection = new ArrayList<>();
    public static ArrayList<Long> countTimeSelection = new ArrayList<>();
    public static ArrayList<Long> countCompareStable = new ArrayList<>();
    public static ArrayList<Long> countMoveStable = new ArrayList<>();
    public static ArrayList<Long> countTimeStable = new ArrayList<>();
    public static ArrayList<Long> countCompareInsertion = new ArrayList<>();
    public static ArrayList<Long> countMoveInsertion = new ArrayList<>();
    public static ArrayList<Long> countTimeInsertion = new ArrayList<>();
    public static ArrayList<Long> countCompareQuicksort = new ArrayList<>();
    public static ArrayList<Long> countMoveQuicksort = new ArrayList<>();
    public static ArrayList<Long> countCompareQuicksortfinal = new ArrayList<>();
    public static ArrayList<Long> countMoveQuicksortfinal = new ArrayList<>();

    public static void bubbleSort(int[] array) {
        int n;
        long tempc = 0;
        long tempm = 0;
        long tempt = System.nanoTime();


        for (int i = 1; i < array.length; i++) {
            for (int k = 0; k < (array.length - i); k++) {
                if (array[k] > array[k + 1]) {
                    n = array[k];
                    array[k] = array[k + 1];
                    array[k + 1] = n;
                    tempc++;
                }
                tempm++;
            }
        }
        countCompareBubble.add(tempc);
        countMoveBubble.add(tempm);
        countTimeBubble.add(System.nanoTime()-tempt);

    }

    public static void selectionSort(int[] array) {
        int n = array.length;
        long tempc = 0;
        long tempm = 0;
        long tempt = System.nanoTime();
        for (int i = 0; i < n - 1; i++) {
            //kleinstes Element finden
            int min = i;
            for (int j = i + 1; j < n; j++) {
                tempc++;
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            //Verschieben mit dem erst-möglichen Element
            int temp = array[min];
            if(array[min]!=array[i]){
                tempm++;
            }
            array[min] = array[i];
            array[i] = temp;
        }
        countCompareSelection.add(tempc);

        countMoveSelection.add(tempm);
        countTimeSelection.add(System.nanoTime()-tempt);
    }

    public static void stableSelectionSort(int[] array) {
        int n = array.length;
        long tempc = 0;
        long tempm = 0;
        long tempt = System.nanoTime();

        for (int i = 0; i < n; i++) {
            //kleinsten Element finden
            int min = i;
            for (int j = i + 1; j < n; j++) {
                tempc++;
                if (array[min] > array[j]) {
                    min = j;
                }
                //Verschieben
                int key = array[min];
                while (min > i) {
                    tempm++;
                    array[min] = array[min - 1];
                    min--;
                }
                array[i] = key;
            }
        }
        countCompareStable.add(tempc);
        countMoveStable.add(tempm);
        countTimeStable.add(System.nanoTime()-tempt);
    }

    public static void insertionSort(int[] array){
        long tempc = 0;
        long tempm = 0;
        long tempt = System.nanoTime();

        for(int i = 0; i < array.length; i++){
            int key = array[i];
            int j = i-1;
            tempc++;
            while (j >= 0 && array[j] > key){
                tempm++;
                array[j+1] = array[j];
                j = j - 1;
            }
            array[j+1] = key;
        }
        countCompareInsertion.add(tempc);
        countMoveInsertion.add(tempm);
        countTimeInsertion.add(System.nanoTime()-tempt);
    }

    //Quicksort
    public static void quickSort(int[] array, int low, int high){
        long tempc = 0;
        long tempm = 0;
        if(low < high){
            int index = partition(array,low,high);
            quickSort(array,low,index-1);
            quickSort(array,index + 1,high);
        }

    }
    private static int partition(int[] array, int low, int high){
        long tempc = 0;
        long tempm = 0;
        int pivot = array[high];
        int i = (low - 1);
        for(int j = low; j <= high - 1; j++){
            tempc++;
            if(array[j] < pivot){
                i++;
                swap(array, i, j);
                tempm++;
            }
        }
        swap(array,i+1, high);
        tempm++;
        countCompareQuicksort.add(tempc);
        countMoveQuicksort.add(tempm);
        return (i+1);

    }
    private static void swap(int[] array, int i, int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}


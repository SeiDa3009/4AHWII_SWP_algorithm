package models;

//Klasse für die ganzen Suchmethoden
public class sortMethods {
    //Insertionsort mit Binarysearch Einsortierung
    public void insertionSort(int array[]) {
        long start;


        start = System.nanoTime();
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int insertedPosition = binarySearch(array, 0, i - 1, key);
            for (int j = i - 1; j >= insertedPosition; j--) {
                array[j + 1] = array[j];
            }
            array[insertedPosition] = key;
        }

        System.out.println("Time: " + (System.nanoTime()-start) + " Nanosekunden");
    }
    public int binarySearch(int[] array, int start, int end, int key) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (key < array[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }
    //Bubblesort
    public void bubbleSort(int[] array){
        int c;
        long start = System.nanoTime();
        for(int i = 1;i < array.length; i++){
            for(int k = 0; k < (array.length-i); k++){
                if(array[k] > array[k+1]){
                    c = array[k];
                    array[k] = array[k+1];
                    array[k+1] = c;
                }
            }
        }
        System.out.println("Time: " + (System.nanoTime()-start + " Nanosekunden"));
    }

}

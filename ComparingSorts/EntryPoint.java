import models.Methods;
import models.Sorter;

import java.lang.invoke.MethodHandle;
import java.util.*;

public class EntryPoint {

    public static ArrayList<Long> countTimeQuicksort = new ArrayList<>();

    public static void main(String[] args) {
        for(int i = 0; i < 100; i++){
            int[] array = Methods.createArray();
            Sorter.bubbleSort(Methods.copyArray(array));
            Sorter.selectionSort(Methods.copyArray(array));
            Sorter.stableSelectionSort(Methods.copyArray(array));
            Sorter.insertionSort(Methods.copyArray(array));
            long tempt = System.nanoTime();
            Sorter.quickSort(Methods.copyArray(array),0,array.length-1);
            countTimeQuicksort.add(System.nanoTime()-tempt);
        }
        System.out.println("Bubblesort: ");
        Methods.output(Sorter.countCompareBubble, Sorter.countMoveBubble, Sorter.countTimeBubble);
        System.out.println("Selectionsort: ");
        Methods.output(Sorter.countCompareSelection, Sorter.countMoveSelection, Sorter.countTimeSelection);
        System.out.println("Stable-Selectionsort: ");
        Methods.output(Sorter.countCompareStable, Sorter.countMoveStable, Sorter.countTimeStable);
        System.out.println("Insertionsort: ");
        Methods.output(Sorter.countCompareInsertion, Sorter.countMoveInsertion, Sorter.countTimeInsertion);
        System.out.println("Quicksort: ");
        Methods.output(Sorter.countCompareQuicksort, Sorter.countMoveQuicksort, countTimeQuicksort);

    }
}

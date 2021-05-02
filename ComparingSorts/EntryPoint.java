import models.Methods;
import models.Sorter;

import java.lang.invoke.MethodHandle;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EntryPoint {

    public static void main(String[] args) {
        for(int i = 0; i < 100; i++){
            int[] array = Methods.createArray();
            Sorter.bubbleSort(Methods.copyArray(array));
            Sorter.selectionSort(Methods.copyArray(array));
            Sorter.stableSelectionSort(Methods.copyArray(array));
            Sorter.insertionSort(Methods.copyArray(array));
        }
        System.out.println("Bubblesort: ");
        Methods.output(Sorter.countCompareBubble, Sorter.countMoveBubble, Sorter.countTimeBubble);
        System.out.println("Selectionsort: ");
        Methods.output(Sorter.countCompareSelection, Sorter.countMoveSelection, Sorter.countTimeSelection);
        System.out.println("Stable-Selectionsort: ");
        Methods.output(Sorter.countCompareStable, Sorter.countMoveStable, Sorter.countTimeStable);
        System.out.println("Insertionsort: ");
        Methods.output(Sorter.countCompareInsertion, Sorter.countMoveInsertion, Sorter.countTimeInsertion);

    }
}

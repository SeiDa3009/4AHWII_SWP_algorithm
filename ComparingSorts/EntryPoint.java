import models.Methods;

import java.lang.invoke.MethodHandle;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EntryPoint {

    public static void main(String[] args) {
        Methods m = new Methods();
        int temp = 0;
        int tempMove = 0, tempCompare = 0;
        int tempMoveStable = 0, tempCompareStable = 0;

        for(int i = 0; i < 100; i++){
            int intArray[] = m.createArray();
            m.bubbleSort(intArray);
            m.selectionSort(intArray);
            m.stableSelectionSort(m.createArray1());

        }
        sortArrayList(Methods.listCountc);
        sortArrayList(Methods.listCountm);
        sortArrayList(Methods.listCountCompare);
        sortArrayList(Methods.listCountMove);
        sortArrayList(Methods.listCountCompareStable);
        sortArrayList(Methods.listCountMoveStable);
        Output();

        }
    public static void Output(){
        System.out.println("Mittelwerte:");
        System.out.println("Vergleichungen(Bubblesort): " + (Methods.countc/100));
        System.out.println("Verschiebungen(Bubblesort): " + (Methods.countm/100));
        System.out.println("Vergleichungen(Selectionsort): " + (Methods.countCompare/100));
        System.out.println("Verschiebungen(Selectionsort): " + (Methods.countMove/100));
        System.out.println("Vergleichungen(Stable Selectionsort): " + (Methods.countCompareStable/100));
        System.out.println("Verschiebungen(Stable Selectionsort): " + (Methods.countMoveStable/100));
        System.out.println("Median: ");
        System.out.println("Vergleichungen(Bubblesort): " + Methods.listCountc.get(Methods.listCountc.size()/2));
        System.out.println("Verschiebungen(Bubblesort): " + Methods.listCountm.get(Methods.listCountm.size()/2));
        System.out.println("Vergleichungen(Selectionsort): " + Methods.listCountCompare.get(Methods.listCountCompare.size()/2));
        System.out.println("Verschiebungen(Selectionsort): " + Methods.listCountMove.get(Methods.listCountMove.size()/2));
        System.out.println("Vergleichungen(Stable Selectionsort): " + Methods.listCountCompareStable.get(Methods.listCountCompareStable.size()/2));
        System.out.println("Verschiebungen(Stable Selectionsort): " + Methods.listCountMoveStable.get(Methods.listCountMoveStable.size()/2));

    }
    public static void sortArrayList(List<Integer> sortingList){
        Collections.sort(sortingList);
    }
}

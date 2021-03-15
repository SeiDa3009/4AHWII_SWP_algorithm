package models;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

public class Methods {
    public static int countc = 0;
    public static int countm = 0;
    public static int countCompare = 0;
    public static int countMove = 0;
    public static int countCompareStable = 0;
    public static int countMoveStable = 0;
    public static ArrayList<Integer> listCountc = new ArrayList<>();
    public static ArrayList<Integer> listCountm = new ArrayList<>();
    public static ArrayList<Integer> listCountCompare = new ArrayList<>();
    public static ArrayList<Integer> listCountMove = new ArrayList<>();
    public static ArrayList<Integer> listCountCompareStable = new ArrayList<>();
    public static ArrayList<Integer> listCountMoveStable = new ArrayList<>();

    public int[] createArray() {
        int intArray[] = new int[1000];
        Random random = new Random();
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = random.nextInt(100000);
        }
        return intArray;
    }

    public void bubbleSort(int[] array) {
        int n;
        int tempc = 0;
        int tempm = 0;

        for (int i = 1; i < array.length; i++) {
            for (int k = 0; k < (array.length - i); k++) {
                if (array[k] > array[k + 1]) {
                    n = array[k];
                    array[k] = array[k + 1];
                    array[k + 1] = n;
                    countm++;
                    tempc++;
                }
                countc++;
                tempm++;
            }
        }
        listCountc.add(tempc);
        listCountm.add(tempm);
//        System.out.println("Anzahl an Wiederholungen: " + count);
    }

    public void selectionSort(int[] array) {
        int n = array.length;
        int tempc = 0;
        int tempm = 0;
        for (int i = 0; i < n - 1; i++) {
            //kleinstes Element finden
            int min = i;
            for (int j = i + 1; j < n; j++) {
                countCompare++;
                tempc++;
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            //Verschieben mit dem erst-möglichen Element
            int temp = array[min];
            if(array[min]!=array[i]){
                countMove++;
                tempm++;
            }
            array[min] = array[i];
            array[i] = temp;
        }
        listCountCompare.add(tempc);
        listCountMove.add(tempm);
//        System.out.println("Anzahl an Verschiebungen: " + tempm);
//        System.out.println("Anzahl an Vergleichungen: " + countCompare);
    }

    public void stableSelectionSort(int[] array) {
        int n = array.length;
        int tempc = 0;
        int tempm = 0;

        for (int i = 0; i < n; i++) {
            //kleinsten Element finden
            int min = i;
            for (int j = i + 1; j < n; j++) {
                countCompareStable++;
                tempc++;
                if (array[min] > array[j]) {
                    min = j;
                }
                //Verschieben
                int key = array[min];
                while (min > i) {
                    countMoveStable++;
                    tempm++;
                    array[min] = array[min - 1];
                    min--;
                }
                array[i] = key;
            }
        }
        listCountCompareStable.add(tempc);
        listCountMoveStable.add(tempm);
//        System.out.println("Anzahl an Verschiebungen: " + countMove);
//        System.out.println("Anzahl an Vergleichungen: " + countCompare);
    }
}

package models;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Methods {


    public static int[] createArray() {
        int[] intArray = new int[1000];
        Random random = new Random();
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = random.nextInt(100000);
        }
        return intArray;
    }

    public static int[] copyArray(int[] arrayToCopy) {
        int[] array = new int[1000];
        for (int i = 0; i < arrayToCopy.length; i++) {
            array[i] = arrayToCopy[i];
        }
        return array;
    }

    public static void output(List<Long> Comparelist, List<Long> Movelist, List<Long> Timelist){
        System.out.println("Durchschnitt: ");
        System.out.println("Vergleichungen: " + average(Comparelist));
        System.out.println("Verschiebungen: " + average(Movelist));
        System.out.println("Zeit: " + average(Timelist) + " Nanosekunden");
        System.out.println("Median: ");
        System.out.println("Vergleichungen: " + median(Comparelist));
        System.out.println("Verschiebungen: " + median(Movelist));
//        System.out.println("Zeit: " + median(Timelist) + " Nanosekunden");
        System.out.println(" ");

    }

    public static long average(List<Long> list){
        long temp = 0;
        for (int i = 0; i < list.size(); i++){
            temp = temp + list.get(i);
        }
        return (temp/list.size());
    }

    private static void sortArrayList(List<Long> sortingList) {
        Collections.sort(sortingList);
    }

    public static long median(List<Long> list){
        sortArrayList(list);
        return list.get(list.size()/2);
    }

}
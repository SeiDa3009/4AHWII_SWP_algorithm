package models;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//Klasse für die Erzeugung und Ausgabe von Arrays
public class createArrays {
    public static int length;
    public static int[] orderedArray;
    public static int[] reverseArray;;
    public static int[] randomArray; ;
    public static int[] tempArray;;


    public int getLength(){
        Scanner reader = new Scanner(System.in);
        System.out.print("Array-Length: ");
        length = reader.nextInt();
        return length;
    }
    //Arrays werden erzeugt
    public void createArray(int number){
        Random rd = new Random(length);
        orderedArray = new int[length];
        reverseArray = new int[length];
        randomArray = new int[length];
        tempArray = new int[length];
        int count;
        int temp;

        //Ordered Array erzeugen
        for (int i = 0; i < orderedArray.length; i++){
            orderedArray[i] = i;
            tempArray[i] = i;
        }

        //Random Array erzeugen
        for (int i = 0; i < randomArray.length; i++){
            count = rd.nextInt(tempArray.length-i);
            randomArray[i] = tempArray[count];
            temp = tempArray[tempArray.length-i-1];
            tempArray[tempArray.length-i-1] = tempArray[count];
            tempArray[count] = temp;
        }

        //Reverse Array erzeugen
        count = 0;
        for (int i = reverseArray.length-1; i >= 0; i--){
            reverseArray[count] = i;
            count++;
        }


        //Test-Ausgabe
        System.out.println("Ordered Array: " + Arrays.toString(orderedArray));
        System.out.println("Reverse Array: " + Arrays.toString(reverseArray));
        System.out.println("Random Array: " + Arrays.toString(randomArray));

    }
    //Ausgabe Methoden
    public int[] getOrderedArray(){
        return orderedArray;
    }
    public int[] getReverseArray(){
        return reverseArray;
    }
    public int[] getRandomArray(){
        return randomArray;
    }
}

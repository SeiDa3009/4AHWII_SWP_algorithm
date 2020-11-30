package models;


import java.util.Random;
import java.util.Scanner;

public class bubbleSortMethods {


    public int[] sortArray(int[] numbers){
        int c;
        for(int i = 1;i < numbers.length; i++){
            for(int k = 0; k < (numbers.length-i); k++){
                if(numbers[k] > numbers[k+1]){
                    c = numbers[k];
                    numbers[k] = numbers[k+1];
                    numbers[k+1] = c;
                }
            }
        }
        return numbers;
    }

    public int ArrayLength(){
        Scanner reader = new Scanner(System.in);
        System.out.print("Geben Sie bitte einen Wert für die Arraylänge ein: ");
        return reader.nextInt();
    }
    public int[] createRandomArray(int arrayLength){
        Random rd = new Random();
        int[] numbers = new int[arrayLength];
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = rd.nextInt();
        }
        return numbers;
    }
}

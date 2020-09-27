import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BinarySearchMain {

    public static Scanner reader = new Scanner(System.in);


    public static void main(String[] args) {
        Random number = new Random();
        int searchedNumber;
        long searchTimeSequential, searchTimeBinary;
        int randomLimiter = 101;
        int[] numbers = new int[100];
        for (int i = 0; i < numbers.length; i++){

            numbers[i] = number.nextInt(randomLimiter);
        }

        Arrays.sort(numbers);
        //Ausgabe Array-Zahlen:
        //for (int i = 0; i < numbers.length; i++){System.out.println(numbers[i] + "\n");}

        System.out.print("What number are u looking for?: ");
        searchedNumber = reader.nextInt();

        searchTimeSequential = System.currentTimeMillis();
        System.out.println("\nSequentialSearch:");
        System.out.println("The number was found: " + sequentialSearch(numbers, searchedNumber));
        System.out.println("Search time was: " + (System.currentTimeMillis() - searchTimeSequential) + "ms");

        searchTimeBinary = System.currentTimeMillis();
        System.out.println("\nBinary Search:");
        System.out.println("The number was found: " + binarySearch(numbers,searchedNumber));
        System.out.println("Search time was: " + (System.currentTimeMillis() - searchTimeBinary) + "ms");


    }
    public static boolean binarySearch(int[] numbers, int searchedNumber){
        int low = 0;
        int high = numbers.length-1;
        int count = 0;


        for(int i = 0; i < log2(numbers.length); i++) {
            count++;
            if(low > high){
                return false;
            }
            int mid = (low + high)/2;
            if (numbers[mid] < searchedNumber) {
                low = mid + 1;
            }
            if(numbers[mid] > searchedNumber){
                high = mid - 1;
            }
            if(numbers[mid] == searchedNumber){
                System.out.println("Try's: " + count);
                return true;
            }
        }
        return false;
    }
    public static boolean sequentialSearch(int[] numbers, int searchedNumber){
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] == (searchedNumber)){
                return true;
            }
        }
        return false;
    }
    public static int log2(int randomLimiter){

        int result = (int) (Math.log(randomLimiter) / Math.log(2));
        return result;

    }
}

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



        //Ausgabe Array-Zahlen:
        //for (int i = 0; i < numbers.length; i++){System.out.println(numbers[i] + "\n");}

        System.out.print("Array-Length?: ");
        int range = reader.nextInt();
        int[] numbers = new int[range];

        for (int i = 0; i < numbers.length; i++){

            numbers[i] = i;
        }

        Arrays.sort(numbers);
        Random random = new Random();
        searchedNumber = random.nextInt(range);

        System.out.println("Search Number: " + searchedNumber);

        searchTimeSequential = System.currentTimeMillis();
        System.out.println("\nSequentialSearch:");
        System.out.println("The number was found: " + sequentialSearch(numbers, searchedNumber));
        int timesearchedS =  (int) (System.currentTimeMillis() - searchTimeSequential);
        System.out.println("Search time was: " + (timesearchedS) + "ms");


        searchTimeBinary = System.currentTimeMillis();
        System.out.println("\nBinary Search:");
        System.out.println("The number was found: " + binarySearch(numbers,searchedNumber));
        int timesearchedB = (int) (System.currentTimeMillis() - searchTimeBinary);
        System.out.println("Search time was: " + (timesearchedB) + "ms");

        if(timesearchedS != 0) {
            System.out.println((timesearchedS / timesearchedB) * 100 + "%");
        }

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

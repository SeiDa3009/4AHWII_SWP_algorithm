import models.*;
import java.lang.*;
public class main {
    public static void main(String[] args) {
        bubbleSortMethods m1 = new bubbleSortMethods();
        int[] numbers = m1.createRandomArray(m1.ArrayLength());
        long time = System.currentTimeMillis();

        m1.sortArray(numbers);
        System.out.println("Hat Millisekunden gebraucht: " + (System.currentTimeMillis()-time));
        System.out.println("Hat Sekunden gebraucht: " + ((System.currentTimeMillis()-time)/1000));

        //Ausgabe
        for(int i = 0; i < numbers.length; i++){
            //System.out.println(m1.sortArray(numbers)[i]);
        }
        m1.getCount();


    }
}

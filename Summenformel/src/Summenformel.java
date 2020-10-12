import java.util.Scanner;

public class Summenformel {
    static Scanner reader = new Scanner(System.in);
    static int n;
    public static void main(String[] args) {
        Summenformel main = new Summenformel();
        main.InputN();
        System.out.println("Rekursion: " + main.Rekursion(n));
        System.out.println("Iterativ: " + main.Iterativ(n));

    }
    private int Rekursion(int n){
        if(n == 1){
            return 1;
        }
        return (n + Rekursion(--n));
    }
    private int Iterativ(int n){
        int sum = 0;
        for (int i = n; i > 0; i--){
            sum += i;
        }
        return sum;
    }
    private void InputN(){
        System.out.print("Number for n: ");
        n = reader.nextInt();
    }
}

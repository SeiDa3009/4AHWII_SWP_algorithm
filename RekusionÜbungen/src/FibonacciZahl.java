import java.util.Scanner;

public class FibonacciZahl {
    //1 Parameter, der angibt wie vielte Fibonacci Zahl ausgerechnet werden soll
    static Scanner reader = new Scanner(System.in);
    static int n;
    public static void main(String[] args) {
        FibonacciZahl main = new FibonacciZahl();
        main.Input();
        main.Output();
    }
    private void Input(){
        System.out.print("Zahl: ");
        n = reader.nextInt();
    }
    private int FibonacciZahl(int n){
        if (n == 1 || n == 2){
            return 1;
        }
        return FibonacciZahl(n-1) + FibonacciZahl(n-2);
    }
    private void Output(){
        System.out.println(FibonacciZahl(n));
    }
    public void Run(){
        System.out.println("Fibonacci rekursiv: ");
        Input();
        Output();
        System.out.println(" ");

    }
}

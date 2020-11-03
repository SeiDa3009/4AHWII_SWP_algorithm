import java.util.Scanner;

public class FiboEndRekursion {
    private static Scanner reader = new Scanner(System.in);
    static int x;

    public static void main(String[] args) {
        FiboEndRekursion main = new FiboEndRekursion();
        main.Run();
    }

    int fab(int x){
        if (x <= 1){
            return x;
        }
        else {
            return fab(x-2) + fab(x-1);
        }

    }

    int fob(int x){
        return fab(x);
    }

    private void Input() {
        System.out.print("Zahl: ");
        x = reader.nextInt();
    }

    private void Output(){
        System.out.println(fab(x));
    }

    public void Run(){
        System.out.println("Fibonacci endrekursiv: ");
        Input();
        Output();
        System.out.println(" ");
    }
}